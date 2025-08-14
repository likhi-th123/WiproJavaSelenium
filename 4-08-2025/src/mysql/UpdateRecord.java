package jdbcmysql;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
    public void updateEmployee(Scanner sc) {
        Connection con = null;
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();

            System.out.print("Enter Employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new Name: ");
            String name = sc.nextLine();

            System.out.print("Enter new Department: ");
            String dept = sc.nextLine();

            String sql = "Update employee SET name = '" + name + "', department = '" + dept + "' WHERE id = " + id;
            Statement st = con.createStatement();
            int rows = st.executeUpdate(sql);
            System.out.println(rows + " record(s) updated successfully.");

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }
}