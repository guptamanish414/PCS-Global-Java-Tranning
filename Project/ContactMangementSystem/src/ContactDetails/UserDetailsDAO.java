/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactDetails;

import DatabaseConnecction.DBConnectivity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manish Kr Gupta
 */
public class UserDetailsDAO {

    boolean result = false;
    boolean flag;
    DBConnectivity dBConnectivity = new DBConnectivity();
    Connection con = null;
    PreparedStatement ps = null;
    PreparedStatement ps1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    int output;

    public int insertContact(ContactVO contactVO) {
        try {
            con = dBConnectivity.dbConnect();
            ps = con.prepareStatement("insert into contact_details(name,conatactno,email,address,othercontact) values(?,?,?,?,?);");
            ps.setString(1, contactVO.getName());
            ps.setInt(2, contactVO.getContactNo());
            ps.setString(3, contactVO.getEmail());
            ps.setString(4, contactVO.getAddress());
            ps.setInt(5, contactVO.getOtherConatct());
            output = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error in Creation..." + e);
        }
        return output;
    }
 public int modifyContactEmail(ContactVO contactVO) throws SQLException {
      int r = 0; 
        try {
            con = dBConnectivity.dbConnect();
                ps = con.prepareStatement("update contact_details set email=? where conatactno=?");
                ps.setString(1, contactVO.getEmail());
                ps.setInt(2, contactVO.getContactNo());
                r = ps.executeUpdate();
              
           
        } catch (Exception e) {
            System.out.println("Error in Updating..." + e);
        }
        return r;
 }
    public int modifyContactName(ContactVO contactVO) throws SQLException {
        int r = 0;
       
        try {
            con = dBConnectivity.dbConnect();
                ps = con.prepareStatement("update contact_details set name=? where conatactno=?");
                ps.setString(1, contactVO.getName());
                ps.setInt(2, contactVO.getContactNo());
                r = ps.executeUpdate();
              
           
        } catch (Exception e) {
            System.out.println("Error in Updating..." + e);
        }
        return r;
    }

    public boolean searchContact(String Contactname) {
        boolean f = false;
        try {

            con = dBConnectivity.dbConnect();
            ps = con.prepareStatement(" select * from contact_details where name=?");
            ps.setString(1, Contactname);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print("Name: " + rs.getString("name") + "       ");
                System.out.print("Contact Number: " + rs.getInt("conatactno") + "       ");
                System.out.print("Email :" + rs.getString("email") + "       ");
                System.out.print("Address : " + rs.getString("address") + "       ");
                System.out.print("Other No: " + rs.getInt("othercontact") + "       ");
                f = true;
                System.out.println();

            }
        } catch (Exception e) {
            System.out.println("Error in Searching....!!!");
        }
        return f;
    }

    public int deleteContact(int no) {
        int result = 0;
        try {
            con = dBConnectivity.dbConnect();
            ps = con.prepareStatement("delete from contact_details where conatactno=?");
            ps.setInt(1, no);
            result = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error in feaching Contact.... ");
        }
        return result;
    }

    public void displayContact() {
        try {
            con = dBConnectivity.dbConnect();
            ps = con.prepareStatement("select * from contact_details ");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print("Name: " + rs.getString("name") + "       ");
                System.out.print("Contact Number: " + rs.getInt("conatactno") + "       ");
                System.out.print("Email :" + rs.getString("email") + "       ");
                System.out.print("Address : " + rs.getString("address") + "       ");
                System.out.print("Other No: " + rs.getInt("othercontact") + "       ");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error in feaching Contact.... ");
        }
    }
//    public static void main(String[] args) {
//        UserDetailsDAO u = new UserDetailsDAO();
//        u.searchContact("sds");
//    }

}
