/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import dbconnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author AHDDAD
 */
public class Teacher extends User {

    private String hasCourses;
    private String totalCourses;

    public Teacher(String hasCourses, String totalCourses, String username, String pass, String type, String firstname, String lastname, String address, String port) {
        super(username, pass, type, firstname, lastname, address, port);
        this.hasCourses = hasCourses;
        this.totalCourses = totalCourses;
    }
    
    

    // la methode qui retourne tous les teachers
    public static ArrayList<Teacher> getAllTeachers() {
        ArrayList<Teacher> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE type = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "teacher");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sql = "SELECT * FROM teacher WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, resultSet.getString(2));
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    String coursesNbr = resultSet2.getString(2);
                    String has = resultSet2.getString(3);
                    all.add(new Teacher(has, coursesNbr, resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // la methode qui supprime teacher par le username
    public static int deleteTeacherByUsername(String user) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int result = 0;
        String hasCourse = Teacher.getTeacherByUsername(user).getHasCourses();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "DELETE FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user);
            c1 = preparedStatement.executeUpdate();

            if (c1 == 1) {
                sql = "DELETE FROM teacher WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user);
                c2 = preparedStatement.executeUpdate();
                if (c2 == 1 && hasCourse.equals("yes")) {
                    sql = "UPDATTE course SET affected = ?, teacher = ? WHERE teacher = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, "no");
                    preparedStatement.setString(2, "");
                    preparedStatement.setString(3, user);
                    c3 = preparedStatement.executeUpdate();

                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (c1 == 1 && c2 == 1 && ((c3 == 1 && hasCourse.equals("yes")) || ((c3 == 0 && hasCourse.equals("no"))))) {
            result = 1;
        }

        return result;
    }

    // la methode qui retourne un teacher par le username
    public static Teacher getTeacherByUsername(String user) {
        Teacher teacher = null;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                sql = "SELECT * FROM teacher WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user);
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    String nbr = resultSet2.getString(2);
                    String has = resultSet2.getString(3);
                    teacher = new Teacher(has, nbr, resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return teacher;
    }

    // la methode qui update un teacher
    public static int updateTeacher(String username, String newUser, String newPass, String firstname, String lastname) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int result = 0;
        try {

            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newUser);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next() && !newUser.equals(username)) {
                result = -100;
            } else {
                sql = "UPDATE user SET firstname = ?, lastname = ?, username = ? , pass = ? WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, firstname);
                preparedStatement.setString(2, lastname);
                preparedStatement.setString(3, newUser);
                preparedStatement.setString(4, newPass);
                preparedStatement.setString(5, username);
                c1 = preparedStatement.executeUpdate();

                if (c1 == 1) {
                    sql = "UPDATE teacher SET username = ? WHERE username = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newUser);
                    preparedStatement.setString(2, username);

                    c2 = preparedStatement.executeUpdate();
                    if (c2 == 1) {

                        Course c = Course.getCourseByTeacher(username);
                        if (c != null) {
                            sql = "UPDATE course SET teacher = ? WHERE teacher = ?";
                            preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setString(1, newUser);
                            preparedStatement.setString(2, username);

                            c3 = preparedStatement.executeUpdate();
                            if (c3 == 1) {
                                result = 1;
                            }
                        } else {
                            result = 1;
                        }
                    } else {
                        result = 0;
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    // la methode qui ajoute un etudiant
    public static int addTeacher(String newUser, String newPass, String firstname, String lastname) {
        int c1 = 0;
        int c2 = 0;
        int result = 0;
        try {
            Connection connection = new DBConnection().getConnection();

            String sql = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newUser);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                result = -100;
            } else {
                sql = "INSERT INTO user(type, username, pass, firstname, lastname) VALUES(?,?,?,?,?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, "teacher");
                preparedStatement.setString(2, newUser);
                preparedStatement.setString(3, newPass);
                preparedStatement.setString(4, firstname);
                preparedStatement.setString(5, lastname);
                c1 = preparedStatement.executeUpdate();

                if (c1 == 1) {
                    sql = "INSERT INTO teacher(username) VALUES(?)";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newUser);
                    c2 = preparedStatement.executeUpdate();
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (c1 == 1 && c2 == 1) {
            result = 1;
        }

        return result;
    }

    // la methode qui retourne tous les teachers qui n'ont pas de cours
    public static ArrayList<Teacher> getAllTeachersWithoutCourse() {
        ArrayList<Teacher> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM teacher WHERE hasCourse = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "no");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Teacher teacher = getTeacherByUsername(resultSet.getString(1));
                all.add(teacher);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // getters and setters
    public String getHasCourses() {
        return hasCourses;
    }

    public void setHasCourses(String hasCourses) {
        this.hasCourses = hasCourses;
    }

    public String getTotalCourses() {
        return totalCourses;
    }

    public void setTotalCourses(String totalCourses) {
        this.totalCourses = totalCourses;
    }

}
