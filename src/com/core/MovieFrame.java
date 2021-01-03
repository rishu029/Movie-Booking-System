 
package com.core;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MovieFrame extends javax.swing.JFrame {

    Connection conn;
    ArrayList movieTicket = new ArrayList();

    public void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "1234");
            System.out.println("Connection Created Successfully MovieFRame");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void lineNumber1() {
        if (chk_a1.isSelected()) {
            movieTicket.add(chk_a1.getText());
        }
        if (chk_a2.isSelected()) {
            movieTicket.add(chk_a2.getText());
        }
        if (chk_a3.isSelected()) {
            movieTicket.add(chk_a3.getText());
        }
        if (chk_a4.isSelected()) {
            movieTicket.add(chk_a4.getText());
        }
        if (chk_a5.isSelected()) {
            movieTicket.add(chk_a5.getText());
        }
        if (chk_a6.isSelected()) {
            movieTicket.add(chk_a6.getText());
        }
        if (chk_a7.isSelected()) {
            movieTicket.add(chk_a7.getText());
        }
        if (chk_a8.isSelected()) {
            movieTicket.add(chk_a8.getText());
        }
        if (chk_a9.isSelected()) {
            movieTicket.add(chk_a9.getText());
        }
        if (chk_a10.isSelected()) {
            movieTicket.add(chk_a10.getText());
        }
    }

    public void lineNumber1BookedTickets() {
        ArrayList bookedTicket = new ArrayList();

        try {
            PreparedStatement preStmt = conn.prepareStatement("select custSeatNum from purchasemovieticket");
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                bookedTicket.add(rs.getString(1));
            }
            
            System.out.println(bookedTicket);
            
            for (Object o : bookedTicket) {
                String ticketnum = o.toString();
                //ticketnum = ticketnum.toLowerCase();
                
                System.out.println("Update Ticket is  = "+ticketnum);

                if (chk_a1.getText().equals(ticketnum)) {
                    chk_a1.setEnabled(false);                   
                }
                if (chk_a2.getText().equals(ticketnum)) {
                    chk_a2.setEnabled(false);    
                }
                if (chk_a3.getText().equals(ticketnum)) {
                    chk_a3.setEnabled(false);    
                }
                if (chk_a4.getText().equals(ticketnum)) {
                    chk_a4.setEnabled(false);    
                }
                if (chk_a5.getText().equals(ticketnum)) {
                    chk_a5.setEnabled(false);    
                }
                if (chk_a6.getText().equals(ticketnum)) {
                    chk_a6.setEnabled(false);    
                }
                if (chk_a7.getText().equals(ticketnum)) {
                    chk_a7.setEnabled(false);    
                }
                if (chk_a8.getText().equals(ticketnum)) {
                    chk_a8.setEnabled(false);    
                }
                if (chk_a9.getText().equals(ticketnum)) {
                    chk_a9.setEnabled(false);    
                }
                if (chk_a10.getText().equals(ticketnum)) {
                    chk_a10.setEnabled(false);    
                }
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public MovieFrame() {
        initComponents();
        createConnection();
        lineNumber1BookedTickets();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_screen = new javax.swing.JLabel();
        chk_a1 = new javax.swing.JCheckBox();
        chk_a2 = new javax.swing.JCheckBox();
        chk_a3 = new javax.swing.JCheckBox();
        chk_a4 = new javax.swing.JCheckBox();
        chk_a5 = new javax.swing.JCheckBox();
        chk_a6 = new javax.swing.JCheckBox();
        chk_a7 = new javax.swing.JCheckBox();
        chk_a8 = new javax.swing.JCheckBox();
        chk_a9 = new javax.swing.JCheckBox();
        chk_a10 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chk_b1 = new javax.swing.JCheckBox();
        chk_b2 = new javax.swing.JCheckBox();
        chk_b3 = new javax.swing.JCheckBox();
        chk_b4 = new javax.swing.JCheckBox();
        chk_b5 = new javax.swing.JCheckBox();
        chk_b6 = new javax.swing.JCheckBox();
        chk_b7 = new javax.swing.JCheckBox();
        chk_b8 = new javax.swing.JCheckBox();
        chk_b9 = new javax.swing.JCheckBox();
        chk_b10 = new javax.swing.JCheckBox();
        btn_pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screen.png"))); // NOI18N

        chk_a1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a1.setText("A1");

        chk_a2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a2.setText("A2");

        chk_a3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a3.setText("A3");

        chk_a4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a4.setText("A4");
        chk_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_a4ActionPerformed(evt);
            }
        });

        chk_a5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a5.setText("A5");

        chk_a6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a6.setText("A6");

        chk_a7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a7.setText("A7");

        chk_a8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a8.setText("A8");

        chk_a9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a9.setText("A9");

        chk_a10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_a10.setText("A10");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ENTERANCE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        chk_b1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b1.setText("B1");

        chk_b2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b2.setText("B2");

        chk_b3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b3.setText("B3");

        chk_b4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b4.setText("B4");

        chk_b5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b5.setText("B5");

        chk_b6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b6.setText("B6");

        chk_b7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b7.setText("B7");

        chk_b8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b8.setText("B8");

        chk_b9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b9.setText("B9");

        chk_b10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        chk_b10.setText("B10");

        btn_pay.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_pay.setText("PAy");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_pay)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_b1)
                            .addComponent(chk_a1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(chk_b2)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b3)
                                .addGap(30, 30, 30)
                                .addComponent(chk_b4)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(chk_a2)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a3)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a4)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a5)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_a6)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a7)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a8)
                                .addGap(18, 18, 18)
                                .addComponent(chk_a9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk_a10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_b6)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b7)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b8)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b9)
                                .addGap(18, 18, 18)
                                .addComponent(chk_b10))))
                    .addComponent(lbl_screen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_screen)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chk_a6)
                                    .addComponent(chk_a7)
                                    .addComponent(chk_a8)
                                    .addComponent(chk_a10)
                                    .addComponent(chk_a9))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chk_b6)
                                    .addComponent(chk_b7)
                                    .addComponent(chk_b8)
                                    .addComponent(chk_b9)
                                    .addComponent(chk_b10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(416, 416, 416)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chk_a1)
                                    .addComponent(chk_a2)
                                    .addComponent(chk_a3)
                                    .addComponent(chk_a4)
                                    .addComponent(chk_a5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_b1)
                            .addComponent(chk_b2)
                            .addComponent(chk_b3)
                            .addComponent(chk_b4)
                            .addComponent(chk_b5))))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chk_a1, chk_a10, chk_a2, chk_a3, chk_a4, chk_a5, chk_a6, chk_a7, chk_a8, chk_a9, chk_b1, chk_b10, chk_b2, chk_b3, chk_b4, chk_b5, chk_b6, chk_b7, chk_b8, chk_b9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed

        try {

            lineNumber1();

            System.out.println(movieTicket);

            PreparedStatement preStmt = conn.prepareStatement("insert into purchaseMovieTicket values (?,?)");
            for (Object ticket : movieTicket) {
                preStmt.setString(1, LoginForm.userName);
                preStmt.setString(2, ticket.toString());
                preStmt.executeUpdate();
            }
            preStmt.close();
            JOptionPane.showMessageDialog(rootPane, "Movie Tickets Booked !!!");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_payActionPerformed

    private void chk_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_a4ActionPerformed

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
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pay;
    private javax.swing.JCheckBox chk_a1;
    private javax.swing.JCheckBox chk_a10;
    private javax.swing.JCheckBox chk_a2;
    private javax.swing.JCheckBox chk_a3;
    private javax.swing.JCheckBox chk_a4;
    private javax.swing.JCheckBox chk_a5;
    private javax.swing.JCheckBox chk_a6;
    private javax.swing.JCheckBox chk_a7;
    private javax.swing.JCheckBox chk_a8;
    private javax.swing.JCheckBox chk_a9;
    private javax.swing.JCheckBox chk_b1;
    private javax.swing.JCheckBox chk_b10;
    private javax.swing.JCheckBox chk_b2;
    private javax.swing.JCheckBox chk_b3;
    private javax.swing.JCheckBox chk_b4;
    private javax.swing.JCheckBox chk_b5;
    private javax.swing.JCheckBox chk_b6;
    private javax.swing.JCheckBox chk_b7;
    private javax.swing.JCheckBox chk_b8;
    private javax.swing.JCheckBox chk_b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_screen;
    // End of variables declaration//GEN-END:variables
}
