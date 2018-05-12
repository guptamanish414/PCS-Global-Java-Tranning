/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Manish Kr Gupta
 */
public class DBUpdateData {
    public static void main(String[] args) {
        DBConnection dbc = new DBConnection();
        Connection con5 = dbc.dbConn();
        PreparedStatement ps2 = null;
        try {
            ps2 = con5.prepareStatement("update test set id = 35 where id =30");
            int t = ps2.executeUpdate();
            System.out.println(t+" data Updated...!!");
        } catch (Exception e) {

        }

    }
}
