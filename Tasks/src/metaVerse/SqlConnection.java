package metaVerse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    public static void main(String[] args) {
        String jdbcurl ="jdbc:postgresql://5432/postgres";
        try {
            Connection connection = DriverManager.getConnection(jdbcurl);
            System.out.println("Connected to PostgreSQL server");
        } catch (SQLException e) {
            System.out.println("Error in connectiong to PostgreSQL server");
            e.printStackTrace();
        }
    }
}
