/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;
import java.sql.*;
/**
 *
 * @author powpo
 */
public class az {
   public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root","123456");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
