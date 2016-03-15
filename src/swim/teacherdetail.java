/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cnuser;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static swim.cn.cn;


/**
 *
 * @author tinnakorn
 */
public class teacherdetail extends javax.swing.JFrame {

   
    DefaultTableModel model = new DefaultTableModel();
    
    public teacherdetail() {
        initComponents();
    model.addColumn("ผู้สอน");
         model.addColumn("ชื่อผู้สมัคร");
        model.addColumn("รหัสบัตรประชาชน");
        model.addColumn("ติดต่อ");
        model.addColumn("วันเกิด");
        model.addColumn("ประเภท");
        model.addColumn("คอร์สเรียน");
       
      
     try{
ResultSet rs = cn().executeQuery("Select r_name_user,r_name_trainer,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures from registerstudy");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_name_trainer"),rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
    ,rs.getString("r_coures")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);
   
   
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 130, 837, 310);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("แสดงรายละเอียดผู้สมัครเข้าเรียนการว่ายน้ำ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(343, 28, 359, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/home-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 20, 60, 70);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 90, 260, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("ค้นหาจากชื่อ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 90, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/pexels-photo.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1010, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
teachermain te = new teachermain();
te.setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String text = jTextField1.getText();
        try{
            model.setRowCount(0);
ResultSet rs = cn().executeQuery("Select r_name_user,r_name_trainer,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures from registerstudy where r_name_trainer like '%"+text+"%' or r_coures like '%"+text+"%'");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_name_trainer"),rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
    ,rs.getString("r_coures")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
   int dialogButton = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING",JOptionPane.YES_NO_OPTION);

if(dialogButton == JOptionPane.YES_OPTION) {
System.exit(0);}else {remove(dialogButton);}   
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(teacherdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
