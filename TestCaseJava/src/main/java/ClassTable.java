package main.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassTable {

    public Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String user = "root";
            String pass = "likhi@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
