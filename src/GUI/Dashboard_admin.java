package GUI;

import entities.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class Dashboard_admin extends javax.swing.JFrame {

    public static String connected = "";

    public Dashboard_admin() {
        initComponents();
        this.setTitle("Dashboard Adimn");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        fillHomePanel();
        allPanels.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        verticalNavBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        LogoText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        teachersButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        studentsButton = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        coursesButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        horizontalNavBar = new javax.swing.JPanel();
        contentTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contentTitle1 = new javax.swing.JLabel();
        adminConnected = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        allPanels = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        teachersNumber = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        coursesNumber = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        studentsNumber = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        adminsNumber = new javax.swing.JLabel();
        statisticsTitle = new javax.swing.JLabel();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        refresh = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        teachersPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teachersTable = new javax.swing.JTable();
        addTeacher = new javax.swing.JLabel();
        refreshTeachers = new javax.swing.JLabel();
        coursesPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        addCourse = new javax.swing.JLabel();
        refreshCourses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verticalNavBar.setBackground(new java.awt.Color(230, 98, 108));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        LogoText.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        LogoText.setForeground(new java.awt.Color(255, 255, 255));
        LogoText.setText("E-LEARNING");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacher.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/course.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        teachersButton.setBackground(new java.awt.Color(255, 255, 255));
        teachersButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        teachersButton.setForeground(new java.awt.Color(230, 98, 108));
        teachersButton.setText("Teachers");
        teachersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teachersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teachersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        studentsButton.setBackground(new java.awt.Color(255, 255, 255));
        studentsButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        studentsButton.setForeground(new java.awt.Color(230, 98, 108));
        studentsButton.setText("Students");
        studentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        coursesButton.setBackground(new java.awt.Color(255, 255, 255));
        coursesButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        coursesButton.setForeground(new java.awt.Color(230, 98, 108));
        coursesButton.setText("Courses");
        coursesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coursesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(230, 98, 108));
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout verticalNavBarLayout = new javax.swing.GroupLayout(verticalNavBar);
        verticalNavBar.setLayout(verticalNavBarLayout);
        verticalNavBarLayout.setHorizontalGroup(
            verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verticalNavBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(verticalNavBarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(verticalNavBarLayout.createSequentialGroup()
                        .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoText)
                            .addGroup(verticalNavBarLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Logo)))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        verticalNavBarLayout.setVerticalGroup(
            verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verticalNavBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verticalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        horizontalNavBar.setBackground(new java.awt.Color(51, 51, 51));

        contentTitle.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        contentTitle.setForeground(new java.awt.Color(255, 255, 255));
        contentTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contentTitle.setText("Home");
        contentTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contentTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTitleMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N

        contentTitle1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        contentTitle1.setForeground(new java.awt.Color(255, 255, 255));
        contentTitle1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contentTitle1.setText("administrateur");
        contentTitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contentTitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTitle1MouseClicked(evt);
            }
        });

        adminConnected.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        adminConnected.setForeground(new java.awt.Color(255, 255, 255));
        adminConnected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminConnected.setText("user");
        adminConnected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminConnected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminConnectedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout horizontalNavBarLayout = new javax.swing.GroupLayout(horizontalNavBar);
        horizontalNavBar.setLayout(horizontalNavBarLayout);
        horizontalNavBarLayout.setHorizontalGroup(
            horizontalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horizontalNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(horizontalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        horizontalNavBarLayout.setVerticalGroup(
            horizontalNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, horizontalNavBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(horizontalNavBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(contentTitle1)
                .addGap(3, 3, 3)
                .addComponent(adminConnected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanels.setBackground(new java.awt.Color(255, 255, 255));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setMinimumSize(new java.awt.Dimension(610, 552));

        kGradientPanel7.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(255, 51, 51));
        kGradientPanel7.setMinimumSize(new java.awt.Dimension(217, 87));
        kGradientPanel7.setPreferredSize(new java.awt.Dimension(217, 87));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Teachers");

        teachersNumber.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        teachersNumber.setForeground(new java.awt.Color(255, 255, 255));
        teachersNumber.setText("2");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(teachersNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(32, 32, 32))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(teachersNumber))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(0, 102, 0));
        kGradientPanel6.setkStartColor(new java.awt.Color(51, 255, 51));
        kGradientPanel6.setMinimumSize(new java.awt.Dimension(217, 87));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Courses");

        coursesNumber.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        coursesNumber.setForeground(new java.awt.Color(255, 255, 255));
        coursesNumber.setText("2");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(coursesNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(36, 36, 36))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(coursesNumber))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        kGradientPanel8.setkStartColor(new java.awt.Color(0, 204, 255));
        kGradientPanel8.setMinimumSize(new java.awt.Dimension(217, 87));
        kGradientPanel8.setPreferredSize(new java.awt.Dimension(217, 87));

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Students");

        studentsNumber.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        studentsNumber.setForeground(new java.awt.Color(255, 255, 255));
        studentsNumber.setText("2");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(studentsNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(33, 33, 33))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(studentsNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.setkEndColor(new java.awt.Color(255, 204, 0));
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 51, 0));
        kGradientPanel9.setMinimumSize(new java.awt.Dimension(217, 87));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("admins");

        adminsNumber.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        adminsNumber.setForeground(new java.awt.Color(255, 255, 255));
        adminsNumber.setText("2");

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminsNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(42, 42, 42))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(adminsNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statisticsTitle.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        statisticsTitle.setForeground(new java.awt.Color(51, 51, 51));
        statisticsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticsTitle.setText("Statistics");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(homePanelLayout.createSequentialGroup()
                            .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(homePanelLayout.createSequentialGroup()
                            .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statisticsTitle)
                        .addGap(135, 135, 135)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(statisticsTitle)
                .addGap(28, 28, 28)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        allPanels.addTab("tab1", homePanel);

        studentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        studentsTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full  Name", "Username", "Level", "Edit", "Delete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentsTable.setGridColor(new java.awt.Color(242, 242, 242));
        studentsTable.setRowHeight(40);
        jScrollPane1.setViewportView(studentsTable);
        if (studentsTable.getColumnModel().getColumnCount() > 0) {
            studentsTable.getColumnModel().getColumn(3).setMinWidth(30);
            studentsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            studentsTable.getColumnModel().getColumn(3).setMaxWidth(50);
            studentsTable.getColumnModel().getColumn(4).setMinWidth(30);
            studentsTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            studentsTable.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
        studentsPanel.setLayout(studentsPanelLayout);
        studentsPanelLayout.setHorizontalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(18, 18, 18)
                        .addComponent(add))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        studentsPanelLayout.setVerticalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refresh)
                    .addComponent(add))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        allPanels.addTab("tab2", studentsPanel);

        teachersPanel.setBackground(new java.awt.Color(255, 255, 255));

        teachersTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Full  Name", "Username", "has course", "total courses", "Edit", "Delete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teachersTable.setGridColor(new java.awt.Color(242, 242, 242));
        teachersTable.setRowHeight(40);
        jScrollPane2.setViewportView(teachersTable);
        if (teachersTable.getColumnModel().getColumnCount() > 0) {
            teachersTable.getColumnModel().getColumn(4).setMinWidth(30);
            teachersTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            teachersTable.getColumnModel().getColumn(4).setMaxWidth(50);
            teachersTable.getColumnModel().getColumn(5).setMinWidth(30);
            teachersTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            teachersTable.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        addTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTeacherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTeacherMouseEntered(evt);
            }
        });

        refreshTeachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshTeachers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshTeachersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout teachersPanelLayout = new javax.swing.GroupLayout(teachersPanel);
        teachersPanel.setLayout(teachersPanelLayout);
        teachersPanelLayout.setHorizontalGroup(
            teachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(teachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teachersPanelLayout.createSequentialGroup()
                        .addComponent(refreshTeachers)
                        .addGap(18, 18, 18)
                        .addComponent(addTeacher))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        teachersPanelLayout.setVerticalGroup(
            teachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(teachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshTeachers)
                    .addComponent(addTeacher))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        allPanels.addTab("tab3", teachersPanel);

        coursesPanel.setBackground(new java.awt.Color(255, 255, 255));

        coursesTable.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Libelle", "Level", "Teacher", "Edit", "Delete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        coursesTable.setGridColor(new java.awt.Color(242, 242, 242));
        coursesTable.setRowHeight(40);
        jScrollPane3.setViewportView(coursesTable);
        if (coursesTable.getColumnModel().getColumnCount() > 0) {
            coursesTable.getColumnModel().getColumn(3).setMinWidth(30);
            coursesTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            coursesTable.getColumnModel().getColumn(3).setMaxWidth(50);
            coursesTable.getColumnModel().getColumn(4).setMinWidth(30);
            coursesTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            coursesTable.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        addCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCourseMouseEntered(evt);
            }
        });

        refreshCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshCoursesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout coursesPanelLayout = new javax.swing.GroupLayout(coursesPanel);
        coursesPanel.setLayout(coursesPanelLayout);
        coursesPanelLayout.setHorizontalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursesPanelLayout.createSequentialGroup()
                        .addComponent(refreshCourses)
                        .addGap(18, 18, 18)
                        .addComponent(addCourse))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        coursesPanelLayout.setVerticalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshCourses)
                    .addComponent(addCourse))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        allPanels.addTab("tab4", coursesPanel);

        contentPanel.add(allPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -39, -1, 640));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
            .addComponent(horizontalNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(horizontalNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(verticalNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticalNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // la methode qui remplie les statistics de home page
    private void fillHomePanel() {
        adminConnected.setText(connected);
        int nbrStudents = User.getTotalUsers("student");
        int nbrTeachers = User.getTotalUsers("teacher");
        int nbrAdmins = User.getTotalUsers("admin");
        int nbrCourses = Course.getTotalCourses();

        studentsNumber.setText("" + nbrStudents);
        teachersNumber.setText("" + nbrTeachers);
        adminsNumber.setText("" + nbrAdmins);
        coursesNumber.setText("" + nbrCourses);
    }

    // la methode qui remplie le tableau des students
    private void fillStudentTable() {
        ArrayList<Student> students = Student.getAllStudents();
        String[][] data = new String[students.size()][3];
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).getLastname().toUpperCase() + " " + students.get(i).getFirstname();
            data[i][0] = name;
            data[i][1] = students.get(i).getUsername();
            data[i][2] = students.get(i).getLevel();
        }

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Full Name", "Username", "Level", "Edit", "Delete"
                }
        ));

        studentsTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        studentsTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = studentsTable.getColumnModel();
        model.getColumn(3).setCellRenderer(new ButtonEdit());
        model.getColumn(4).setCellRenderer(new ButtonDelete());
        model.getColumn(3).setCellEditor(new CellEditorEdit(new JCheckBox(), "student"));
        model.getColumn(4).setCellEditor(new CellEditorDelete(new JCheckBox(), "student"));

    }

    // la methode qui remplie le tableau des teachers
    private void fillTeacherTable() {
        ArrayList<Teacher> teachers = Teacher.getAllTeachers();
        String[][] data = new String[teachers.size()][4];
        for (int i = 0; i < teachers.size(); i++) {
            String name = teachers.get(i).getLastname().toUpperCase() + " " + teachers.get(i).getFirstname();
            String has = teachers.get(i).getHasCourses();
            data[i][0] = name;
            data[i][1] = teachers.get(i).getUsername();
            data[i][2] = teachers.get(i).getHasCourses();
            if (has.equals("no")) {
                data[i][3] = "0";
            } else {
                data[i][3] = teachers.get(i).getTotalCourses();
            }

        }

        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Full Name", "Username", "has courses", "total courses", "Edit", "Delete"
                }
        ));

        teachersTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        teachersTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = teachersTable.getColumnModel();
        model.getColumn(4).setCellRenderer(new ButtonEdit());
        model.getColumn(5).setCellRenderer(new ButtonDelete());
        model.getColumn(4).setCellEditor(new CellEditorEdit(new JCheckBox(), "teacher"));
        model.getColumn(5).setCellEditor(new CellEditorDelete(new JCheckBox(), "teacher"));

    }

    // la methode qui remplie le tableau des courses
    private void fillCourseTable() {
        ArrayList<Course> courses = Course.getAllCourses();
        String[][] data = new String[courses.size()][3];
        for (int i = 0; i < courses.size(); i++) {

            data[i][0] = courses.get(i).getLibelle();
            data[i][1] = courses.get(i).getLevel();
            if (courses.get(i).getAffected().equals("no")) {
                data[i][2] = "-";
            } else {
                data[i][2] = courses.get(i).getTeacher();
            }

        }

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Label", "Level", "Teacher", "Edit", "Delete"
                }
        ));

        coursesTable.getTableHeader().setFont(new java.awt.Font("Montserrat", 1, 14));
        coursesTable.getTableHeader().setForeground(new Color(0f, 0f, 0f, 0.7f));
        TableColumnModel model = coursesTable.getColumnModel();
        model.getColumn(3).setCellRenderer(new ButtonEdit());
        model.getColumn(4).setCellRenderer(new ButtonDelete());
        model.getColumn(3).setCellEditor(new CellEditorEdit(new JCheckBox(), "course"));
        model.getColumn(4).setCellEditor(new CellEditorDelete(new JCheckBox(), "course"));

    }

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        this.dispose();
        new Login_Form().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        contentTitle.setText("Home");
        fillHomePanel();
        allPanels.setSelectedIndex(0);

    }//GEN-LAST:event_homeButtonMouseClicked


    private void studentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsButtonMouseClicked
        contentTitle.setText("Students");
        fillStudentTable();
        allPanels.setSelectedIndex(1);
    }//GEN-LAST:event_studentsButtonMouseClicked

    private void teachersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersButtonMouseClicked
        contentTitle.setText("Teachers");
        fillTeacherTable();
        allPanels.setSelectedIndex(2);
    }//GEN-LAST:event_teachersButtonMouseClicked

    private void coursesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesButtonMouseClicked
        contentTitle.setText("Courses");
        fillCourseTable();
        allPanels.setSelectedIndex(3);
    }//GEN-LAST:event_coursesButtonMouseClicked

    private void adminConnectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminConnectedMouseClicked
    }//GEN-LAST:event_adminConnectedMouseClicked

    private void contentTitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTitle1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contentTitle1MouseClicked

    private void contentTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTitleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contentTitleMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        fillStudentTable();
    }//GEN-LAST:event_refreshMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        EditStudent.showEdit("", "add");
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseEntered

    private void addTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTeacherMouseClicked
        EditTeacher.showEdit("", "add");
    }//GEN-LAST:event_addTeacherMouseClicked

    private void addTeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTeacherMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addTeacherMouseEntered

    private void refreshTeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshTeachersMouseClicked
        fillTeacherTable();
    }//GEN-LAST:event_refreshTeachersMouseClicked

    private void addCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCourseMouseClicked
        EditCourse.showEdit("", "add");
    }//GEN-LAST:event_addCourseMouseClicked

    private void addCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCourseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addCourseMouseEntered

    private void refreshCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCoursesMouseClicked
        fillCourseTable();
    }//GEN-LAST:event_refreshCoursesMouseClicked

    // inner class that generate the edit button
    public class ButtonEdit extends JButton implements TableCellRenderer {

        public ButtonEdit() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setBorderPainted(false);
            setFocusPainted(false);
            setBackground(new Color(74, 210, 149));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png")));
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // inner class that generate the delete button
    public class ButtonDelete extends JButton implements TableCellRenderer {

        public ButtonDelete() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setBorderPainted(false);
            setFocusPainted(false);
            setBackground(new Color(244, 67, 54));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete2.png")));
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // inner class that used to make edit button clickable
    public class CellEditorEdit extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean clicked;
        private int row, col;
        private JTable table;

        private String tableToEdit;

        public CellEditorEdit(JCheckBox checkBox, String tableToEdit) {
            super(checkBox);
            this.tableToEdit = tableToEdit;
            button = new JButton();
            button.setOpaque(true);
            button.setBackground(new Color(211, 243, 238));
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png")));
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
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png")));
            label = (value == null) ? "" : value.toString();
            //button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                //Action au clic de la souris
                if (tableToEdit.equals("student") || tableToEdit.equals("teacher")) {
                    edit(table.getValueAt(row, 1).toString(), tableToEdit);
                }else{
                    edit(table.getValueAt(row, 0).toString(), tableToEdit);
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

    // la methode edit
    public void edit(String str, String table) {
        //traitements
        if (table.equals("student")) {
            EditStudent.showEdit(str, "edit");
        } else if (table.equals("teacher")) {
            EditTeacher.showEdit(str, "edit");
        } else {
            EditCourse.showEdit(str, "edit");
        }

    }

    // inner class that used to make delete button clickable
    public class CellEditorDelete extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean clicked;
        private int row, col;
        private JTable table;

        private String tableToDelete;

        public CellEditorDelete(JCheckBox checkBox, String tableToDelete) {
            super(checkBox);
            this.tableToDelete = tableToDelete;
            button = new JButton();
            button.setOpaque(true);
            button.setBackground(new Color(211, 243, 238));
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete2.png")));
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
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete2.png")));
            label = (value == null) ? "" : value.toString();
            //button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                //Action au clic de la souris
                if (tableToDelete.equals("student") || tableToDelete.equals("teacher")) {
                    delete(table.getValueAt(row, 1).toString(), tableToDelete);
                }else{
                    delete(table.getValueAt(row, 0).toString(), tableToDelete);
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

    // la methode delete
    public void delete(String str, String table) {
        //traitements

        int result = JOptionPane.showConfirmDialog(this, "Sure? You want to delete?", "ELearning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            if (table.equals("student")) {
                int count = Student.deleteStudentByUsername(str);
                if (count == 1) {
                    fillStudentTable();
                } else {
                    System.out.println("error deleting " + table);
                }
            } else if (table.equals("teacher")) {
                int count = Teacher.deleteTeacherByUsername(str);
                if (count == 1) {
                    fillTeacherTable();
                } else {
                    System.out.println("error deleting " + table);
                }
            } else {
                int count = Course.deleteCourseByLibelle(str);
                if (count == 1) {
                    fillCourseTable();
                } else {
                    System.out.println("error deleting " + table);
                }
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoText;
    private javax.swing.JLabel add;
    private javax.swing.JLabel addCourse;
    private javax.swing.JLabel addTeacher;
    private javax.swing.JLabel adminConnected;
    private javax.swing.JLabel adminsNumber;
    private javax.swing.JTabbedPane allPanels;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel contentTitle;
    private javax.swing.JLabel contentTitle1;
    private javax.swing.JLabel coursesButton;
    private javax.swing.JLabel coursesNumber;
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JTable coursesTable;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel horizontalNavBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel refreshCourses;
    private javax.swing.JLabel refreshTeachers;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel statisticsTitle;
    private javax.swing.JLabel studentsButton;
    private javax.swing.JLabel studentsNumber;
    private javax.swing.JPanel studentsPanel;
    private javax.swing.JTable studentsTable;
    private javax.swing.JLabel teachersButton;
    private javax.swing.JLabel teachersNumber;
    private javax.swing.JPanel teachersPanel;
    private javax.swing.JTable teachersTable;
    private javax.swing.JPanel verticalNavBar;
    // End of variables declaration//GEN-END:variables
}
