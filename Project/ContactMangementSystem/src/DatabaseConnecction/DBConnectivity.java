/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnecction;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Manish Kr Gupta
 */
public class DBConnectivity {
    
    Connection con=null;
    public Connection dbConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "");
           // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");

        } catch (Exception e) {
            System.out.println("Error occure");
        }
        return con;
    }
    
    public static void main(String[] args) {
        DBConnectivity db = new DBConnectivity();
        Connection con = db.dbConnect();
        if(con!=null)
            System.out.println("Connection Found....!!");
        else 
            System.out.println("Not Connected...!!");
    }
    
}
