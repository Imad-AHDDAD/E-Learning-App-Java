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
import java.util.Date;

/**
 *
 * @author AHDDAD
 */
public class Document {

    private String libelle;
    private String level;
    private String coursename;
    private String date;
    private String path;

    // get all files
    public Document(String libelle, String level, String coursename, String date, String path) {
        this.libelle = libelle;
        this.level = level;
        this.coursename = coursename;
        this.date = date;
        this.path = path;
    }

    // get all files by level and course
    public static ArrayList<Document> getDocumentsByLevelAndCourse(String level , String course) {
        ArrayList<Document> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM document WHERE coursename = ? AND level = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, course);
            preparedStatement.setString(2, level);
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                all.add(new Document(res.getString(1), res.getString(5), res.getString(4), res.getString(2), res.getString(3)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }
    
    // get all files by level
    public static ArrayList<Document> getDocumentsByLevel(String level) {
        ArrayList<Document> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM document WHERE level = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, level);
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                all.add(new Document(res.getString(1), res.getString(5), res.getString(4), res.getString(2), res.getString(3)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return all;
    }
    
    // add new file
    public static int addDocument(String libelle, String level, String coursename, String path) {
        int c = 0;
        String d = new Date().toString();
        
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "insert into document(libelle, date, path, coursename, level) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, libelle);
            preparedStatement.setString(2, d);
            preparedStatement.setString(3, path);
            preparedStatement.setString(4, coursename);
            preparedStatement.setString(5, level);
            c = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return c;
    }
    
    // get path by libelle
    public static String getPath(String lib) {
        String path = "";
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM document WHERE libelle = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lib);
            ResultSet res = preparedStatement.executeQuery();

            if (res.next()) {
                path = res.getString(3);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return path;
    }
    
    
    
    
    
    
    
    // getters and setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
