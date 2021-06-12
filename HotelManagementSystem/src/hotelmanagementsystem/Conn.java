/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.sql.*;
/**
 *
 * @author Aniket
 */
public class Conn {
    Connection con;
    Statement stm;
    public Conn(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","sys");
            stm = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
