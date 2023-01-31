/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.github.sarxos.webcam.Webcam;
import entities.Course;
import interfaces.BoardInterfaceImpl;
import interfaces.BoardRemote;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/**
 *
 * @author AHDDAD
 */
public class CourseBoardTeacher extends javax.swing.JFrame {

    private boolean cameraStatus;
    private String course;

    private DatagramSocket clientSocket;
    private InetAddress address;
    private DatagramPacket datagramPacket;

    Video video; // pour transmettre  la video;

    public CourseBoardTeacher(String course) {

        this.cameraStatus = false;
        try {
            this.clientSocket = new DatagramSocket();
            this.address = InetAddress.getLocalHost();
        } catch (Exception ex) {
            // handle
        }

        // first , we make course status ON
        int count = Course.changeStatusCourse("ON", course);
        if (count == 1) {;
            this.course = course;
            initComponents();
            try {
                draw();
            } catch (Exception ex) {
                //
            }
            this.setTitle("Course : " + course);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            fillHomePage();
        } else {
            JOptionPane.showMessageDialog(this, "error changing status !");
        }

    }

    // la methode qui remplie la page home
    private void fillHomePage() {
        courseStarted.setText(course);

    }

    // la methode qui envoie au serveur que l'etudiant vient de rejoindre le cours
    private void updatePort() {
        // update port of the user
        String message = course + ",course";
        byte[] b1 = message.getBytes();
        datagramPacket = new DatagramPacket(b1, b1.length, address, 8888);
        try {
            clientSocket.send(datagramPacket);
        } catch (IOException ex) {
            // TODO : handle
        }
    }

    // la methode qui envoie au serveur que l'etudiant vient de rejoindre le cours
    private void sendMessage(String message) {
        if (!message.equals("")) {

            String messageToSendToServer = course + "," + "all" + "," + message + "," + "course";

            byte[] b = messageToSendToServer.getBytes();
            datagramPacket = new DatagramPacket(b, b.length, address, 4567);
            try {
                clientSocket.send(datagramPacket);
                if (!message.equals("***shutdown***") && !message.equals("***unshutdown***")) {
                    messagesArea.append(message + "\n");
                    messageInput.setText("");
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursePanel = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoText = new javax.swing.JLabel();
        courseStarted = new javax.swing.JLabel();
        typeUser = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();
        board = new javax.swing.JPanel();
        phoneButton = new javax.swing.JLabel();
        activateVideo = new javax.swing.JCheckBox();
        activateMicro = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btn_black = new javax.swing.JLabel();
        btn_green = new javax.swing.JLabel();
        btn_red = new javax.swing.JLabel();
        btn_magenta = new javax.swing.JLabel();
        btn_clear = new javax.swing.JLabel();
        btn_blue = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        videoPanel = new javax.swing.JPanel();
        imageTeacher = new javax.swing.JLabel();
        chatPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        chatTitle = new javax.swing.JLabel();
        messagesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagesArea = new javax.swing.JTextArea();
        sendPanel = new javax.swing.JPanel();
        messageInput = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        coursePanel.setBackground(new java.awt.Color(255, 255, 255));
        coursePanel.setMinimumSize(new java.awt.Dimension(1141, 668));
        coursePanel.setPreferredSize(new java.awt.Dimension(1141, 668));

        navbar.setBackground(new java.awt.Color(74, 188, 150));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        LogoText.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        LogoText.setForeground(new java.awt.Color(255, 255, 255));
        LogoText.setText("E-LEARNING");

        courseStarted.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        courseStarted.setForeground(new java.awt.Color(255, 255, 255));
        courseStarted.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        courseStarted.setText("course");
        courseStarted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        courseStarted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseStartedMouseClicked(evt);
            }
        });

        typeUser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeUser.setForeground(new java.awt.Color(255, 255, 255));
        typeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeUser.setText("Course");
        typeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoText)
                    .addComponent(typeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(courseStarted, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseStarted)
                            .addComponent(typeUser))
                        .addGap(12, 12, 12)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        boardPanel.setBackground(new java.awt.Color(51, 51, 51));

        board.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        phoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        phoneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneButtonMouseClicked(evt);
            }
        });

        activateVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activateVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video-disactivated.png"))); // NOI18N
        activateVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateVideoActionPerformed(evt);
            }
        });

        activateMicro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activateMicro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/micro-disactivated.png"))); // NOI18N
        activateMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateMicroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        btn_black.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_black.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_blackMouseClicked(evt);
            }
        });

        btn_green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green.png"))); // NOI18N
        btn_green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_greenMouseClicked(evt);
            }
        });

        btn_red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png"))); // NOI18N
        btn_red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_redMouseClicked(evt);
            }
        });

        btn_magenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magenta.png"))); // NOI18N
        btn_magenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_magenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_magentaMouseClicked(evt);
            }
        });

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
        });

        btn_blue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue.png"))); // NOI18N
        btn_blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_blueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_black)
                .addGap(18, 18, 18)
                .addComponent(btn_blue)
                .addGap(18, 18, 18)
                .addComponent(btn_green)
                .addGap(18, 18, 18)
                .addComponent(btn_red)
                .addGap(18, 18, 18)
                .addComponent(btn_magenta)
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_black, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_red, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_magenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_blue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activateVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activateMicro)
                .addGap(9, 9, 9)
                .addComponent(phoneButton)
                .addGap(289, 289, 289))
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(activateVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activateMicro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));

        videoPanel.setBackground(new java.awt.Color(255, 255, 255));
        videoPanel.setMinimumSize(new java.awt.Dimension(187, 148));
        videoPanel.setPreferredSize(new java.awt.Dimension(187, 148));

        imageTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout videoPanelLayout = new javax.swing.GroupLayout(videoPanel);
        videoPanel.setLayout(videoPanelLayout);
        videoPanelLayout.setHorizontalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        videoPanelLayout.setVerticalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        chatPanel.setBackground(new java.awt.Color(230, 230, 232));

        header.setBackground(new java.awt.Color(74, 188, 150));

        chatTitle.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        chatTitle.setForeground(new java.awt.Color(255, 255, 255));
        chatTitle.setText("CHAT");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chatTitle)
                .addGap(161, 161, 161))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        messagesPanel.setBackground(new java.awt.Color(255, 255, 255));

        messagesArea.setEditable(false);
        messagesArea.setColumns(20);
        messagesArea.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        messagesArea.setRows(5);
        messagesArea.setBorder(null);
        jScrollPane1.setViewportView(messagesArea);

        javax.swing.GroupLayout messagesPanelLayout = new javax.swing.GroupLayout(messagesPanel);
        messagesPanel.setLayout(messagesPanelLayout);
        messagesPanelLayout.setHorizontalGroup(
            messagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        messagesPanelLayout.setVerticalGroup(
            messagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        sendPanel.setBackground(new java.awt.Color(255, 255, 255));

        messageInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        messageInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        sendButton.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sendPanelLayout = new javax.swing.GroupLayout(sendPanel);
        sendPanel.setLayout(sendPanelLayout);
        sendPanelLayout.setHorizontalGroup(
            sendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendButton)
                .addContainerGap())
        );
        sendPanelLayout.setVerticalGroup(
            sendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageInput)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel);
        chatPanel.setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(messagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseStartedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseStartedMouseClicked

    }//GEN-LAST:event_courseStartedMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // update port
        updatePort();
        //recieve messages
        try {
            clientSocket = new DatagramSocket();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            byte[] receivedBytes = new byte[1024];
                            DatagramPacket receivedDataPacket = new DatagramPacket(receivedBytes, receivedBytes.length);
                            clientSocket.receive(receivedDataPacket);
                            // print data
                            String messageReceived = new String(receivedDataPacket.getData(), 0, receivedDataPacket.getLength());
                            messagesArea.append(messageReceived + "\n");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            thread.start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed

        String message = messageInput.getText();
        if (!message.isEmpty()) {
            sendMessage(Course.getCourseByLibelle(course).getTeacher().toUpperCase() + "(Prof) : " + message);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    // make course status OFF when window is closing
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Course.changeStatusCourse("OFF", course);
        sendMessage(Course.getCourseByLibelle(course).getTeacher().toUpperCase() + "(Prof) : Left");
        if (video != null) {
            video.shutdown();
        }

    }//GEN-LAST:event_formWindowClosing

    private void activateVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateVideoActionPerformed
        if (activateVideo.isSelected()) {
            activateVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video.png")));
            sendMessage("***unshutdown***");
            runVideoCall();
        } else {
            imageTeacher.setIcon(null);
            video.shutdown();
            activateVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video-disactivated.png")));
        }
    }//GEN-LAST:event_activateVideoActionPerformed

    // la methode run videoCall
    private void runVideoCall() {
        video = new Video();
        video.start();
    }

    private void activateMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateMicroActionPerformed
        if (activateMicro.isSelected()) {
            activateMicro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/micro.png")));
        } else {
            activateMicro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/micro-disactivated.png")));
        }
    }//GEN-LAST:event_activateMicroActionPerformed

    private void phoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneButtonMouseClicked
        dispose();
        Course.changeStatusCourse("OFF", course);
        sendMessage(Course.getCourseByLibelle(course).getTeacher().toUpperCase() + "(Prof) : Left");
        if (video != null) {
            video.shutdown();
        }
    }//GEN-LAST:event_phoneButtonMouseClicked

    private void btn_blackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blackMouseClicked
        drawArea.black();
    }//GEN-LAST:event_btn_blackMouseClicked

    private void btn_blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blueMouseClicked
        drawArea.blue();
    }//GEN-LAST:event_btn_blueMouseClicked

    private void btn_greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_greenMouseClicked
        drawArea.green();
    }//GEN-LAST:event_btn_greenMouseClicked

    private void btn_redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_redMouseClicked
        drawArea.red();
    }//GEN-LAST:event_btn_redMouseClicked

    private void btn_magentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_magentaMouseClicked
        drawArea.magenta();
    }//GEN-LAST:event_btn_magentaMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        drawArea.clear();
    }//GEN-LAST:event_btn_clearMouseClicked

    // inner class to receive video
    public class Video extends Thread {

        Socket socket;
        ObjectOutputStream out;
        ImageIcon im;
        BufferedImage bim;
        Webcam cam;

        public void run() {
            try {
                cam = Webcam.getDefault();
                cam.open();

                while (true) {
                    bim = cam.getImage();
                    im = new ImageIcon(bim);
                    imageTeacher.setIcon(im);
                    System.out.println("connect to server ...");
                    socket = new Socket("127.0.0.1", 7890);
                    out = new ObjectOutputStream(socket.getOutputStream());
                    out.writeObject(im);
                    out.flush();
                }

            } catch (IOException ex) {
                shutdown();
            }
        }

        public void shutdown() {
            try {
                imageTeacher.setIcon(new ImageIcon());
                cameraStatus = false;
                out.close();
                cam.close();
                if (!socket.isClosed()) {
                    socket.close();
                }
                sendMessage("***shutdown***");
            } catch (Exception e) {
            }
        }
    }

    // here we set up draw area
    private DrawArea drawArea;
    private BoardInterfaceImpl boardInterfaceImpl;

    public void draw() throws Exception {
        drawArea = new DrawArea();
        drawArea.setSize(board.getSize().width, board.getSize().height);
        board.add(drawArea, BorderLayout.CENTER);
        
        String url = "rmi://localhost/boardremote";
        BoardRemote board = (BoardRemote) Naming.lookup(url);

        boardInterfaceImpl = new BoardInterfaceImpl(drawArea, board);
        boardInterfaceImpl.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoText;
    private javax.swing.JCheckBox activateMicro;
    private javax.swing.JCheckBox activateVideo;
    private javax.swing.JPanel board;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel btn_black;
    private javax.swing.JLabel btn_blue;
    private javax.swing.JLabel btn_clear;
    private javax.swing.JLabel btn_green;
    private javax.swing.JLabel btn_magenta;
    private javax.swing.JLabel btn_red;
    private javax.swing.JPanel chatPanel;
    private javax.swing.JLabel chatTitle;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel courseStarted;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imageTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageInput;
    private javax.swing.JTextArea messagesArea;
    private javax.swing.JPanel messagesPanel;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel phoneButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel sendPanel;
    private javax.swing.JLabel typeUser;
    private javax.swing.JPanel videoPanel;
    // End of variables declaration//GEN-END:variables
}
