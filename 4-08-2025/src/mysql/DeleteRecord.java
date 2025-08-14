package jdbcmysql;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
    public void deleteEmployee(Scanner sc) {
        Connection con = null;
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();

            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();

            String sql = "Delete from employee WHERE id = " + id;
            Statement st = con.createStatement();
            int rows = st.executeUpdate(sql);
            System.out.println(rows + " record(s) deleted successfully.");

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }
}