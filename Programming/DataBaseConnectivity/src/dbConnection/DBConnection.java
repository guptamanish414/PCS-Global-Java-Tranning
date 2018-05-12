package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection conn = null;
    
    
   public Connection dbConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");

        } catch (Exception e) {
            System.out.println("Error occure");
        }
        return conn;
    }

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try{
        Connection con1 = dbConnection.dbConn();
        if(con1!=null){
            System.out.println("Connection Found..!!!");
        }
        else
                System.out.println("Connection Not Found...!!!");
        }catch(Exception e){
            System.out.println("Error");
        }
    }

}
