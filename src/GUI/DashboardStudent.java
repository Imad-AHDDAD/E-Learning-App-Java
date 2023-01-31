/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import entities.Course;
import entities.Document;
import entities.Student;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author AHDDAD
 */
public class DashboardStudent extends javax.swing.JFrame {

    public static String connected = "";

    public DashboardStudent() {
        initComponents();
        this.setTitle("Dashboard Student");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        allPanels.setSelectedIndex(0);
        studentConnected.setText(connected);
        levelConnected.setText(Student.getStudentByUsername(connected).getLevel());
        fillHomePanel();
    }

    // la methode qui remplie home page
    private void fillHomePanel() {
        Student student = Student.getStudentByUsername(connected);
        usernameInput.setText(student.getUsername());
        passwordInput.setText(student.getPass());
        firstnameInput.setText(student.getFirstname());
        lastnameInput.setText(student.getLastname());
        levelInput.setText(student.getLevel());
        allPanels.setSelectedIndex(0);
    }

    private void fillCoursesTable() {
        ArrayList<Course> courses = Course.getCourseByLevel(Student.getStudentByUsername(connected).getLevel());
        String[][] data = new String[courses.size()][3];
        for (int i = 0; i < courses.size(); i++) {

            data[i][0] = courses.get(i).getLibelle();
            if (courses.get(i).getAffected().equals("no")) {
                data[i][1] = "-";
            } else {
                data[i][1] = courses.get(i).getTeacher();
            }
            data[i][2] = courses.get(i).getStatus();

        }

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Label", "Tacher", "Status", "Enter"
                }
        ));
        coursesTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        coursesTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = coursesTable.getColumnModel();
        model.getColumn(3).setCellRenderer(new ButtonEnter());
        model.getColumn(3).setCellEditor(new CellEditor(new JCheckBox()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoText = new javax.swing.JLabel();
        levelConnected = new javax.swing.JLabel();
        studentConnected = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        typeUser = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        coursesButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        filesButton = new javax.swing.JLabel();
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
        coursesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        filespanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        filesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setMinimumSize(new java.awt.Dimension(1141, 668));

        navbar.setBackground(new java.awt.Color(51, 51, 51));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        LogoText.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        LogoText.setForeground(new java.awt.Color(255, 255, 255));
        LogoText.setText("E-LEARNING");

        levelConnected.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelConnected.setForeground(new java.awt.Color(255, 255, 255));
        levelConnected.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelConnected.setText("student");
        levelConnected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        levelConnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                levelConnectedMouseClicked(evt);
            }
        });

        studentConnected.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        studentConnected.setForeground(new java.awt.Color(255, 255, 255));
        studentConnected.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        studentConnected.setText("user");
        studentConnected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentConnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentConnectedMouseClicked(evt);
            }
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileStudent.png"))); // NOI18N

        typeUser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeUser.setForeground(new java.awt.Color(255, 255, 255));
        typeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeUser.setText("student");
        typeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoText)
                    .addComponent(typeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentConnected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelConnected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile)
                .addGap(21, 21, 21))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile)
                .addGap(5, 5, 5))
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Logo)
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navbarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(levelConnected))
                            .addGroup(navbarLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(LogoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeUser)
                            .addComponent(studentConnected))
                        .addGap(24, 24, 24)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        sidebar.setBackground(new java.awt.Color(74, 188, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(74, 188, 150));
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
        coursesButton.setForeground(new java.awt.Color(74, 188, 150));
        coursesButton.setText("Courses");
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

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        filesButton.setBackground(new java.awt.Color(255, 255, 255));
        filesButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        filesButton.setForeground(new java.awt.Color(74, 188, 150));
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

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        header.setBackground(new java.awt.Color(74, 188, 150));

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

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
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
                                .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
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
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        allPanels.addTab("tab1", homePanel);

        coursesPanel.setBackground(new java.awt.Color(255, 255, 255));

        coursesTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Label", "Teacher", "status", "Enter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        coursesTable.setRowHeight(40);
        jScrollPane1.setViewportView(coursesTable);

        javax.swing.GroupLayout coursesPanelLayout = new javax.swing.GroupLayout(coursesPanel);
        coursesPanel.setLayout(coursesPanelLayout);
        coursesPanelLayout.setHorizontalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        coursesPanelLayout.setVerticalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursesPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        allPanels.addTab("tab2", coursesPanel);

        filespanel.setBackground(new java.awt.Color(255, 255, 255));

        filesTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        filesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "File", "Module", "Date", "Download"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filesTable.setGridColor(new java.awt.Color(242, 242, 242));
        filesTable.setRowHeight(40);
        jScrollPane2.setViewportView(filesTable);

        javax.swing.GroupLayout filespanelLayout = new javax.swing.GroupLayout(filespanel);
        filespanel.setLayout(filespanelLayout);
        filespanelLayout.setHorizontalGroup(
            filespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(filespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(filespanelLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        filespanelLayout.setVerticalGroup(
            filespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(filespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(filespanelLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        allPanels.addTab("tab3", filespanel);

        content.add(allPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -44, -1, 630));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void levelConnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelConnectedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_levelConnectedMouseClicked

    private void studentConnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentConnectedMouseClicked

    }//GEN-LAST:event_studentConnectedMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        allPanels.setSelectedIndex(0);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void coursesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesButtonMouseClicked
        fillCoursesTable();
        allPanels.setSelectedIndex(1);
    }//GEN-LAST:event_coursesButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        dispose();
        new Login_Form().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordInput.setEchoChar((char) 0);
        } else {
            passwordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void filesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesButtonMouseClicked
        allPanels.setSelectedIndex(2);
        fillFilesTable();
    }//GEN-LAST:event_filesButtonMouseClicked

    // inner class that generate the enter button
    public class ButtonEnter extends JButton implements TableCellRenderer {

        public ButtonEnter() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setBorderPainted(false);
            setFocusPainted(false);
            setBackground(new Color(74, 188, 150));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png")));
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
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png")));
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
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png")));
            label = (value == null) ? "" : value.toString();
            //button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                try {
                    //Action au clic de la souris
                    enterCourse(table.getValueAt(row, 0).toString());
                } catch (Exception ex) {
                    Logger.getLogger(DashboardStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    
    public void enterCourse(String label) throws Exception{
        Course course = Course.getCourseByLibelle(label);
        if(course.getStatus().equals("OFF")){
            JOptionPane.showMessageDialog(this, "this course is not starting !" , "ELearning", JOptionPane.ERROR_MESSAGE);
        }else {
            new CourseBoardStudent(connected, label).setVisible(true);
        }
        
    }
    
    
    // la methode qui remplie la table des fichiers
    private void fillFilesTable() {
        String level = Student.getStudentByUsername(connected).getLevel();
        ArrayList<Document> documents = Document.getDocumentsByLevel(level);
        String[][] data = new String[documents.size()][4];
        for (int i = 0; i < documents.size(); i++) {
            data[i][0] = documents.get(i).getLibelle();
            data[i][1] = documents.get(i).getCoursename();
            data[i][2] = documents.get(i).getDate();
        }

        filesTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Libelle", "Course", "Date", "Download"
                }
        ));

        filesTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        filesTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = filesTable.getColumnModel();
        model.getColumn(3).setCellRenderer(new ButtonDownload());
        model.getColumn(3).setCellEditor(new CellEditorDownload(new JCheckBox()));
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
    public class CellEditorDownload extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean clicked;
        private int row, col;
        private JTable table;

        public CellEditorDownload(JCheckBox checkBox) {
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
    private javax.swing.JTabbedPane allPanels;
    private javax.swing.JPanel content;
    private javax.swing.JLabel coursesButton;
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JTable coursesTable;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel filesButton;
    private javax.swing.JTable filesTable;
    private javax.swing.JPanel filespanel;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel levelConnected;
    private javax.swing.JTextField levelInput;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JPanel navbar;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel profile;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel studentConnected;
    private javax.swing.JLabel title;
    private javax.swing.JLabel typeUser;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
