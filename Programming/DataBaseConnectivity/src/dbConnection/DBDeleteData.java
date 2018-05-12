/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

/**
 *
 * @author Manish Kr Gupta
 */
import java.sql.*;

public class DBDeleteData {

    public static void main(String[] args) {
        DBConnection dbc = new DBConnection();
        Connection con5 = dbc.dbConn();
        PreparedStatement ps2 = null;
        try {
            ps2 = con5.prepareStatement("delete from test where id=12");
            int t = ps2.executeUpdate();
            System.out.println(t+" data Deleted");
        } catch (Exception e) {

        }

    }

}
