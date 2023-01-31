/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.DashboardStudent.connected;
import entities.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author AHDDAD
 */
public class DashboardTeacher extends javax.swing.JFrame {

    public static String connected = "";

    public DashboardTeacher() {
        initComponents();
        this.setTitle("Dashboard Teacher");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        allPanels.setSelectedIndex(0);
        teacherConnected.setText("Pr." + connected.toUpperCase());
        levelConnected.setText(Course.getCourseByTeacher(connected).getLevel());
        fillHomePanel();
    }

    // la methode qui remplie homePanel
    private void fillHomePanel() {
        Teacher teacher = Teacher.getTeacherByUsername(connected);
        usernameInput.setText(teacher.getUsername());
        passwordInput.setText(teacher.getPass());
        firstnameInput.setText(teacher.getFirstname());
        lastnameInput.setText(teacher.getLastname());
        levelInput.setText(Course.getCourseByTeacher(connected).getLevel());
        courseInput.setText(Course.getCourseByTeacher(connected).getLibelle());
    }

    // la methode qui remplie course Panel
    private void fillCoursePanel() {
        courseTitle.setText(Course.getCourseByTeacher(connected).getLibelle().toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        navabr = new javax.swing.JPanel();
        LogoText = new javax.swing.JLabel();
        typeUser = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        levelConnected = new javax.swing.JLabel();
        teacherConnected = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        allPanels = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        firstnameInput = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameInput = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        showPassword = new javax.swing.JCheckBox();
        passwordInput = new javax.swing.JPasswordField();
        courseInput = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        courseTitle = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        startButton = new javax.swing.JLabel();
        filesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        filesTable = new javax.swing.JTable();
        addFileButton = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        header1 = new javax.swing.JPanel();
        tableTitle = new javax.swing.JLabel();
        sidebar1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        coursesButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        filesButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        studentsButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setMinimumSize(new java.awt.Dimension(1141, 668));
        dashboard.setPreferredSize(new java.awt.Dimension(1141, 668));

        navabr.setBackground(new java.awt.Color(7, 30, 34));

        LogoText.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        LogoText.setForeground(new java.awt.Color(255, 255, 255));
        LogoText.setText("E-LEARNING");

        typeUser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeUser.setForeground(new java.awt.Color(255, 255, 255));
        typeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeUser.setText("teacher");
        typeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileStudent.png"))); // NOI18N

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        levelConnected.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelConnected.setForeground(new java.awt.Color(255, 255, 255));
        levelConnected.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelConnected.setText("IRISI");
        levelConnected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        levelConnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                levelConnectedMouseClicked(evt);
            }
        });

        teacherConnected.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        teacherConnected.setForeground(new java.awt.Color(255, 255, 255));
        teacherConnected.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        teacherConnected.setText("user");
        teacherConnected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacherConnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherConnectedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navabrLayout = new javax.swing.GroupLayout(navabr);
        navabr.setLayout(navabrLayout);
        navabrLayout.setHorizontalGroup(
            navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navabrLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoText)
                    .addComponent(typeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 747, Short.MAX_VALUE)
                .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(levelConnected, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(teacherConnected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile)
                .addGap(20, 20, 20))
        );
        navabrLayout.setVerticalGroup(
            navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navabrLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navabrLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profile))
                    .addGroup(navabrLayout.createSequentialGroup()
                        .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Logo)
                                .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(navabrLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(levelConnected))
                                    .addGroup(navabrLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(LogoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(navabrLayout.createSequentialGroup()
                                .addGroup(navabrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeUser)
                                    .addComponent(teacherConnected))
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanels.setBackground(new java.awt.Color(255, 255, 255));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        header.setBackground(new java.awt.Color(118, 146, 137));

        title.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Profile");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        firstnameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        firstnameLabel.setText("First name");

        firstnameInput.setEditable(false);
        firstnameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        firstnameInput.setForeground(new java.awt.Color(51, 51, 51));
        firstnameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstnameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        lastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastnameLabel.setText("Last name");

        lastnameInput.setEditable(false);
        lastnameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lastnameInput.setForeground(new java.awt.Color(51, 51, 51));
        lastnameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastnameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        levelLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(51, 51, 51));
        levelLabel.setText("Level");

        levelInput.setEditable(false);
        levelInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelInput.setForeground(new java.awt.Color(51, 51, 51));
        levelInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        levelInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        passwordLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password");

        usernameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setText("Username");

        usernameInput.setEditable(false);
        usernameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameInput.setForeground(new java.awt.Color(51, 51, 51));
        usernameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        showPassword.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        showPassword.setText("show password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        passwordInput.setEditable(false);
        passwordInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));
        passwordInput.setMaximumSize(new java.awt.Dimension(64, 20));

        courseInput.setEditable(false);
        courseInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        courseInput.setForeground(new java.awt.Color(51, 51, 51));
        courseInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        courseLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(51, 51, 51));
        courseLabel.setText("Course");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(infoPanelLayout.createSequentialGroup()
                            .addComponent(usernameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(firstnameLabel)
                                        .addGap(34, 34, 34))
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGap(42, 42, 42)))
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showPassword)
                                    .addComponent(firstnameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(38, 38, 38))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel)
                    .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        allPanels.addTab("tab1", homePanel);

        coursePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(118, 146, 137));

        courseTitle.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        courseTitle.setForeground(new java.awt.Color(255, 255, 255));
        courseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseTitle.setText("course");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(courseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(courseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(7, 30, 34));

        startButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startButton.setText("Start Course");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        allPanels.addTab("tab2", coursePanel);

        filesPanel.setBackground(new java.awt.Color(255, 255, 255));

        filesTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        filesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "File", "Date", "Download"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filesTable.setGridColor(new java.awt.Color(242, 242, 242));
        filesTable.setRowHeight(40);
        jScrollPane2.setViewportView(filesTable);

        addFileButton.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        addFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addFileButton.setText("add file");
        addFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addFileButtonMouseEntered(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout filesPanelLayout = new javax.swing.GroupLayout(filesPanel);
        filesPanel.setLayout(filesPanelLayout);
        filesPanelLayout.setHorizontalGroup(
            filesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filesPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(filesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(filesPanelLayout.createSequentialGroup()
                        .addComponent(addFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        filesPanelLayout.setVerticalGroup(
            filesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(filesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFileButton)
                    .addComponent(refresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        allPanels.addTab("tab3", filesPanel);

        studentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        studentsTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentsTable.setGridColor(new java.awt.Color(242, 242, 242));
        studentsTable.setRowHeight(40);
        jScrollPane1.setViewportView(studentsTable);

        header1.setBackground(new java.awt.Color(74, 188, 150));

        tableTitle.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        tableTitle.setForeground(new java.awt.Color(255, 255, 255));
        tableTitle.setText("Student Of");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableTitle)
                .addGap(144, 144, 144))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tableTitle)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
        studentsPanel.setLayout(studentsPanelLayout);
        studentsPanelLayout.setHorizontalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        studentsPanelLayout.setVerticalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        allPanels.addTab("tab4", studentsPanel);

        content.add(allPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -32, -1, 610));

        sidebar1.setBackground(new java.awt.Color(118, 146, 137));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(118, 146, 137));
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        coursesButton.setBackground(new java.awt.Color(255, 255, 255));
        coursesButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        coursesButton.setForeground(new java.awt.Color(118, 146, 137));
        coursesButton.setText("Course");
        coursesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coursesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(coursesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        filesButton.setBackground(new java.awt.Color(255, 255, 255));
        filesButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        filesButton.setForeground(new java.awt.Color(118, 146, 137));
        filesButton.setText("Files");
        filesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(filesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(7, 30, 34));

        logoutButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        studentsButton.setBackground(new java.awt.Color(255, 255, 255));
        studentsButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        studentsButton.setForeground(new java.awt.Color(118, 146, 137));
        studentsButton.setText("Students");
        studentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(studentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidebar1Layout = new javax.swing.GroupLayout(sidebar1);
        sidebar1.setLayout(sidebar1Layout);
        sidebar1Layout.setHorizontalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebar1Layout.setVerticalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navabr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(sidebar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(navabr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(sidebar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherConnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherConnectedMouseClicked

    }//GEN-LAST:event_teacherConnectedMouseClicked

    private void levelConnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelConnectedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_levelConnectedMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        fillHomePanel();
        allPanels.setSelectedIndex(0);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void coursesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesButtonMouseClicked
        fillCoursePanel();
        allPanels.setSelectedIndex(1);
    }//GEN-LAST:event_coursesButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        dispose();
        new Login_Form().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void filesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesButtonMouseClicked
        allPanels.setSelectedIndex(2);
        fillFilesTable();
    }//GEN-LAST:event_filesButtonMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordInput.setEchoChar((char) 0);
        } else {
            passwordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        new CourseBoardTeacher(Course.getCourseByTeacher(connected).getLibelle()).setVisible(true);
    }//GEN-LAST:event_startButtonMouseClicked

    private void studentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsButtonMouseClicked
        fillStudentsTable();
        allPanels.setSelectedIndex(3);
    }//GEN-LAST:event_studentsButtonMouseClicked

    private void addFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileButtonMouseClicked
        JFileChooser file_upload = new JFileChooser();
        int res = file_upload.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
            
            String path = file_path.getAbsolutePath();
            String level = Course.getCourseByTeacher(connected).getLevel();
            String course = Course.getCourseByTeacher(connected).getLibelle();
            String lib = file_path.getName();
            System.out.println(file_path);
            
            int count = Document.addDocument(lib, level, course, path);
            if(count == 1){
                JOptionPane.showMessageDialog(this, "file uploaded successfully", "ELearning", JOptionPane.DEFAULT_OPTION);
            }else{
                JOptionPane.showMessageDialog(this, "error uploading file", "ELearning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addFileButtonMouseClicked

    private void addFileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addFileButtonMouseEntered

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        fillFilesTable();
    }//GEN-LAST:event_refreshMouseClicked

    // la methode qui remplie la table des etudiants
    private void fillStudentsTable() {
        String level = Course.getCourseByTeacher(connected).getLevel();
        tableTitle.setText("Students of " + level);
        ArrayList<Student> students = Student.getStudentsByLevel(Course.getCourseByTeacher(connected).getLevel());
        String[][] data = new String[students.size()][2];
        for (int i = 0; i < students.size(); i++) {
            data[i][0] = students.get(i).getFirstname();
            data[i][1] = students.get(i).getLastname().toUpperCase();
        }

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "First Name", "Last Name"
                }
        ));

        studentsTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        studentsTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
    }

    // la methode qui remplie la table des fichiers
    private void fillFilesTable() {
        String level = Course.getCourseByTeacher(connected).getLevel();
        String course = Course.getCourseByTeacher(connected).getLibelle();
        ArrayList<Document> documents = Document.getDocumentsByLevelAndCourse(level, course);
        String[][] data = new String[documents.size()][3];
        for (int i = 0; i < documents.size(); i++) {
            data[i][0] = documents.get(i).getLibelle();
            data[i][1] = documents.get(i).getDate();
        }

        filesTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Libelle", "Date", "Download"
                }
        ));

        filesTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        filesTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = filesTable.getColumnModel();
        model.getColumn(2).setCellRenderer(new ButtonDownload());
        model.getColumn(2).setCellEditor(new CellEditor(new JCheckBox()));
    }
    
    
        // inner class that generate the enter button
    public class ButtonDownload extends JButton implements TableCellRenderer {

        public ButtonDownload() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setBorderPainted(false);
            setFocusPainted(false);
            setBackground(new Color(74, 188, 150));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png")));
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // inner class that used to make enter button clickable
    public class CellEditor extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean clicked;
        private int row, col;
        private JTable table;

        public CellEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.setBackground(new Color(211, 243, 238));
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png")));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.table = table;
            this.row = row;
            this.col = column;
            button.setBackground(new Color(211, 243, 238));
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png")));
            label = (value == null) ? "" : value.toString();
            //button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                //Action au clic de la souris
                download(table.getValueAt(row, 0).toString());
            }
            clicked = false;
            return new String(label);
        }

        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
    
    public void download(String lib){
        System.out.println("want download "+lib);
        try {
            Desktop.getDesktop().open(new File(Document.getPath(lib)));
        } catch (IOException ex) {
            // handle
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoText;
    private javax.swing.JLabel add;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel addFileButton;
    private javax.swing.JTabbedPane allPanels;
    private javax.swing.JPanel content;
    private javax.swing.JTextField courseInput;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel courseTitle;
    private javax.swing.JLabel coursesButton;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel filesButton;
    private javax.swing.JPanel filesPanel;
    private javax.swing.JTable filesTable;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel levelConnected;
    private javax.swing.JTextField levelInput;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JPanel navabr;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel refresh;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JPanel sidebar1;
    private javax.swing.JLabel startButton;
    private javax.swing.JLabel studentsButton;
    private javax.swing.JPanel studentsPanel;
    private javax.swing.JTable studentsTable;
    private javax.swing.JLabel tableTitle;
    private javax.swing.JLabel teacherConnected;
    private javax.swing.JLabel title;
    private javax.swing.JLabel typeUser;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
