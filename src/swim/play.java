/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static swim.cn.cn;
import static swim.cn.cnuser;

/**
 *
 * @author kanin
 */
public class play extends javax.swing.JFrame {

     Connection connection;
        PreparedStatement ps;
    
    public play() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        user1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel1.setText("Welcome to swiming pool");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 40, 348, 66);

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel2.setText("ID CARD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 150, 64, 34);

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 210, 57, 34);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(470, 210, 193, 34);

        jButton1.setText("����к�");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 350, 100, 53);

        jButton2.setText("��͹��Ѻ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 350, 102, 53);
        getContentPane().add(user1);
        user1.setBounds(470, 150, 193, 34);

        jButton3.setText("�͡�к�");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 350, 100, 53);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/swimming.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainadmin go = new mainadmin();
        go.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Connection connection;
        PreparedStatement ps;
       
        
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost/swim" +
                    "?user=root&password=");
           int u;
            ps = connection.prepareStatement("SELECT * FROM `user` WHERE `u_id` = ?");
            ps.getResultSet();
            ps.setString(1,user1.getText());
            ResultSet result = ps.executeQuery();
           if(result.next()){

              Statement stmt = null; 
         cn c = new cn();
         stmt = c.cnuser();
        String user = name.getText();
      String result2 = "INSERT INTO play(name)VALUES('"+user+"')";
       stmt.executeUpdate(result2);
       
       JOptionPane.showMessageDialog(null,"�ѹ�֡���º����");

            }
else{
                JOptionPane.showMessageDialog(null,"���ʼ�ҹ���١��ͧ");
            }

        } catch (SQLException ex) {
            Logger.getLogger(swim.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
   
    }//GEN-LAST:event_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 Connection connection;
        PreparedStatement ps;
       
        
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost/swim" +
                    "?user=root&password=");
           int u;
            ps = connection.prepareStatement("SELECT * FROM `user` WHERE `u_id` = ?");
            ps.getResultSet();
            ps.setString(1,user1.getText());
            ResultSet result = ps.executeQuery();
           if(result.next()){

            Statement stmt = null; 
        cn c = new cn();
        stmt = c.cnuser();
        String user = name.getText();
        String result2 = "Delete  From play where name = '"+user+"'";
        stmt.executeUpdate(result2);
       
       JOptionPane.showMessageDialog(null,"�ѹ�֡���º����");

            }
else{
                JOptionPane.showMessageDialog(null,"���ʼ�ҹ���١��ͧ");
            }

        } catch (SQLException ex) {
            Logger.getLogger(swim.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        
        
        
        
        
        
        
//                  try{
//ResultSet rs = cn().executeQuery("Select * from user");
//    while(rs.next()) {
//
//        if(user1.getText().equals(rs.getString("u_id"))){
//            
//
//        
//            
// JOptionPane.showMessageDialog(null,rs.getString("u_name"));
// 
//        
// 
//
//        
// 
// 
// 
// try
//     {
//         Statement stmt = null; 
//         cn c = new cn();
//         stmt = c.cn();
//        String user = name.getText();
//      String result2 = "Delete  From play where name = '"+user+"'";
//       stmt.executeUpdate(result2);
//
//
//JOptionPane.showMessageDialog(null,"�͡�ҡ�к�����");
//
//     }
// 
//     catch(Exception e)
//     {
//         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
//
//     }   
// 
// 
//            
//        }
//        
//        
//         else{
//             JOptionPane.showMessageDialog(null,"�������");
//        }
//
//    }
//    }catch(Exception e){System.err.println(e);}
//try
//     {
//         
//         
//         Statement stmt = null; 
//         cn c = new cn();
//         stmt = c.cn();
//         String name1 = name.getText();
//      String result2 = "delete from play where name = '"+name1+"'";
//        stmt.executeUpdate(result2);
//     }
//     catch(Exception e)
//     {
//         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
//
//     }   
    }//GEN-LAST:event_jButton3ActionPerformed

    /** Statement stmt = null; 
         cn c = new cn();
         stmt = c.cn();
        String user = name.getText();
      String result2 = "Delete  From play where name = '"+user+"'";
       stmt.executeUpdate(result2);
       
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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
