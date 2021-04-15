import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
                    );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT  * FROM albums");
            while (rs.next()) {
//                System.out.println("id: " + rs.getLong(1));
                System.out.println("artist: " + rs.getString("artist"));
                System.out.println("name: " + rs.getString(3));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
