/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thq.connectionsql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class ConnectionSQL {
    public static Connection getConnecttionSQL(){
        final String url = "jdbc:sqlserver://localhost:1433; databaseName=ProductManagement";
        final String user = "sa";
        final String pass = "123";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, user, pass);  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return null;       
    }
    public static void main(String[] args) {
        Connection conn = getConnecttionSQL();
        
        //if(conn != null)
        //    System.out.println("Thanh Cong");
        //else
        //   System.out.println("That Bai");
    }
    
}
