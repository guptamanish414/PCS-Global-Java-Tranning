/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactDetails;

import DatabaseConnecction.DBConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Manish Kr Gupta
 */
public class AdminDetailsDAO {

    boolean result = false;
    DBConnectivity dBConnectivity = new DBConnectivity();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean checkAdminDetails(ConatactAdminVO conatactAdminVO) {
        try {
            con = dBConnectivity.dbConnect();
            ps = con.prepareStatement("select username , password from admin where username =? and password =?");
            ps.setString(1, conatactAdminVO.getUsername());
            ps.setString(2, conatactAdminVO.getPassword());
            rs = ps.executeQuery();
            while (rs.next()) {
                result = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error in Admin Section" + e);
        }
        return result;
    }

    /*public static void main(String[] args) {
        AdminDetailsDAO ad = new AdminDetailsDAO();
        if(ad.checkAdminDetails("cms1", "cms5551")==true){
            System.out.println("Suuccess...");
        }
        else 
            System.out.println("Failure...");
    }
    */

}
