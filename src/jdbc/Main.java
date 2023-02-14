package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();

        String query = "SELECT * FROM users";

        try {
            Statement statement = dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setEmail(resultSet.getString("email"));
                System.out.println(user);
//                int id = resultSet.getInt(1);
//                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
