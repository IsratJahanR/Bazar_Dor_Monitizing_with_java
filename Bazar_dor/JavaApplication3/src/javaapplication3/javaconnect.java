/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {
    static Connection connect;
    public static Connection ConnectDb(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazardor", "root", "");
           return connect;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;   
       }
   }
}
