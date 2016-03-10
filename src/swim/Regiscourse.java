/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;
 import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.DataFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cn;
import static swim.cn.cnuser;


public class Regiscourse extends javax.swing.JFrame {

 DefaultTableModel model2 = new DefaultTableModel();
 DefaultTableModel model = new DefaultTableModel();

    public Regiscourse() {
        initComponents();
          
         model.addColumn("No.");
        model.addColumn("ชื่อ-สกุล");
        model.addColumn("บัตรประชาชน");
        model.addColumn("เบอร์โทรศัพท์");
        model.addColumn("อายุ");
        model.addColumn("ประเภท");
        model.addColumn("คอสเรียน");
       
      
     try{
ResultSet rs = cnuser().executeQuery("Select * from registerstudy");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_id"),rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("r_age"),rs.getString("r_type")
    ,rs.getString("r_coures"),rs.getString("r_startlern"),rs.getString("r_endlern")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);
   
    
        model2.addColumn("ชื่อผู้สอน");
        model2.addColumn("ชื่อคอร์ส");
        model2.addColumn("จำกัดอายุ");
        model2.addColumn("วันที่เรียน");
        model2.addColumn("เรียน/ชม.");
        model2.addColumn("เวลาเรียนทั้งหมด");
        
          
     try{
ResultSet rs2 = cnuser().executeQuery("Select name_trainer,name_course,age_limit,date_time,hour_of_course,hour_course from course");
    while(rs2.next()){
    model2.addRow(new Object[]{rs2.getString("name_trainer"),rs2.getString("name_course"),rs2.getString("age_limit"),rs2.getString("date_time"),rs2.getString("hour_of_course"),rs2.getString("hour_course")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable2.setModel(model2);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ชื่อ-สกุล");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(174, 35, 50, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(254, 32, 138, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("รหัสประชาชน");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(151, 97, 79, 17);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(254, 94, 138, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(254, 146, 138, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("เบอร์โทรศัพท์");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(151, 149, 80, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ชื่อ-สกุล", "รหัสประชาชน", "เบอรืโทรศัพท์", "คอสเรียน", "วันที่เริ่มเรียน", "สิ้นสุดการเรียน"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 390, 510, 140);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic", "FREESTYLE", "BACKSTROKE", "BUTTERFLY", "BREASTSTROKE" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(570, 90, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("คอสเรียน");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 90, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("วันที่เริ่มเรียน");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(461, 141, 73, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ประภท");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(487, 35, 50, 17);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "นักศึกษา", "นักเรียน", "บุคลากร", "บุคลทั่วไป" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(570, 30, 200, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("บันทึกข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 250, 103, 31);

        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setMaxSelectableDate(new java.util.Date(253370743315000L));
        jDateChooser2.setMinSelectableDate(new java.util.Date(-62135791085000L));
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(570, 150, 200, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/home-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 30, 93, 69);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ชื่ออาจารย์", "ชื่อคอร์ส", "ขอกำจัดผู้สมัคร", "วันเริ่มต้นเรียน", "วันสิ้นสุด"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(10);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 390, 450, 140);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("คอร์สที่เปิดสอน");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 340, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ผู้ลงทะเบียน");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 100, 20);

        jDateChooser3.setDateFormatString("dd/MM/yyyy");
        jDateChooser3.setMaxSelectableDate(new java.util.Date(253370743315000L));
        jDateChooser3.setMinSelectableDate(new java.util.Date(-62135791085000L));
        getContentPane().add(jDateChooser3);
        jDateChooser3.setBounds(570, 150, 200, 30);

        jDateChooser4.setDateFormatString("dd/MM/yyyy");
        jDateChooser4.setMaxSelectableDate(new java.util.Date(253370743315000L));
        jDateChooser4.setMinSelectableDate(new java.util.Date(-62135791085000L));
        getContentPane().add(jDateChooser4);
        jDateChooser4.setBounds(570, 150, 200, 30);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setMaxSelectableDate(new java.util.Date(32503658474000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(10413770474000L));
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(570, 200, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("วันที่สิ้นสุดการเรียน");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(430, 200, 130, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("อายุ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 210, 23, 17);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(260, 200, 70, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\tinnakorn\\Documents\\NetBeansProjects\\swim\\src\\swim\\img\\swimming.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
     {
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
     String s = sdf.format(jDateChooser2.getDate());
     String e = sdf.format(jDateChooser1.getDate());
     
         Statement stmt = null; 
         cn c = new cn();
         stmt = c.cnuser();

         String name = jTextField1.getText();
        String code = jTextField2.getText();
        String tel = jTextField3.getText();
        //String age = (String) jComboBox1.getSelectedItem();
        String type = (String) jComboBox3.getSelectedItem();
        String course = (String) jComboBox2.getSelectedItem();
        int age = (Integer)jSpinner1.getValue();
       
      String result = "INSERT INTO registerstudy(r_name_user,r_codeid,r_tel,r_age,r_type,r_coures,r_startlern,r_endlern)VALUES('"+name+"','"+code+"','"+tel+"','"+age+"','"+type+"','"+course+"','"+s+"','"+e+"')";
       stmt.executeUpdate(result);


JOptionPane.showMessageDialog(null,"บันทึกแล้ว");

     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }
          try{
                
    model.setRowCount(0);
    Connection con = null;
Statement stmt = null;  
    //stm = conn.obtenirconnexion().createStatement();
    ResultSet rs = cnuser().executeQuery("Select * from registerstudy");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_id"),rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("r_age"),rs.getString("r_type")
    ,rs.getString("r_coures"),rs.getString("r_startlern"),rs.getString("r_endlern")}
    
    );}
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);                                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
main m = new main();
m.setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Regiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regiscourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private static class model {

        private static void addColumn(String รหัสบัตรประชาชน) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
