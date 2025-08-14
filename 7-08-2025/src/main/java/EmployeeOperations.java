package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeOperations {

    ClassTable db = new ClassTable();

    public int insertEmployee(int id, String name, String dept) {
        int result = 0;
        try (Connection con = db.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO employeedata (id, name, dept) VALUES (?, ?, ?)")) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public int updateEmployee(int id, String newName) {
        int result = 0;
        try (Connection con = db.getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE employeedata SET name = ? WHERE id = ?")) {

            ps.setString(1, newName);
            ps.setInt(2, id);
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int deleteEmployee(int id) {
        int result = 0;
        try (Connection con = db.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM employeedata WHERE id = ?")) {

            ps.setInt(1, id);
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
