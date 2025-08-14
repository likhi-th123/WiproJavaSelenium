package jdbcmysql;

import java.sql.*;

public class Student {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "likhi@123";

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            
            String createTable = "CREATE TABLE student (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "age INT, " +
                    "gender VARCHAR(10), " +
                    "email VARCHAR(100), " +
                    "phone VARCHAR(15), " +
                    "city VARCHAR(50), " +
                    "state VARCHAR(50), " +
                    "course VARCHAR(50), " +
                    "marks INT)";
            st.executeUpdate(createTable);
            System.out.println("Table created successfully.");

            //Insert 10 records
            String insertQuery = "INSERT INTO student VALUES " +
                    "(1,'Likhith',20,'M','likhith@mail.com','999','Bangalore','Karnataka','Java',85)," +
                    "(2,'Rohit',21,'M','rohit@mail.com','998','Hyderabad','Telangana','Python',80)," +
                    "(3,'Virat',22,'M','virat@mail.com','997','Delhi','Delhi','C++',75)," +
                    "(4,'Ram',23,'M','ram@mail.com','996','Chennai','Tamil Nadu','SQL',70)," +
                    "(5,'Charan',24,'M','charan@mail.com','995','Mumbai','Maharashtra','Java',90)," +
                    "(6,'Harika',25,'F','harika@mail.com','994','Pune','Maharashtra','Python',85)," +
                    "(7,'Yash',26,'M','yash@mail.com','993','Ahmedabad','Gujarat','C++',88)," +
                    "(8,'Hardik',27,'M','hardik@mail.com','992','Jaipur','Rajasthan','SQL',82)," +
                    "(9,'Anjali',28,'F','anjali@mail.com','991','Kolkata','West Bengal','Java',78)," +
                    "(10,'Sneha',29,'F','sneha@mail.com','990','Bhopal','Madhya Pradesh','Python',76)";
            st.executeUpdate(insertQuery);
            System.out.println("10 records inserted successfully.");

            //Delete 2nd and 4th records
            st.executeUpdate("DELETE FROM student WHERE id IN (2, 4)");
            System.out.println("Deleted 2nd and 4th records.");

            //Update 5th record
            st.executeUpdate("UPDATE student SET name='Alex', course='FullStack', marks=95 WHERE id=5");
            System.out.println("Updated 5th record.");
            
          //Displaying the student records
            String selqry="select * from student";
            ResultSet rs = st.executeQuery(selqry);
            try {
            		while(rs.next()) {
            			System.out.println(rs.getInt("id")+","+rs.getString("name")+","+rs.getInt("age"));
            		}
            	}catch(SQLException ex) {
            		ex.printStackTrace();
            	}

            // Close connection
            st.close();
            con.close();
            System.out.println("\nAll operations completed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
