
package swim;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cnuser;
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

public class teacheraddcourse extends javax.swing.JFrame {
   
  DefaultTableModel model = new DefaultTableModel();
  DefaultTableModel model2 = new DefaultTableModel();
  DefaultTableModel model3 = new DefaultTableModel();
    public teacheraddcourse() {
        
     
        initComponents();
    
        model.addColumn("รหัสวิชา");
        model.addColumn("ชื่อวิชา");
        model.addColumn("จำกัดอายุ");
        model.addColumn("เวลาเรียนทั้งหมด");
        model.addColumn("เรียน/ชม.ต่อวัน");
        model.addColumn("วันเวลาเรียน");
        model.addColumn("ผู้สอน");
        
          
     try{
         
ResultSet rs = cn().executeQuery("Select id_course,name_course,age_limit,hour_course,hour_of_course,date_time,name_trainer from course");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("id_course"),rs.getString("name_course"),rs.getString("age_limit"),rs.getString("hour_course"),rs.getString("hour_of_course"),rs.getString("date_time"),rs.getString("name_trainer")});
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinField1 = new com.toedter.components.JSpinField();
        jSpinField2 = new com.toedter.components.JSpinField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

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
        jScrollPane1.setBounds(80, 380, 871, 165);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("รายวิชาสอนการว่ายน้ำ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 350, 190, 22);

        jButton1.setText("เพิ่มรายวิชาเรียน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 300, 105, 41);

        jTextField1.setPreferredSize(new java.awt.Dimension(138, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 70, 147, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("รหัสวิชา ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 70, 66, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 130, 147, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ชื่อวิชา");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 130, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("จำกัดอายุ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 200, 70, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-5ขวบ", "7ปีขึ้นไป", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(240, 190, 147, 34);
        getContentPane().add(jSpinField1);
        jSpinField1.setBounds(710, 60, 141, 30);
        getContentPane().add(jSpinField2);
        jSpinField2.setBounds(710, 110, 141, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วันจันทร์ 17.00-18.00", "วันอังคาร 17.00-18.00", "วันพุธ 17.00-18.00", "วันพฤหัสบดี 17.00-18.00", "วันศุกร์ 17.00-18.00", "วันเสาร์ 17.00-18.00", "วันอาทิตย์ 17.00-18.00" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(710, 170, 141, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("เรียนกี่วัน/ต่อคอร์ส");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(554, 60, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("เรียนกี่ชม/ต่อวัน");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 110, 130, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("วัน/เวลาเรียน");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 170, 100, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ชื่อผู้สอนผู้สอน");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 220, 110, 22);

        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 300, 114, 41);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/arrow-left-icon.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 10, 72, 72);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(710, 220, 140, 35);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/pexels-photo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String code = jTextField1.getText();
     String name = jTextField2.getText();
     String nametea = jTextField3.getText();
     
        if(name.length()==0||code.length()==0){
            JOptionPane.showMessageDialog(null,"กรอกข้อมูลให้ครบถ้วน");
            return;
        }
        else if (jSpinField1.getValue() == 0){
        JOptionPane.showMessageDialog(null,"กรุณาระบุเวลาเรียนทั้งหมดในคอร์สนี้");
            return;
        }
         else if (jSpinField2.getValue() == 0){
        JOptionPane.showMessageDialog(null,"กรุณาระบุเวลาเรียน");
            return;
        }
        else if (nametea.length() == 0){
        JOptionPane.showMessageDialog(null,"กรุณาระบุชื่อผู้สอน");
            return;
        }
        try
     {
         Statement stmt = null; 
         cn c = new cn();
         stmt = c.cn();   
        
        
        
             String id_course =jTextField1.getText();
             String name_course = jTextField2.getText();
             String age_limit =(String) jComboBox1.getSelectedItem();
             int hour_course = jSpinField1.getValue();
             int hour_of_course= jSpinField2.getValue();
             String date_time = (String)jComboBox2.getSelectedItem();
             String name_trainer =jTextField3.getText();
             
             String result = "INSERT INTO course(id_course,name_course,age_limit,hour_course,hour_of_course,date_time,name_trainer)VALUES('"+id_course+"','"+name_course+"','"+age_limit+"','"+hour_course+"','"+hour_of_course+"','"+date_time+"','"+name_trainer+"')";
       stmt.executeUpdate(result);


        JOptionPane.showMessageDialog(null,"บันทึกแล้ว");

     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }
          try{
              model.setRowCount(0);
ResultSet rs = cn().executeQuery("Select id_course,name_course,age_limit,hour_course,hour_of_course,date_time,name_trainer from course");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("id_course"),rs.getString("name_course"),rs.getString("age_limit"),rs.getString("hour_course"),rs.getString("hour_of_course"),rs.getString("date_time"),rs.getString("name_trainer")});
    }
    
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);        
                      

   
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          try{
                Statement stmt = null; 
            cn c = new cn();
            stmt = c.cn();   
         
         if(jTextField1.getText().length()!=0){
             stmt.executeUpdate("Delete From course where id_course="+jTextField1.getText());            
            JOptionPane.showMessageDialog(null,"ลบข้อมูล");            
         }  
     }catch(Exception e){JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage());}
                  
          try{
              
              model.setRowCount(0);
ResultSet rs = cnuser().executeQuery("Select id_course,name_course,age_limit,hour_course,hour_of_course,date_time,name_trainer from course");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("id_course"),rs.getString("name_course"),rs.getString("age_limit"),rs.getString("hour_course"),rs.getString("hour_of_course"),rs.getString("date_time"),rs.getString("name_trainer")});
    }
    
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);    
                      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 try{
    int i=jTable1.getSelectedRow();deplace(i);
}
catch (Exception e){JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());}       // TODO add your handling code here:
             // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
teachermain mm = new teachermain();
mm.setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacheraddcourse().setVisible(true);
            }
        });
    }
    private void deplace(int i){
    try{
    jTextField1.setText(model.getValueAt(i,0).toString());
   // jTextField4.setText(model.getValueAt(i,4).toString());

    }catch (Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables



  
}
