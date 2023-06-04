/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.SHS.UI.Admin;

import java.awt.Cursor;
import static java.lang.Integer.parseInt;
import main.java.SHS.Student;
import main.java.SHS.Services.StudentService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.java.SHS.Application;
import main.java.SHS.BookedRoom;
import main.java.SHS.Room;
import main.java.SHS.Services.ApplicationService;
import main.java.SHS.Services.BookedRoomService;
import main.java.SHS.Services.RoomService;
import main.java.SHS.Student_Hostel_System;
import main.java.SHS.UI.UI_Login;
import main.java.SHS.UI.UI_Rooms;
/**
 *
 * @author User
 */
public class UI_Admin_Manage_User extends javax.swing.JFrame {

    /**
     * Creates new form UI_Admin_Manage
     */
    public UI_Admin_Manage_User() {
        initComponents();
        
        UserButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RoomsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        ArrayList<Student> students = StudentService.getStudentService().getStudents();
        
        DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        for(int i = 0; i < students.size(); i++){
            model.addRow(new Object[0]);
            model.setValueAt(students.get(i).getUserId(), i, 0);
            model.setValueAt(students.get(i).getUsername(), i, 1);
            model.setValueAt(students.get(i).getFullname(), i, 2);
            model.setValueAt(students.get(i).getUserEmail(), i, 3);
            model.setValueAt(students.get(i).getAge(), i, 4);
            model.setValueAt(students.get(i).getGender(), i, 5);
            model.setValueAt(students.get(i).getContact(), i, 6);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SearchTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserButton = new javax.swing.JLabel();
        RoomsButton = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        DeleteUser = new javax.swing.JButton();
        EvictBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ManageHeader2 = new javax.swing.JButton();
        ReportsBtn = new javax.swing.JButton();
        RecordsBtn = new javax.swing.JButton();
        LogOut = new javax.swing.JLabel();
        ApplicationsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 225, 228));

        UsersTable.setForeground(new java.awt.Color(92, 128, 188));
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Full Name", "Email", "Age", "Gender", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(UsersTable);
        if (UsersTable.getColumnModel().getColumnCount() > 0) {
            UsersTable.getColumnModel().getColumn(0).setMinWidth(25);
            UsersTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            UsersTable.getColumnModel().getColumn(0).setMaxWidth(25);
            UsersTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            UsersTable.getColumnModel().getColumn(4).setMinWidth(30);
            UsersTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            UsersTable.getColumnModel().getColumn(4).setMaxWidth(30);
            UsersTable.getColumnModel().getColumn(5).setMinWidth(50);
            UsersTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            UsersTable.getColumnModel().getColumn(5).setMaxWidth(50);
            UsersTable.getColumnModel().getColumn(6).setMinWidth(80);
            UsersTable.getColumnModel().getColumn(6).setPreferredWidth(80);
            UsersTable.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 128, 188));
        jLabel3.setText("Users");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(92, 128, 188));
        jPanel3.setForeground(new java.awt.Color(92, 128, 188));
        jPanel3.setPreferredSize(new java.awt.Dimension(403, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        SearchTxt.setText("Search...");
        SearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTxtActionPerformed(evt);
            }
        });
        SearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTxtKeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Search Icon.png"))); // NOI18N

        UserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Users (Selected).png"))); // NOI18N
        UserButton.setText("jLabel4");

        RoomsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Rooms.png"))); // NOI18N
        RoomsButton.setText("jLabel4");
        RoomsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsButtonMouseClicked(evt);
            }
        });

        jButton4.setText("View Student Details");

        DeleteUser.setText("Delete");
        DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserActionPerformed(evt);
            }
        });

        EvictBtn.setText("Evict");
        EvictBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvictBtnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(92, 128, 188));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/SHS Logo Header.png"))); // NOI18N

        ManageHeader2.setBackground(new java.awt.Color(92, 128, 188));
        ManageHeader2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ManageHeader2.setForeground(new java.awt.Color(217, 225, 228));
        ManageHeader2.setText("Management");
        ManageHeader2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageHeader2ActionPerformed(evt);
            }
        });

        ReportsBtn.setBackground(new java.awt.Color(92, 128, 188));
        ReportsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ReportsBtn.setForeground(new java.awt.Color(217, 225, 228));
        ReportsBtn.setText("Reports");
        ReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsBtnActionPerformed(evt);
            }
        });

        RecordsBtn.setBackground(new java.awt.Color(92, 128, 188));
        RecordsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RecordsBtn.setForeground(new java.awt.Color(217, 225, 228));
        RecordsBtn.setText("Records");
        RecordsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordsBtnActionPerformed(evt);
            }
        });

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Logout button.png"))); // NOI18N
        LogOut.setText("jLabel1");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });

        ApplicationsBtn.setBackground(new java.awt.Color(92, 128, 188));
        ApplicationsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ApplicationsBtn.setForeground(new java.awt.Color(217, 225, 228));
        ApplicationsBtn.setText("Applications");
        ApplicationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ApplicationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LogOut))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApplicationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(SearchTxt)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(EvictBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(73, 73, 73)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(EvictBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(UserButton)
                                .addGap(26, 26, 26)
                                .addComponent(RoomsButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserActionPerformed
       if(UsersTable.getSelectedRowCount()==1) {
        int removeConfirmation = JOptionPane.showOptionDialog(jPanel1, "Confirm to remove user" + "?", "Confirmation",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
       
       DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();         
       int userID = parseInt(model.getValueAt(UsersTable.getSelectedRow(), 0).toString());
                if (removeConfirmation == JOptionPane.OK_OPTION) {
                    Student removeStudent = StudentService.getStudentService().getStudent(userID);
                    StudentService.getStudentService().deleteStudent(removeStudent);
                    JOptionPane.showMessageDialog(jPanel1,"Student removed successfully.","Alert",JOptionPane.INFORMATION_MESSAGE);
                    model.removeRow(UsersTable.getSelectedRow());
                }
       }
       else {
            if(UsersTable.getRowCount()==0) {
                JOptionPane.showMessageDialog(this, "Table is empty...");
            }
            else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row for Delete...");
            }
        }
       
    }//GEN-LAST:event_DeleteUserActionPerformed

    private void RoomsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsButtonMouseClicked
        this.setVisible(false);
        UI_Admin_Manage_Rooms UIAMR = new UI_Admin_Manage_Rooms();
        UIAMR.setVisible(true);
    }//GEN-LAST:event_RoomsButtonMouseClicked

    private void SearchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTxtKeyReleased
        DefaultTableModel table  = (DefaultTableModel)UsersTable.getModel();
        String search = SearchTxt.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        UsersTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchTxtKeyReleased

    private void EvictBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvictBtnActionPerformed
        if(UsersTable.getSelectedRowCount()==1) {
            
            DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();         
            String Username = model.getValueAt(UsersTable.getSelectedRow(), 1).toString();
            
            BookedRoomService bookedRoomService = BookedRoomService.getBookedRoomService();
            BookedRoom bookedRoom = bookedRoomService.getLatestBookedRoom(Username);
            
            if ("Evicted".equals(bookedRoom.getStatus())) {
                JOptionPane.showMessageDialog(null, "Student Already Evicted", "Check Out", JOptionPane.WARNING_MESSAGE);
            return; // Stop further processing
            }
            
            ApplicationService applicationService = new ApplicationService();
            Application application = applicationService.getApplication(Username);
            
            
        int confirmDialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to evict student? This cannot be undone.", "Check Out Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmDialogResult == JOptionPane.YES_OPTION) {
            applicationService.updateApplication(bookedRoom.getApplicationID(), "Evicted");

            RoomService roomService = RoomService.getRoomService();
            Room room = roomService.getRoom(bookedRoom.getRoomNumber());
            roomService.updateRoom(room, "Available");
            
            // Create a new booked room record with the same details but with status "Checked Out"
            BookedRoom EvictedRoom = new BookedRoom(bookedRoom.getBookedRoomID(), bookedRoom.getStudentID(), bookedRoom.getStudentName(),
                    bookedRoom.getApplicationID(), bookedRoom.getPaymentID(), bookedRoom.getStartDate(), bookedRoom.getEndDate(),
                    bookedRoom.getLos(), "Evicted", bookedRoom.getRoomNumber(), bookedRoom.getRoomType(), bookedRoom.getFurnish(),
                    bookedRoom.getAvailability(), bookedRoom.getPrice());

            bookedRoomService.addBookedRoom(EvictedRoom);
            
            JOptionPane.showMessageDialog(null, "Successfully Evicted Student.", "Checked out", JOptionPane.WARNING_MESSAGE);

        }
        
        }
        else {
            if(UsersTable.getRowCount()==0) {
                JOptionPane.showMessageDialog(this, "Table is empty...");
            }
            else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row only...");
            }
        }
    }//GEN-LAST:event_EvictBtnActionPerformed

    private void SearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTxtActionPerformed

    private void ManageHeader2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageHeader2ActionPerformed
        this.setVisible(false);
        UI_Admin_Manage_User UIAMU = new UI_Admin_Manage_User();
        UIAMU.setVisible(true);
    }//GEN-LAST:event_ManageHeader2ActionPerformed

    private void ReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsBtnActionPerformed
        this.setVisible(false);
        UI_Admin_Reports UIAR = new UI_Admin_Reports();
        UIAR.setVisible(true);
    }//GEN-LAST:event_ReportsBtnActionPerformed

    private void RecordsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordsBtnActionPerformed
        this.setVisible(false);
        UI_Admin_Records_UserLogins UIARUL = new UI_Admin_Records_UserLogins();
        UIARUL.setVisible(true);
    }//GEN-LAST:event_RecordsBtnActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        UI_Login ul = new UI_Login();
        ul.setVisible(true);
        ul.pack();
        ul.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void ApplicationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationsBtnActionPerformed
        this.setVisible(false);
        UI_Admin_Applications UIAA = new UI_Admin_Applications();
        UIAA.setVisible(true);
    }//GEN-LAST:event_ApplicationsBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Admin_Manage_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Admin_Manage_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Admin_Manage_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Admin_Manage_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Admin_Manage_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplicationsBtn;
    private javax.swing.JButton DeleteUser;
    private javax.swing.JButton EvictBtn;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton ManageHeader2;
    private javax.swing.JButton RecordsBtn;
    private javax.swing.JButton ReportsBtn;
    private javax.swing.JLabel RoomsButton;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JLabel UserButton;
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
