/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//การเขียน method ที่จะสร้าง connection
public class ConnectionManager {
    public static  Connection createConnection
        (String driverClass ,String url,String username, String psw) throws ClassNotFoundException,SQLException{
            
        //1.load driver class and register to DriverManager
        Class.forName(driverClass);
        System.out.println("Driver Loaded and Registered");
        
        //2. getConnection from DriverManager
        Connection cn =DriverManager.getConnection(url, username, psw);
        return cn;

            
        }
        public static  void closeConnection(Connection cn) throws SQLException{
            cn.close();
        }
}
