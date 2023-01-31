/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entities.Teacher;
import javax.swing.JOptionPane;

/**
 *
 * @author AHDDAD
 */
public class EditTeacher extends javax.swing.JFrame {

    private String username;
    private String typeOperation;

    public EditTeacher(String username, String typeOperation) {
        this.username = username;
        this.typeOperation = typeOperation;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        if (typeOperation.equals("edit")) {
            this.setTitle("Edit");
            title.setText("Edit Teacher");
            Teacher t = Teacher.getTeacherByUsername(username);
            usernameInput.setText(t.getUsername());
            passwordInput.setText(t.getPass());
            firstnameInput.setText(t.getFirstname());
            lastnameInput.setText(t.getLastname());
        } else {
            this.setTitle("new teacher");
            title.setText("Add Teacher");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        firstnameInput = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        savePanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        passwordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editPanel.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(230, 98, 108));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        title.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Edit Teacher");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Logo)
                .addGap(92, 92, 92)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        firstnameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        firstnameLabel.setText("First name");

        firstnameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        firstnameInput.setForeground(new java.awt.Color(51, 51, 51));
        firstnameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstnameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        lastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastnameLabel.setText("Last name");

        lastnameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lastnameInput.setForeground(new java.awt.Color(51, 51, 51));
        lastnameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastnameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        passwordLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password");

        usernameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setText("Username");

        usernameInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        usernameInput.setForeground(new java.awt.Color(51, 51, 51));
        usernameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        savePanel.setBackground(new java.awt.Color(230, 98, 108));

        saveButton.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        showPassword.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        showPassword.setText("show password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        passwordInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));
        passwordInput.setMaximumSize(new java.awt.Dimension(64, 20));

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(42, 42, 42)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassword)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(firstnameLabel)
                        .addGap(34, 34, 34)
                        .addComponent(firstnameInput))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                        .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassword)
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        String newUsername = usernameInput.getText();
        String newPass = passwordInput.getText();
        String first = firstnameInput.getText();
        String last = lastnameInput.getText();

        if (!first.isEmpty() && !last.isEmpty() && !newUsername.isEmpty() && !newPass.isEmpty()) {

            if (typeOperation.equals("edit")) {
                int count = Teacher.updateTeacher(username, newUsername, newPass, first, last);
                if (count == 1) {
                    JOptionPane.showMessageDialog(this, "teacher edited successfully", "ELearning", JOptionPane.DEFAULT_OPTION);
                    dispose();
                } else if (count == -100) {
                    JOptionPane.showMessageDialog(this, "username already used", "ELearning", JOptionPane.ERROR_MESSAGE);
                } else{
                    System.out.println("error editing teacher");
                }
            } else {
                
                int count = Teacher.addTeacher(newUsername, newPass, first, last);
                if (count == 1) {
                    JOptionPane.showMessageDialog(this, "teacher added successfully", "ELearning", JOptionPane.DEFAULT_OPTION);
                    dispose();
                } else if (count == -100) {
                    JOptionPane.showMessageDialog(this, "username already used", "ELearning", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("rsult = "+count);
                    System.out.println("error adding");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "incomplete informations !", "ELearning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordInput.setEchoChar((char) 0);
        } else {
            passwordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    // la methode showEdit
    public static void showEdit(String user, String typeOperation) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTeacher(user, typeOperation).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JPanel header;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel saveButton;
    private javax.swing.JPanel savePanel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel title;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}