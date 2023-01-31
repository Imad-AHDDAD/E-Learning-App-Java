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
public class Student extends User {

    private String level;
    private String connected;

    // constructor
    public Student(String level, String connected, String username, String pass, String type, String firstname, String lastname, String address, String port) {
        super(username, pass, type, firstname, lastname, address, port);
        this.level = level;
    }

    // la methode qui retourn tous les students 
    public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE type = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "student");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sql = "SELECT * FROM student WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, resultSet.getString(2));
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    String lev = resultSet2.getString(2);
                    String connected = resultSet2.getString(3);
                    all.add(new Student(lev, connected, resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // la methode qui retourne l'etudiant par le username
    public static Student getStudentByUsername(String user) {
        Student student = null;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                sql = "SELECT * FROM student WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user);
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    String level = resultSet2.getString(2);
                    String connected = resultSet2.getString(3);
                    student = new Student(level, connected, resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return student;
    }

    // la methode qui update un etudiant
    public static int updateStudent(String username, String newUser, String newPass, String firstname, String lastname, String level) {
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

                sql = "UPDATE user SET firstname = ?, lastname = ?, username = ? , pass = ? WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, firstname);
                preparedStatement.setString(2, lastname);
                preparedStatement.setString(3, newUser);
                preparedStatement.setString(4, newPass);
                preparedStatement.setString(5, username);
                c1 = preparedStatement.executeUpdate();

                if (c1 == 1) {
                    sql = "UPDATE student SET level = ?, username = ? WHERE username = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, level);
                    preparedStatement.setString(2, newUser);
                    preparedStatement.setString(3, username);
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

    // la methode qui supprime l'etudiant par le username
    public static int deleteStudentByUsername(String user) {
        int c1 = 0;
        int c2 = 0;
        int result = 0;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "DELETE FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user);
            c1 = preparedStatement.executeUpdate();

            if (c1 == 1) {
                sql = "DELETE FROM student WHERE username = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user);
                c2 = preparedStatement.executeUpdate();
                if (c2 == 1) {
                    result = 1;
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    // la methode qui ajoute un etudiant
    public static int addStudent(String newUser, String newPass, String firstname, String lastname, String level) {
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
                preparedStatement.setString(1, "student");
                preparedStatement.setString(2, newUser);
                preparedStatement.setString(3, newPass);
                preparedStatement.setString(4, firstname);
                preparedStatement.setString(5, lastname);
                c1 = preparedStatement.executeUpdate();

                if (c1 == 1) {
                    sql = "INSERT INTO student VALUES(?,?)";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, newUser);
                    preparedStatement.setString(2, level);
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

    // la methode qui retourn les students par le niveau
    public static ArrayList<Student> getStudentsByLevel(String lev) {
        ArrayList<Student> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE type = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "student");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sql = "SELECT * FROM student WHERE username = ? and level = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, resultSet.getString(2));
                preparedStatement.setString(2, lev);
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    String level = resultSet2.getString(2);
                    String connected = resultSet2.getString(3);
                    all.add(new Student(level, connected, resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // la methode qui change l'etat de l'etudiant
    public static void changeStatus(String status, String username) {
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "UPDATE student SET connected = ? WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, username);

            if (preparedStatement.executeUpdate() == 1) {
                System.out.println(username + " state changed to connected = "+status);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    // la methode qui retourn les students par le niveau
    public static ArrayList<Student> getStudentsConnected() {
        ArrayList<Student> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE type = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "student");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sql = "SELECT * FROM student WHERE username = ? and connected = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, resultSet.getString(2));
                preparedStatement.setString(2, "yes");
                ResultSet resultSet2 = preparedStatement.executeQuery();
                if (resultSet2.next()) {
                    all.add(new Student(resultSet2.getString(2), resultSet2.getString(3), resultSet.getString(2), resultSet.getString(3), resultSet.getString(1), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
                }

            }
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }

    // getters and setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
