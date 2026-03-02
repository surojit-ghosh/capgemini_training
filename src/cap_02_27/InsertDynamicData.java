package cap_02_27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class InsertDynamicData {
    public static void main(String[] args) {
        //take data as userinput using scanner
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc32:postgresql://localhost:5432/testdb";
            String username = "postgres";
            String password = "070323";

            Connection connection = DriverManager.getConnection(url, username, password);


            // 4.create query
            String query = "insert into employeeemp values(?,?,?,?);";

            // 3.create statement
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, 10);
            ps.setString(2, "Rajat Patidar");
            ps.setString(3, "Rajat@gmail.com");
            ps.setDouble(4, 15000.00);

            int executeUpdate = ps.executeUpdate();
            System.out.println(executeUpdate);

            connection.close();

            System.out.println("Updated");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
