package statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {
    static Connection con = null;

    public static void main(String args[]) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "likhi@123";

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            con = DriverManager.getConnection(url, username, password);

            // Prepare the CallableStatement (procedure name is case-insensitive, but match it exactly)
            CallableStatement cstmt = con.prepareCall("{call mypro(?, ?, ?)}");

            // First row
            cstmt.setString(1, "Harry");
            cstmt.setInt(2, 2000);
            cstmt.setString(3, "Pune");
            cstmt.executeUpdate();

            // Second row
            cstmt.setString(1, "Tom");
            cstmt.setInt(2, 6000);
            cstmt.setString(3, "Gujarat");
            cstmt.executeUpdate();

            // Third row
            cstmt.setString(1, "Potter");
            cstmt.setInt(2, 1000);
            cstmt.setString(3, "Mumbai");
            cstmt.executeUpdate();

            System.out.println("Rows inserted ....");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
