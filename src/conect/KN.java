/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author huy
 */
public class KN {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
            return con;
        } 
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
//    public static void main(String[] args){
//        String url="jdbc:mysql://localhost:3306/lms";
//        try (Connection conn=DriverManager.getConnection(url,"root","")){
//            System.out.println("Kết nối thành công");
//            System.out.println(conn.getCatalog());
//        } catch (SQLException ex) {
//            Logger.getLogger(KN.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
