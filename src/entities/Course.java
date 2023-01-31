/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import dbconnection.DBConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author AHDDAD
 */
public class Course {

    private String libelle;
    private String teacher; // tacher username
    private String affected;
    private String level;
    private String status;
    private String address;
    private String port;

    // Constructeur
    public Course(String libelle, String teacher, String affected, String level, String status, String address, String port) {
        this.libelle = libelle;
        this.teacher = teacher;
        this.affected = affected;
        this.level = level;
        this.status = status;
        this.address = address;
        this.port = port;
    }

    // la methode qui retourne le nombre total des cours
    public static int getTotalCourses() {
        int count = 0;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                count++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }

    // la methode qui retourn le nombre total des eleves, profs ou admins
    public static ArrayList<Course> getAllCourses() {
        ArrayList<Course> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                all.add(new Course(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // la methode qui supprime l'etudiant par le username
    public static int deleteCourseByLibelle(String lib) {
        int c1 = 0;
        int c2 = 0;
        int result = 0;
        String isAffected = getCourseByLibelle(lib).getAffected();
        Teacher t = Teacher.getTeacherByUsername(getCourseByLibelle(lib).getTeacher());
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "DELETE FROM course WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lib);
            c1 = preparedStatement.executeUpdate();

            if (c1 == 1 && isAffected.equals("yes")) {
                String user = t.getUsername();
                String nbrCourses = t.getTotalCourses();
                int nbr = Integer.parseInt(nbrCourses);
                int newNbr = nbr - 1;
                String has = "";

                if (newNbr <= 0) {
                    newNbr = 0;
                    has = "no";
                } else {
                    has = "yes";
                }

                String newNbrString = Integer.toString(newNbr);

                sql = "UPDATE teacher SET hasCourse = ?, courses = ? WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, has);
                preparedStatement.setString(2, newNbrString);
                preparedStatement.setString(3, user);
                c2 = preparedStatement.executeUpdate();

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (c1 == 1 && ((c2 == 1 && isAffected.equals("yes")) || (c2 == 0 && isAffected.equals("no")))) {
            result = 1;
        }

        return result;
    }

    // la methode qui retourne le cours par le username
    public static Course getCourseByLibelle(String lib) {
        Course course = null;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lib);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                course = new Course(lib, resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return course;
    }

    // la methode qui update un course
    public static int updateCourse(String lib, String newLib, String newLevel, String newTeacher) {

        int result = 0;
        try {

            Connection connection = new DBConnection().getConnection();

            String sql = "SELECT * FROM course WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newLib);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next() && !lib.equals(newLib)) {
                result = -100; // cad le nom du cours ne peut pas etre dupliqué
            } else {

                if (!newTeacher.equals("")) {
                    sql = "SELECT * FROM course WHERE teacher = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newTeacher);
                    resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        result = -200; // cad le teacher ne peut pas avoir plus d'un cours
                    } else {
                        sql = "UPDATE course SET libelle = ?, teacher = ?, affected = ? , level = ? WHERE libelle = ?";
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, newLib);
                        preparedStatement.setString(2, newTeacher);
                        preparedStatement.setString(3, "yes");
                        preparedStatement.setString(4, newLevel);
                        preparedStatement.setString(5, lib);

                        // update teacher
                        sql = "UPDATE teacher SET hasCourse = ?, courses = ? WHERE username = ?";
                        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
                        preparedStatement2.setString(1, "yes");
                        preparedStatement2.setString(2, "1");
                        preparedStatement2.setString(3, newTeacher);

                        if (preparedStatement.executeUpdate() == 1 && preparedStatement2.executeUpdate() == 1) {
                            result = 1;
                        }
                    }
                } else {
                    sql = "UPDATE course SET libelle = ? , level = ? WHERE libelle = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newLib);
                    preparedStatement.setString(2, newLevel);
                    preparedStatement.setString(3, lib);
                    if (preparedStatement.executeUpdate() == 1) {
                        result = 1;
                    }

                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    // la methode qui update un course
    public static int addCourse(String newLib, String newLevel, String newTeacher) {

        int result = 0;
        try {

            Connection connection = new DBConnection().getConnection();

            String sql = "SELECT * FROM course WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newLib);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                result = -100; // cad le nom du cours ne peut pas etre dupliqué
            } else {

                if (!newTeacher.equals("")) {
                    sql = "SELECT * FROM course WHERE teacher = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newTeacher);
                    resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {
                        result = -200; // cad le teacher ne peut pas avoir plus d'un cours
                    } else {
                        sql = "INSERT INTO Ccourse(libelle,teacher,affeceted,level) VALUES(?,?,?,?)";
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, newLib);
                        preparedStatement.setString(2, newTeacher);
                        preparedStatement.setString(3, "yes");
                        preparedStatement.setString(4, newLevel);

                        // update teacher
                        sql = "UPDATE teacher SET hasCourse = ?, courses = ? WHERE username = ?";
                        PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
                        preparedStatement2.setString(1, "yes");
                        preparedStatement2.setString(2, "1");
                        preparedStatement2.setString(3, newTeacher);

                        if (preparedStatement.executeUpdate() == 1 && preparedStatement2.executeUpdate() == 1) {
                            result = 1;
                        }
                    }
                } else {
                    sql = "INSERT INTO course(libelle,affected,level) VALUES(?,?,?)";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newLib);
                    preparedStatement.setString(2, "no");
                    preparedStatement.setString(3, newLevel);
                    if (preparedStatement.executeUpdate() == 1) {
                        result = 1;
                    }

                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    // la methode qui retourne les cours d'un niveau
    public static ArrayList<Course> getCourseByLevel(String level) {
        ArrayList<Course> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course WHERE level = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, level);
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                all.add(new Course(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return all;
    }

    // la methode qui retourne un cours avec le username du prof
    public static Course getCourseByTeacher(String user) {
        Course course = null;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course WHERE teacher = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                course = new Course(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return course;
    }

    // la methode qui change l'etat d'un cours
    public static int changeStatusCourse(String status , String label) {
        int res = 0;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "UPDATE course SET status = ? WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, label);
            
            if(preparedStatement.executeUpdate() == 1){
                res = 1;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return res;
    }
    
    
    // la methode qui retourne le cours par le port
    public static Course getCourseByPort(String port) {
        Course course = null;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM course WHERE port = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, port);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                course = new Course(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return course;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    // getters and setters
    public void setPort(String port) {
        this.port = port;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAffected() {
        return affected;
    }

    public void setAffected(String affected) {
        this.affected = affected;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
