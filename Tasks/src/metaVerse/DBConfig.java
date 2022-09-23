package metaVerse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

   static Connection connection;


    public static Connection getConnection() throws SQLException
    {
        connection =  DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/rva-db", "postgres", "rva");
        return connection;
    }

    public static void closeConnection( Connection con ) throws SQLException
    {
        if ( con != null )
        {
            con.close();
        }
    }



}
