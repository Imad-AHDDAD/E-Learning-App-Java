/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;
import javax.swing.ImageIcon;
import entities.*;
import interfaces.BoardRemote;
import interfaces.CourseBoardStudentInterfaceImpl;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.rmi.RemoteException;

/**
 *
 * @author AHDDAD
 */
public class CourseBoardStudent extends javax.swing.JFrame {

    private String student;
    private String course;

    private DatagramSocket clientSocket;
    private InetAddress address;
    private DatagramPacket datagramPacket;

    Video video; // pour transmettre  la video;

    // constructor
    public CourseBoardStudent(String student, String course) throws Exception {

        // on change l'etat a connected
        Student.changeStatus("yes", student);

        try {
            this.clientSocket = new DatagramSocket();
            this.address = InetAddress.getLocalHost();
        } catch (Exception ex) {
            // handle
        }
        this.student = student;
        this.course = course;
        initComponents();

        this.setTitle("Course : " + course);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        // after init components we start receiving board
        draw();

        fillHomePage();

    }

    // ma methode qui remplie la fenetre du cours
    private void fillHomePage() {
        courseStarted.setText(course);
    }

    // la methode qui envoie au serveur que l'etudiant vient de rejoindre le cours
    private void updatePort() {
        // update port of the user
        String message = student + ",student";
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

            String messageToSendToServer = student + "," + course + "," + message + "," + "student";

            byte[] b = messageToSendToServer.getBytes();
            datagramPacket = new DatagramPacket(b, b.length, address, 4567);
            try {
                clientSocket.send(datagramPacket);
                messagesArea.append(message + "\n");
                messageInput.setText("");
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
        boardPlace = new javax.swing.JPanel();
        phoneButton = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        chatPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        chatTitle = new javax.swing.JLabel();
        messagesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagesArea = new javax.swing.JTextArea();
        sendPanel = new javax.swing.JPanel();
        messageInput = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imageStudent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        coursePanel.setBackground(new java.awt.Color(255, 255, 255));
        coursePanel.setMinimumSize(new java.awt.Dimension(1141, 668));

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

        boardPlace.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout boardPlaceLayout = new javax.swing.GroupLayout(boardPlace);
        boardPlace.setLayout(boardPlaceLayout);
        boardPlaceLayout.setHorizontalGroup(
            boardPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        boardPlaceLayout.setVerticalGroup(
            boardPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        phoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        phoneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(phoneButton)
                .addGap(0, 355, Short.MAX_VALUE))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boardPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneButton)
                .addGap(21, 21, 21))
        );

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));

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
                .addGap(144, 144, 144))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(chatTitle)
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        messagesPanelLayout.setVerticalGroup(
            messagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
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
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
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
                .addComponent(messagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imageStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
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
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
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

    // when the window is opened: it shoud start receive and print messages
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // update port
        updatePort();
        // send "joined" message
        sendMessage(student + " => joined the course");
        //recieve data
        try {
            clientSocket = new DatagramSocket();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {

                            // receive text messages
                            byte[] receivedBytes = new byte[1024];
                            DatagramPacket receivedDataPacket = new DatagramPacket(receivedBytes, receivedBytes.length);
                            clientSocket.receive(receivedDataPacket);
                            // print data
                            String messageReceived = new String(receivedDataPacket.getData(), 0, receivedDataPacket.getLength());

                            if (messageReceived.contains("***shutdown***")) {
                                imageStudent.setIcon(null);
                                video.shutdown();
                            } else if (messageReceived.contains("***unshutdown***")) {
                                video = new Video();
                                video.start();
                            } else {
                                messagesArea.append(messageReceived + "\n");
                            }

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        } catch (Exception ex) {
        }

        // receive video
        video = new Video();
        video.start();
    }//GEN-LAST:event_formWindowOpened

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        String message = messageInput.getText();
        if (!message.isEmpty()) {
            sendMessage(student + " : " + message);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Student.changeStatus("no", student);
        sendMessage(student + " : left");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Student.changeStatus("no", student);
    }//GEN-LAST:event_formWindowClosed

    private void phoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneButtonMouseClicked
        Student.changeStatus("no", student);
        sendMessage(student + " : left");
        dispose();
    }//GEN-LAST:event_phoneButtonMouseClicked

    // inner class to receive video
    public class Video extends Thread {

        ServerSocket server;
        Socket socket;
        ObjectInputStream in;

        public void run() {
            try {
                int port = Integer.parseInt(Student.getStudentByUsername(student).getPort()) + 1;
                System.out.println(port);
                server = new ServerSocket(port);
                while (true) {
                    try {
                        socket = server.accept();
                        in = new ObjectInputStream(socket.getInputStream());
                        ImageIcon im = (ImageIcon) in.readObject();
                        imageStudent.setIcon(im);
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
                imageStudent.setIcon(new ImageIcon());
                in.close();
                if (!server.isClosed()) {
                    server.close();
                }
                if (!socket.isClosed()) {
                    socket.close();
                }
            } catch (Exception e) {
            }
        }
    }

    // here we set up bard sharing
    private CourseBoardStudentInterfaceImpl courseBoard;
    private DrawArea drawArea;

    private void draw() throws Exception {
        // set up draw area

        drawArea = new DrawArea();
        drawArea.setSize(boardPlace.getSize().width, boardPlace.getSize().height);
        boardPlace.add(drawArea, BorderLayout.CENTER);
        
        // acces a board remote via server
        String url = "rmi://localhost/boardremote";
        BoardRemote boardShared = (BoardRemote) Naming.lookup(url);
        
        courseBoard = new CourseBoardStudentInterfaceImpl(boardShared, drawArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoText;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JPanel boardPlace;
    private javax.swing.JPanel chatPanel;
    private javax.swing.JLabel chatTitle;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel courseStarted;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imageStudent;
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
    // End of variables declaration//GEN-END:variables
}
