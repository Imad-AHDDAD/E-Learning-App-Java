/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servers;

import GUI.*;
import entities.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author AHDDAD
 */
public class ServerVideo {

    ServerSocket server;
    Socket socketSender;
    Socket socketReciever;
    ObjectInputStream in;
    ObjectOutputStream out;
    ImageIcon im;
    BufferedImage bim;

    public ServerVideo() {
        
        try {
            server = new ServerSocket(7890);
            while (true) {
                try {

                    System.out.println("waiting ....");
                    socketSender = server.accept();
                    System.out.println("received !");
                    in = new ObjectInputStream(socketSender.getInputStream());
                    ImageIcon im = (ImageIcon) in.readObject();

                    for (Student student : Student.getStudentsConnected()) {
                        //Student student = Student.getStudentByUsername("AHDDAD1");
                        if (student.getAddress() != null && student.getPort() != null) {
                            int port = Integer.parseInt(student.getPort()) + 1;
                            System.out.println("connect to : "+student.getAddress()+" sur le port : "+port);
                            socketReciever = new Socket(student.getAddress(), port);
                            out = new ObjectOutputStream(socketReciever.getOutputStream());
                            out.writeObject(im);
                            out.flush();
                        }
                    }

                } catch (Exception ex) {
                    shutdown();
                }
            }
        } catch (IOException ex) {
            shutdown();
        }
    }

    public void shutdown() {
        try {
            out.close();
            in.close();
            if (!server.isClosed()) {
                server.close();
            }
            if (!socketSender.isClosed()) {
                socketSender.close();
            }
            if (!socketReciever.isClosed()) {
                socketReciever.close();
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new ServerVideo();
    }

}
