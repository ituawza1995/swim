/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static swim.cn.cn;

/**
 *
 * @author tinnakorn
 */
public class boss extends javax.swing.JFrame {

    /**
     * Creates new form boos
     */DefaultTableModel model = new DefaultTableModel();
     DefaultTableModel model2 = new DefaultTableModel();
      DefaultTableModel model3 = new DefaultTableModel();
    public boss() {
        initComponents();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     model.addColumn("���ʺѵû�ЪҪ�");
     model.addColumn("����");
    model.addColumn("�ѹ������");
    model.addColumn("�ӹǹ�Թ");
    
    model2.addColumn("����");
     model2.addColumn("����");
    model2.addColumn("ʶҹ�");
      
     try{

Connection con = null;
Statement stmt = null;        
 ResultSet rs = cn().executeQuery("Select * from pay");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("p_codeuser"),rs.getString("p_name"),rs.getString("p_datetime"),rs.getString("p_money")});
    }
    ResultSet dd = cn().executeQuery("Select u_name,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( u_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( u_birthday, '00-%m-%d' ) ) AS age,u_type from user");
    while(dd.next()){
    model2.addRow(new Object[]{dd.getString("u_name"),dd.getString("age"),dd.getString("u_type")});
    }
    ///////////////������ mysql ////////////////////////////////
    ResultSet cc = cn().executeQuery("SELECT SUM(p_money) FROM pay");
int sum = 0;
if(cc.next())
sum = Integer.parseInt(cc.getString(1));
jLabel1.setText(String.valueOf(sum));

ResultSet gg = cn().executeQuery("SELECT count(u_id) from user where status = 2");
int sum2 = 0;
if(gg.next())
sum2 = Integer.parseInt(gg.getString(1));
jLabel4.setText(String.valueOf(sum2));
///////////////////////////////////////////////////////////////////
    }catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);
     jTable2.setModel(model2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 500));
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 52, 473, 369);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 52, 300, 370);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(840, 90, 50, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("�Թ������Ѻ���з�����");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(807, 52, 170, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("�ҷ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(900, 90, 44, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(870, 170, 30, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("��");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(900, 170, 30, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("��Ҫԡ������");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(833, 142, 109, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("�����š�è����Թ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 19, 127, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("��������Ҫԡ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 20, 110, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 20, 100, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(460, 20, 200, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("���Ҫ���");
        getContentPane().add(jButton3);
        jButton3.setBounds(240, 20, 83, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("�����Ţ��Ҫԡ");
        getContentPane().add(jButton4);
        jButton4.setBounds(670, 20, 130, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/arrow-refresh-3-icon.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(860, 240, 70, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/home-icon.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(870, 340, 70, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swim/img/pexels-photo.jpeg"))); // NOI18N
        jLabel9.setText("�");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1030, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
 try{
         model.setRowCount(0);

Connection con = null;
Statement stmt = null;        
 ResultSet rs = cn().executeQuery("Select * from pay");
    while(rs.next()){
    model.addRow(new Object[]{rs.getString("p_codeuser"),rs.getString("p_name"),rs.getString("p_datetime"),rs.getString("p_money")});
    }
     model2.setRowCount(0);
    ResultSet dd = cn().executeQuery("Select u_name,DATE_FORMAT( NOW( ) , '%Y' ) - DATE_FORMAT( u_birthday, '%Y' ) - ( DATE_FORMAT( NOW( ) , '00-%m-%d' ) < DATE_FORMAT( u_birthday, '00-%m-%d' ) ) AS age,u_type from user");
    while(dd.next()){
    model2.addRow(new Object[]{dd.getString("u_name"),dd.getString("age"),dd.getString("u_type")});
    }
    ///////////////������ mysql ////////////////////////////////
    ResultSet cc = cn().executeQuery("SELECT SUM(p_money) FROM pay");
int sum = 0;
if(cc.next())
sum = Integer.parseInt(cc.getString(1));
jLabel1.setText(String.valueOf(sum));

ResultSet gg = cn().executeQuery("SELECT count(u_id) from user where status = 2");
int sum2 = 0;
if(gg.next())
sum2 = Integer.parseInt(gg.getString(1));
jLabel4.setText(String.valueOf(sum2));
///////////////////////////////////////////////////////////////////
    }
     
     catch(Exception e){System.err.println(e);}
    jTable1.setModel(model);
    jTable2.setModel(model2);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
login m = new login();
m.setVisible(true);
setVisible(false);// TODO add your handling code here:
            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(boss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
