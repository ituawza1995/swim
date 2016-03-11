/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cn;
import static swim.cn.cnuser;

/**
 *
 * @author tinnakorn
 */
public class staffregis extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    
    DefaultTableModel model = new DefaultTableModel();
    Calendar c = Calendar.getInstance();
    
    public staffregis() {
        initComponents();
        
         model.addColumn("รหัสบัตรประชาชน");
    model.addColumn("ชื่อ");
    model.addColumn("ประเภทผู้ใช้");
    model.addColumn("สถานะ");
      
     try{
 Connection con = null;
Statement stmt = null;        
 ResultSet rs = cnuser().executeQuery("Select * from user");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("u_id"),rs.getString("u_name"),rs.getString("u_type"),rs.getString("status")});
    }
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);
    
//		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		String currentDate = df.format(c.getTime());
//                jLabel6.setText(currentDate);
//                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
//     String birth = sdf.format(jDateChooser5.getDate());
//     jLabel7.setText(birth);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        jTable1.setFont(jTable1.getFont());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 130, 600, 275);
        getContentPane().add(textField1);
        textField1.setBounds(120, 130, 220, 25);
        textField1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(textField2);
        textField2.setBounds(120, 160, 220, 25);

        jButton1.setText("สมัครว่ายน้ำ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 310, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("รหัสบัตรประชาชน");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 110, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ชื่อ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 160, 20, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" ประเภท");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("วันเกิด");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 220, 38, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "นักเรียน", "นักศึกษา", "บุคคลทั่วไป" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 190, 220, 25);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/home-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(881, 27, 93, 69);

        jDateChooser5.setDateFormatString("dd/MM/yyyy");
        jDateChooser5.setMaxSelectableDate(new java.util.Date(253370743315000L));
        jDateChooser5.setMinSelectableDate(new java.util.Date(-62135791085000L));
        getContentPane().add(jDateChooser5);
        jDateChooser5.setBounds(120, 220, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/pexels-photo.jpeg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                
        String codeid1 = textField1.getText();
        String name1 = textField2.getText();
        String str="0123456789" ;
        if(codeid1.length()==0 || name1.length()==0){
            JOptionPane.showMessageDialog(null,"กรอกข้อมูลให้ครบถ้วน");
            return;
        }
        else if(codeid1.length() < 13 || codeid1.length() >13 || codeid1 != str){
         JOptionPane.showMessageDialog(null,"กรอกเลขบัตรประชาชน 13 หลักให้ถูกต้อง");
            return;
        }
        try
     {
         Statement stmt = null; 
         cn c = new cn();
         stmt = c.cnuser();

         String codeid = textField1.getText();
        String name = textField2.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
     String birth = sdf.format(jDateChooser5.getDate());
        
      String result = "INSERT INTO user(u_id,u_name,u_type,u_birthday)VALUES('"+codeid+"','"+name+"','"+(String)jComboBox1.getSelectedItem()+"','"+birth+"')";
       stmt.executeUpdate(result);


JOptionPane.showMessageDialog(null,"บันทึกแล้ว");

     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }
       
       
       
       
       
            try{
                
    model.setRowCount(0);
    //stm = conn.obtenirconnexion().createStatement();
    ResultSet rs = cnuser().executeQuery("Select * from user");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("u_id"),rs.getString("u_name"),rs.getString("u_type"),rs.getString("status")});
    }
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
/*try{
    int i=jTable1.getSelectedRow();deplace(i);
}
catch (Exception e){JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());}// TODO add your handling code here:
   */        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
staffmain m = new staffmain();
m.setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(staffregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffregis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new staffregis().setVisible(true);
            }
        });
    }
    /*private void deplace(int i){
    try{
    textField1.setText(model.getValueAt(i,0).toString());
    textField2.setText(model.getValueAt(i,1).toString());
    textField5.setText(model.getValueAt(i,3).toString());
   // jTextField4.setText(model.getValueAt(i,4).toString());

    }catch (Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());
    }}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    // End of variables declaration//GEN-END:variables
}
