/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author nayan
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "password");
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }   
}
