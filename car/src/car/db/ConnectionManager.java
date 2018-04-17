//เพื่อ load driver
package car.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager {   
    public static Connection createConnection
        (String driverClass ,String url,String username, String psw) throws ClassNotFoundException,SQLException{
          
         Class.forName(driverClass);
         System.out.println("Driver Loaded and Registered");
         
        Connection cn =DriverManager.getConnection(url, psw, psw);
        return cn;
        
            
        }
         public static  void closeConnection(Connection cn) throws SQLException{
            cn.close();
         }
    
}
