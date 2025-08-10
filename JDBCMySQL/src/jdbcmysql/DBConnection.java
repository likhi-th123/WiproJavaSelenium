package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "likhi@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}