package cap_27_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UpdateEmployee {
    public static void main(String[] args) {
        //take data as userinput using scanner
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/testdb";
            String username = "postgres";
            String password = "070323";

            Connection connection = DriverManager.getConnection(url, username, password);


            // 4.create query
            String query="update employeeemp set email=? where id=?;";


            // 3.create statement
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, "any@gmail.com");
            ps.setInt(2,1);

            int executeUpdate = ps.executeUpdate();
            System.out.println(executeUpdate);

            connection.close();

            System.out.println("employee data successful.");

        }catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
