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
import java.awt.Color;
import java.awt.Graphics;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cn;
import static swim.cn.cnuser;


public class staffregiscourse extends javax.swing.JFrame {

 DefaultTableModel model2 = new DefaultTableModel();
 DefaultTableModel model = new DefaultTableModel();

    public staffregiscourse() {
        
        initComponents();
          
        faidcombobox();
        model.addColumn("ชื่อ-สกุล");
        model.addColumn("บัตรประชาชน");
        model.addColumn("เบอร์โทรศัพท์");
        model.addColumn("อายุ");
        model.addColumn("ประเภท");
        model.addColumn("คอสเรียน");
         model.addColumn("ผู้สอน");
       
      
     try{
ResultSet rs = cnuser().executeQuery("Select r_name_user,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures,r_name_trainer from registerstudy");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
    ,rs.getString("r_coures"),rs.getString("r_name_trainer")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);
   
    
        model2.addColumn("ชื่อผู้สอน");
        model2.addColumn("ชื่อคอร์ส");
        model2.addColumn("จำกัดอายุ");
        model2.addColumn("วันที่เรียน");
        model2.addColumn("เรียน ชม./วัน");
        model2.addColumn("เวลาเรียนทั้งหมด");
        
          
     try{
        
ResultSet rs2 = cnuser().executeQuery("Select name_trainer,name_course,age_limit,date_time,hour_of_course,hour_course from course");
    while(rs2.next()){
    model2.addRow(new Object[]{rs2.getString("name_trainer"),rs2.getString("name_course"),rs2.getString("age_limit"),rs2.getString("date_time"),rs2.getString("hour_of_course")+"  ชม.",rs2.getString("hour_course")+"  วัน"});
    }
    }catch(Exception e){System.err.println(e);}
   jTable2.setModel(model2);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setMaxSelectableDate(new java.util.Date(253370743315000L));
        jDateChooser2.setMinSelectableDate(new java.util.Date(-62135791085000L));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ชื่อ-สกุล");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 70, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 30, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("รหัสบัตร");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 60, 22);

        jTextField2.setToolTipText("* กรอกรหัสบัตรประชาชนหรือรหัสบัตรนักศึกษา");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 70, 200, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 120, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("เบอร์โทรศัพท์");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 110, 22);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jComboBox2.setBounds(140, 280, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("คอสเรียน");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 280, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("วันเกิด");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 180, 60, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("สถานภาพ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 230, 90, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "นักศึกษา", "นักเรียน", "บุคลากร", "บุคลทั่วไป" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(140, 230, 200, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("บันทึกข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 390, 140, 31);

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(10);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(380, 70, 590, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ชื่อผู้สมัครเรียนว่ายน้ำ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 220, 160, 30);

        jDateChooser5.setToolTipText("");
        jDateChooser5.setDateFormatString("dd/MM/yyyy");
        jDateChooser5.setMaxSelectableDate(new java.util.Date(18587037715000L));
        jDateChooser5.setMinSelectableDate(new java.util.Date(-62135791085000L));
        getContentPane().add(jDateChooser5);
        jDateChooser5.setBounds(140, 180, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/home-icon.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(910, 0, 60, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ผู้สอน");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 330, 50, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 320, 200, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 250, 590, 170);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("คอร์สที่เปิดสอน");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 40, 120, 30);

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 390, 140, 31);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/1457732752_Refresh.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 390, 32, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 220, 220, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 204));
        jLabel14.setText("* กรอกรหัสบัตรประชาชนหรือรหัสบัตรนักศึกษา");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 430, 350, 22);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("ค้นหา");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(830, 220, 140, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/pexels-photo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1020, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name1 = jTextField1.getText();
        String code1 = jTextField2.getText();
        String tel1 = jTextField3.getText();
        //String age = (String) jComboBox1.getSelectedItem();
        String type1 = (String) jComboBox3.getSelectedItem();
        String course1 = (String) jComboBox2.getSelectedItem();
        String tea1 = jLabel11.getText();
        
        if(name1.length()==0||code1.length()==0||tel1.length()==0||type1.length()==0||course1.length()==0||tea1.length()==0){
        JOptionPane.showMessageDialog(null,"กรุณากรอกข้อมูลให้ครบถ้วน");
        return;
        }
        else if(code1.length() != 13 & code1.length() != 9){
        JOptionPane.showMessageDialog(null,"กรุณากรอกเลขบัตรประชาชน 13 หลักให้ถูกต้อง");
        return;
        }
        else if(tel1.length() != 10){
        JOptionPane.showMessageDialog(null,"กรุณากรอกหมายเลขโทรศัพท์ให้ถูกต้อง");
        return;
        }
        else if(jDateChooser5.getDate() == null){
        JOptionPane.showMessageDialog(null,"กรุณาระบุวันเกิด");
        return;
        }
        try
     {
         SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd", Locale.getDefault());
     String s = sdf.format(jDateChooser5.getDate());
     
         Statement stmt = null; 
         cn c = new cn();
         stmt = c.cnuser();

         String name = jTextField1.getText();
        String code = jTextField2.getText();
        String tel = jTextField3.getText();
        //String age = (String) jComboBox1.getSelectedItem();
        String type = (String) jComboBox3.getSelectedItem();
        String course = (String) jComboBox2.getSelectedItem();
        String tea = jLabel11.getText();
       
      String result = "INSERT INTO registerstudy(r_name_user,r_name_trainer,r_codeid,r_tel,r_birthday,r_type,r_coures)VALUES('"+name+"','"+tea+"','"+code+"','"+tel+"','"+s+"','"+type+"','"+course+"')";
       stmt.executeUpdate(result);


JOptionPane.showMessageDialog(null,"ลงเรียนเรียบร้อยแล้ว");

     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }
        try{
        paymanagerstudy m = new paymanagerstudy();
m.setVisible(true);
setVisible(false); 
        }
        catch(Exception e){
        }
//          try{
//                
//    model.setRowCount(0);
//    Connection con = null;
//Statement stmt = null;  
//    //stm = conn.obtenirconnexion().createStatement();
//    ResultSet rs = cnuser().executeQuery("Select r_name_user,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures from registerstudy");
//    while(rs.next()){
//    model.addRow(new Object[]{rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
//    ,rs.getString("r_coures")}
//    
//    );}
//    }catch(Exception e){System.err.println(e);}
//    jTable1.setModel(model);                                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void faidcombobox(){
    try{
        ResultSet rs = cnuser().executeQuery("Select * from course");
        while(rs.next()){
            String item1= rs.getString("name_course");
            jComboBox2.addItem(item1);
        }
        
    }
    catch(Exception e){
    
    }
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
staffmain m = new staffmain();
m.setVisible(true);
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      try{
    int i=jTable2.getSelectedRow();deplace(i);
    
}
catch (Exception e){JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());}           // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 try{
     int o=jTable1.getSelectedRow();deplace2(o); 
    
}
catch (Exception e){JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());}    
              // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String name1 = jTextField1.getText();
        String code1 = jTextField2.getText();
        String tel1 = jTextField3.getText();
        //String age = (String) jComboBox1.getSelectedItem();
        String type1 = (String) jComboBox3.getSelectedItem();
        String course1 = (String) jComboBox2.getSelectedItem();
        String tea1 = jLabel11.getText();
        
        if(name1.length()==0||code1.length()==0||tel1.length()==0||type1.length()==0||course1.length()==0||tea1.length()==0){
        JOptionPane.showMessageDialog(null,"กรุณากรอกข้อมูลให้ครบถ้วน");
        return;
        }
        else if(code1.length() != 13){
        JOptionPane.showMessageDialog(null,"กรุณากรอกเลขบัตรประชาชน 13 หลักให้ถูกต้อง");
        return;
        }
        else if(tel1.length() != 10){
        JOptionPane.showMessageDialog(null,"กรุณากรอกหมายเลขโทรศัพท์ให้ถูกต้อง");
        return;
        }
        else if(jDateChooser5.getDate() == null){
        JOptionPane.showMessageDialog(null,"กรุณาระบุวันเกิด");
        return;
        }
        try
     {
      SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd", Locale.getDefault());
     String s1 = sdf.format(jDateChooser5.getDate());
         Statement stmt = null; 
         cn c = new cn();
         stmt = c.cn();
      String result2 = "UPDATE registerstudy SET r_name_user='"+name1+"',r_name_trainer='"+tea1+"',r_codeid='"+code1+"',r_tel='"+tel1+"',r_birthday='"+s1+"',r_type='"+type1+"',r_coures='"+course1+"' where r_codeid = '"+code1+"'";
        stmt.executeUpdate(result2);


JOptionPane.showMessageDialog(null,"บันทึกแล้ว");

     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

     }   
 
try{
     model.setRowCount(0);
ResultSet rs = cnuser().executeQuery("Select r_name_user,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures,r_name_trainer from registerstudy");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
    ,rs.getString("r_coures"),rs.getString("r_name_trainer")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
staffregiscourse ss = new  staffregiscourse();
ss.setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 String codee = jTextField4.getText();
        try{
            model.setRowCount(0);
ResultSet rs = cnuser().executeQuery("Select r_name_user,r_codeid,r_tel,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( r_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( r_birthday, '00-%m-%d' ) ) AS age,r_type,r_coures,r_name_trainer from registerstudy where r_codeid like '%"+codee+"%' or r_name_user like '%"+codee+"%'");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("r_name_user"),rs.getString("r_codeid"),rs.getString("r_tel"),rs.getString("age")+"  ปี",rs.getString("r_type")
    ,rs.getString("r_coures"),rs.getString("r_name_trainer")});
    }
    }catch(Exception e){System.err.println(e);}
   jTable1.setModel(model);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
   int dialogButton = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING",JOptionPane.YES_NO_OPTION);

if(dialogButton == JOptionPane.YES_OPTION) {
System.exit(0);}else {remove(dialogButton);}   
    }//GEN-LAST:event_formWindowClosing
   
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
            java.util.logging.Logger.getLogger(staffregiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffregiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffregiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffregiscourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffregiscourse().setVisible(true);
            }
        });
        
    }
    private void deplace(int i){
   try{
    jComboBox2.setSelectedItem(model2.getValueAt(i,1).toString());
    jLabel11.setText(model2.getValueAt(i,0).toString());
   // jTextField4.setText(model.getValueAt(i,4).toString());

    }catch (Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());
    }
 }
     private void deplace2(int o){
   try{
       
       jTextField1.setText(model.getValueAt(o,0).toString());
       jTextField2.setText(model.getValueAt(o,1).toString());
       jTextField3.setText(model.getValueAt(o,2).toString());
      jComboBox3.setSelectedItem(model.getValueAt(o,4).toString());
    jComboBox2.setSelectedItem(model.getValueAt(o,5).toString());
    jLabel11.setText(model.getValueAt(o,6).toString());
    
   // jTextField4.setText(model.getValueAt(i,4).toString());

    }catch (Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null,"error"+e.getLocalizedMessage());
    }
 }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
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
