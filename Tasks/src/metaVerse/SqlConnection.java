package metaVerse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import metaVerse.eNUM.Gender;

public class SqlConnection {
    public static void main(String[] args) {
        SqlConnection sqlConnection = new SqlConnection();
        List<Shoe> shoeList =sqlConnection.getAllShoes();
        shoeList.forEach(System.out::println);
        boolean b = sqlConnection.deleteShoesById(shoeList.get(0).getId());
        if(b){
            System.out.println("silindi");
        }else System.out.println("silinmedi");
        List<Shoe> shoeListAfterUpdate =sqlConnection.getAllShoes();
        shoeListAfterUpdate.forEach(System.out::println);

    }

    boolean addShoes(Shoe shoe) {
        boolean result=false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/rva-db", "postgres", "rva");
            String sql = "INSERT INTO nese.shoes ( gender, brand, size, colour, price) VALUES ( ?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "kisi");
            preparedStatement.setString(2, "puma");
            preparedStatement.setString(3, "42");
            preparedStatement.setString(4, "grey");
            preparedStatement.setInt(5, 30);
            result= preparedStatement.execute();
            connection.close();
            System.out.println("Connected to PostgreSQL server");
        } catch (SQLException e) {
            System.out.println("Error in connectiong to PostgreSQL server");
            e.printStackTrace();
        }
        return result;
    }
    public List<Shoe> getAllShoes() {
        Connection connection = null;
        try {
            List<Shoe> shoeList = new ArrayList<>();
            String sql = "SELECT  gender, brand, size, colour, price, id FROM nese.shoes where status=1";
            connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Shoe shoe = new Shoe(Gender.valueOf(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
                shoeList.add(shoe);
            }
            DBConfig.closeConnection(connection);
            return shoeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    public boolean deleteShoesById(int shoeId) {
        Connection connection = null;
        try {
            String sql = "delete  from  nese.shoes where   id=?";
            connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,shoeId);
            int i = preparedStatement.executeUpdate();
            DBConfig.closeConnection(connection);
            if (i > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
