/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.SHS.UI;

import java.io.*;
<<<<<<< HEAD
=======
import java.util.List;
import main.java.SHS.FileHandlers.FileHandler;
>>>>>>> fb3a8d7d30b2f32923f7fa11bcfc4d1b0b415bf6
import main.java.SHS.FileHandlers.FileRecord;
import main.java.SHS.Student_Hostel_System;
import main.java.SHS.User;
import main.java.SHS.FileHandlers.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class UI_Receipt extends javax.swing.JFrame {
public static String roomid;
    /**
     * Creates new form UI_Receipt
     */
    public UI_Receipt(String roomid) {
        initComponents();
        UI_Receipt.roomid=roomid;
        
        receipt(roomid);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        elbl = new javax.swing.JLabel();
        cnlbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        rtlbl = new javax.swing.JLabel();
        doslbl = new javax.swing.JLabel();
        plbl = new javax.swing.JLabel();
        dlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 225, 228));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("STUDENT INVOICE");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("*********************");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Email :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setText("Contact Number :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setText("Date :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel6.setText("Room No :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel7.setText("Total Paid :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel8.setText("Duration of Stay :");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setText("Room Type :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel10.setText("----------------------------");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        elbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        elbl.setText("Email :");

        cnlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        cnlbl.setText("Contact Number :");

        idlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        idlbl.setText("Room No :");

        rtlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rtlbl.setText("Room Type :");

        doslbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        doslbl.setText("Duration of Stay :");

        plbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        plbl.setText("Total Paid :");

        dlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        dlbl.setText("Date :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(rtlbl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cnlbl)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(plbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(elbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cnlbl))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rtlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(doslbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(plbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dlbl))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
<<<<<<< HEAD
public void receipt(String roomid) {
    
    FileHandler fileHandler = new FileHandler("booking");

    try {
        List<FileRecord> records = fileHandler.FetchRecord();
=======
    /*public void receipt(String roomid){
        String file = "src\\main\\java\\SHS\\Txtfiles\\booking.txt";
        try{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(Student_Hostel_System.current_user.getUsername() + " Student username?");
>>>>>>> fb3a8d7d30b2f32923f7fa11bcfc4d1b0b415bf6
        User current_user = Student_Hostel_System.current_user;
        
        String receipt;
        
        for (FileRecord record : records) {
            String[] data = record.getRecordList();
            if (data[1].equals(current_user.getUsername()) && data[2].equals(roomid)) {
                elbl.setText(data[5]);
                cnlbl.setText(data[6]);
                idlbl.setText(data[2]);
                rtlbl.setText(data[3]);
                doslbl.setText(data[7]);
                plbl.setText(data[4]);
                dlbl.setText(data[9]);
                break;
            }
        }
<<<<<<< HEAD
    } catch (Exception e) {
        System.out.println("Error reading booking records: " + e.getMessage());
}
=======
        br.close();
        }
        catch(FileNotFoundException ex){
            System.out.print("File Not found");
        }
        catch(IOException ex){
            System.out.print("Error");
        }
    }*/
    public void receipt(String roomid) {
    
    FileHandler fileHandler = new FileHandler("booking");

    try {
        List<FileRecord> records = fileHandler.FetchRecord();
        User current_user = Student_Hostel_System.current_user;
        
        String receipt;
        
        for (FileRecord record : records) {
            String[] data = record.getRecordList();
            if (data[1].equals(current_user.getUsername()) && data[2].equals(roomid)) {
                elbl.setText(data[5]);
                cnlbl.setText(data[6]);
                idlbl.setText(data[2]);
                rtlbl.setText(data[3]);
                doslbl.setText(data[7]);
                plbl.setText(data[4]);
                dlbl.setText(data[9]);
                break;
            }
        }
    } catch (Exception e) {
        System.out.println("Error reading booking records: " + e.getMessage());
    }
>>>>>>> fb3a8d7d30b2f32923f7fa11bcfc4d1b0b415bf6
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    UI_Record ur = new UI_Record();
        ur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Receipt(roomid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnlbl;
    private javax.swing.JLabel dlbl;
    private javax.swing.JLabel doslbl;
    private javax.swing.JLabel elbl;
    private javax.swing.JLabel idlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel plbl;
    private javax.swing.JLabel rtlbl;
    // End of variables declaration//GEN-END:variables
}
