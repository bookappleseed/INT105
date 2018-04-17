/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import sit.db.ConnectionManager;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class StudentController {

    private Connection con;

    public StudentController(String username, String psw)
            throws ClassNotFoundException, SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection Created successfully");

    }
public int insertStudentBatch(ArrayList<Student> studentList){
    // add code
}
public int insertStudentBatch(File studentFile){
    // add code
    
}


    public StudentController(Properties pro) throws SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager.createConnection(url, pro);
        System.out.println("Connection Created successfully");

    }
    public int insertStudent(Student std) throws SQLException{
             int insertedRecs = 0;
             int id= std.getStdId();
             String fname=std.getStdFirstName();
             String lname=std.getStdLastName();
             
        String sql = "insert into student (stdId,firstname,lastname) values ("+id+",'"+fname+"','"+lname+"' )";
        System.out.println("sql = "+sql);
        Statement stmt = con.createStatement();
        insertedRecs = stmt.executeUpdate(sql);
        return insertedRecs;

        
    }
    public int deleteAllStudents() throws SQLException {
        int deletedRecs = 0;
        String sql = "delete from student";
        Statement stmt = con.createStatement();
        deletedRecs = stmt.executeUpdate(sql);
        return deletedRecs;

    }
    public  void close() throws SQLException{
    ConnectionManager.closeConnection(con);
    }
}
