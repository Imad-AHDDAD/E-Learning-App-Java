/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entities.Course;
import entities.Teacher;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author AHDDAD
 */
public class EditCourse extends javax.swing.JFrame {

    private String lib;
    private String typeOperation;

    public EditCourse(String lib, String typeOperation) {

        this.lib = lib;
        this.typeOperation = typeOperation;
        initComponents();
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Course c = Course.getCourseByLibelle(lib);
        if (typeOperation.equals("edit")) {
            this.setTitle("Edit");
            title.setText("Edit Course");
            libelleInput.setText(c.getLibelle());
            levelInput.setText(c.getLevel());
            fillTeachersSelect(c);

        } else {
            this.setTitle("new teacher");
            title.setText("Add Teacher");
            fillTeachersSelect(c);
        }
    }

    private void fillTeachersSelect(Course c) {
        ArrayList<Teacher> teachers = Teacher.getAllTeachersWithoutCourse();
        String[] items = new String[teachers.size() + 1];
        String firstItem = "";
        if (c != null && c.getAffected().equals("yes")) {
            firstItem = c.getTeacher();
        } else {
            firstItem = "has no teacher";
        }

        items[0] = firstItem;
        for (int i = 1; i < teachers.size() + 1; i++) {
            items[i] = teachers.get(i - 1).getUsername();
        }

        teacherSelect.setModel(new DefaultComboBoxModel(items));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        levelInput = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        libelleLabel = new javax.swing.JLabel();
        libelleInput = new javax.swing.JTextField();
        savePanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JLabel();
        teacherSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editPanel.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(230, 98, 108));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        title.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Edit Course");

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

        levelLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(51, 51, 51));
        levelLabel.setText("Level");

        levelInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        levelInput.setForeground(new java.awt.Color(51, 51, 51));
        levelInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        levelInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        lastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastnameLabel.setText("Teacher");

        libelleLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        libelleLabel.setForeground(new java.awt.Color(51, 51, 51));
        libelleLabel.setText("Libelle");

        libelleInput.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        libelleInput.setForeground(new java.awt.Color(51, 51, 51));
        libelleInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        libelleInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

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
            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        teacherSelect.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        teacherSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teacherSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 232)));

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(libelleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(libelleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(levelLabel)
                            .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(levelInput, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(teacherSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libelleLabel)
                    .addComponent(libelleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(teacherSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

        String newLib = libelleInput.getText();
        String newLevel = levelInput.getText();
        int indexSelected = teacherSelect.getSelectedIndex();

        if (!newLib.isEmpty() && !newLevel.isEmpty()) {

            ArrayList<Teacher> teachers = Teacher.getAllTeachersWithoutCourse();
            String teacher = "";
            if (indexSelected != 0) {
                teacher = teachers.get(indexSelected - 1).getUsername();
            }
            if (typeOperation.equals("edit")) {

                int count = Course.updateCourse(lib, newLib, newLevel, teacher);
                if (count == 1) {
                    JOptionPane.showMessageDialog(this, "course edited successfully", "ELearning", JOptionPane.DEFAULT_OPTION);
                    dispose();
                } else if (count == -100) {
                    JOptionPane.showMessageDialog(this, "Label already used", "ELearning", JOptionPane.ERROR_MESSAGE);
                } else if (count == -200) {
                    JOptionPane.showMessageDialog(this, "a teacher you choosed has already a course", "ELearning", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("error editing");
                }
            } else {

                int count = Course.addCourse(newLib, newLevel, teacher);
                if (count == 1) {
                    JOptionPane.showMessageDialog(this, "course added successfully", "ELearning", JOptionPane.DEFAULT_OPTION);
                    dispose();
                } else if (count == -100) {
                    JOptionPane.showMessageDialog(this, "label course already used", "ELearning", JOptionPane.ERROR_MESSAGE);

                }else if (count == -200) {
                    JOptionPane.showMessageDialog(this, "a teacher has aleady a course", "ELearning", JOptionPane.ERROR_MESSAGE);

                } else {
                    System.out.println("error adding");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "incomplete informations !", "ELearning", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveButtonMouseClicked

    public static void showEdit(String lib, String typeOperation) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse(lib, typeOperation).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField levelInput;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField libelleInput;
    private javax.swing.JLabel libelleLabel;
    private javax.swing.JLabel saveButton;
    private javax.swing.JPanel savePanel;
    private javax.swing.JComboBox<String> teacherSelect;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
