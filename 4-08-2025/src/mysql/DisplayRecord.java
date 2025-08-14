package jdbcmysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecord {
    public void displayAll() {
        Connection con = null;
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();

            String sql = "SELECT * FROM employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                System.out.println(id + ", " + name + ", " + dept);
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error displaying records: " + e.getMessage());
        }
    }
}