package jdbcmysql;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
    public void insertEmployee(Scanner sc) {
        Connection con = null;
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            String sql = "Insert into employee VALUES(" + id + ", '" + name + "', '" + dept + "')";
            Statement st = con.createStatement();
            int rows = st.executeUpdate(sql);
            System.out.println(rows + " record inserted successfully.");

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error inserting record: " + e.getMessage());
        }
    }
}