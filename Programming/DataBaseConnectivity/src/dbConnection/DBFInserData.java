package dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBFInserData {

    public static void main(String[] args) throws SQLException {
        DBConnection dbc = new DBConnection();
        Connection con2 = dbc.dbConn();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con2.prepareStatement("insert into test values(29,'test6')");
            int r =ps.executeUpdate();
            
            System.out.println(r+" data Inserted");
            /*rs = ps.executeQuery();
            while (rs != null){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
                    */
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("--" + e);
        }
        con2.close();
    }

}
