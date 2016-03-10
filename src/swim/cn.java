/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cn { 
     public static Statement  cn() throws SQLException {
         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {}
            String host = "jdbc:mysql://localhost/swim?useUnicode=true&characterEncoding=UTF-8";

            Connection cnn = DriverManager.getConnection(host,"root","");
            //Connection cnn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
            
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        } 
      public static Statement  cnuser() throws SQLException {
         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {}
            String host = "jdbc:mysql://localhost/swim?useUnicode=true&characterEncoding=UTF-8";

            Connection cnn = DriverManager.getConnection(host,"root","");
            //Connection cnn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
            
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        } 
    
     public static  void Insert(String x) {
        try {  cn().executeUpdate(x);      
             } catch (Exception ex) { System.out.println("Insert Error."); }
    }    

     public static  ResultSet Select(String x) throws SQLException {
          return cn().executeQuery(x); 
    }}