/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import GUI.DashboardStudent;
import GUI.DashboardTeacher;
import GUI.Dashboard_admin;
import dbconnection.DBConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author AHDDAD
 */
public class User {
    
    private String username;
    private String pass;
    private String type;
    private String firstname;
    private String lastname;
    private String address;
    private String port;
    
    // constructor with all argumnts
    public User(String username, String pass, String type, String firstname, String lastname, String address, String port) {
        this.username = username;
        this.pass = pass;
        this.type = type;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.port = port;
    }
    

    // constructeur avec 2 arguments
    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    // la methode qui ajoute un nouveau urilisatur dans la base de données
    public int saveUser(){
        int count = 0 ;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "INSERT INTO user(type,username,pass) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, this.type);
            preparedStatement.setString(2, this.username);
            preparedStatement.setString(3, this.pass);
            
            count = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return count;
    }
    
    // Login method
    public String login(){
        String msg = "";
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, this.username);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {           // on test si l'utilisateur existe     
                String passwordFromDatabase = resultSet.getString(3);
                if(passwordFromDatabase.equals(this.pass)){    // on test si le mot de passe est correct
                    String typeFromDatabase = resultSet.getNString(1);
                    if(typeFromDatabase.equals("admin")){
                        msg = "admin";
                        Dashboard_admin.connected = this.username;
                    }else if(typeFromDatabase.equals("student")){
                        msg = "student";
                        DashboardStudent.connected = this.username;
                    }else if(typeFromDatabase.equals("teacher")){
                        msg = "teacher";
                        DashboardTeacher.connected = this.username;
                    }else{
                        msg = "unknowen type !";
                    }
                    
                }else{
                    msg = "-1"; // -1 means that password is incorrect
                }
            }else{
                msg = "-2";   // -2 means that username is invalid
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return msg;
    }
    
    // la methode qui retourn le nombre total des eleves, profs ou admins
    public static int getTotalUsers(String type){
        int count = 0 ;
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user WHERE type = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, type);
            
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
    public static ArrayList<User> getAllUsers(){
        ArrayList<User> all = new ArrayList<>();
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM user";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                all.add(new User(resultSet.getString(2),resultSet.getString(3),resultSet.getString(1),resultSet.getString(4),resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return all;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
