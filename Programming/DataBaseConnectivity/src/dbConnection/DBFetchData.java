/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manish Kr Gupta
 */
public class DBFetchData {

    public static void main(String[] args) throws SQLException {
        DBConnection dbc = new DBConnection();
        Connection con2 = dbc.dbConn();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con2.prepareStatement("select * from test");
            rs = ps.executeQuery();
  
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("id") + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("--" + e);
        }
        con2.close();
    }

}
