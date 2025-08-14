package statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollableStatementEx {
    static Connection con = null;

    public static void main(String args[]) throws Exception {
        try {
            // DB connection setup
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "likhi@123";

            // Load driver and connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            // Prepare CallableStatement once
            CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?, ?, ?)}");

            // Movie data (hardcoded)
            String[][] movies = {
                {"Leo", "Lokesh Kanagaraj", "2023", "Vijay", "8.2"},
                {"Rangasthalam", "Sukumar", "2022", "RamCharan", "8.5"},
                {"Pushpa", "Sukumar", "2021", "Allu Arjun", "8.1"}
            };

            // Loop through each movie
            for (int i = 0; i < movies.length; i++) {
                cstmt.setString(1, movies[i][0]);                     // title
                cstmt.setString(2, movies[i][1]);                     // director
                cstmt.setInt(3, Integer.parseInt(movies[i][2]));      // year
                cstmt.setString(4, movies[i][3]);                     // hero
                cstmt.setDouble(5, Double.parseDouble(movies[i][4])); // rating
                cstmt.execute();  // execute once per movie
                System.out.println("Inserted movie: " + movies[i][0]);
            }

            System.out.println("All rows inserted successfully.");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}


















//package statement;
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//public class CollableStatementEx {
//   static Connection con=null;
//	public static void main(String args[]) throws Exception {
//	try {
//		// Replace with your database name
//       String url="jdbc:mysql://localhost:3306/java_selenium";
// 
//       // Replace with your MySQL username
//       String username = "root";
// 
//       // Replace with your MySQL password
//       String password = "likhi@123";
// 
//	
//       // Load MySQL Type-4 driver class
//       Class.forName("com.mysql.cj.jdbc.Driver");
// 
//         // Establish connection
//      con = DriverManager.getConnection(url, username, password);
// 
//      CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?, ?, ?)}");
//      cstmt.setString(1, "Leo");
//      cstmt.setString(2, "Lokesh Kanagaraj");
//      cstmt.setInt(3, 2023);
//      cstmt.setString(4, "Vijay");
//      cstmt.setDouble(5, 8.2);
//      cstmt.executeUpdate();
//
//
//      cstmt.setString(1, "Rangasthalam");
//      cstmt.setString(2, "Sukumar");
//      cstmt.setInt(3, 2022);
//      cstmt.setString(4, "RamCharan");
//      cstmt.setDouble(5, 8.5);
//      cstmt.executeUpdate();
// 
//      cstmt.execute();
//      System.out.println("Rows inserted ....");
//	}catch(SQLException se) 
//	{se.printStackTrace();}
//	}
//}