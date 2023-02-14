package jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class DBWorker {
    private final String URL = "jdbc:mysql://localhost:3306/jdbcdb";
    private final String USERNAME = "bestuser";
    private final String PASSWORD = "bestuser";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }



    public DBWorker() {

        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(!connection.isClosed()) {
                System.out.println("access is successful!");
            }
//            connection.close();

        } catch(SQLException e) {
            e.printStackTrace();

        }

//        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        Statement statement = connection.createStatement()) {
//            statement.execute("INSERT INTO users (name, age, email) VALUES(\"Sasha\", 21, \"sasha@gmail.com\")");
//            int res = statement.executeUpdate("UPDATE users SET name=\"Victor\" WHERE id=2");
//            System.out.println(res);
//            ResultSet res = statement.executeQuery("SELECT * FROM users");
//            statement.addBatch("INSERT INTO users (name, age, email) VALUES(\"Pasha\", 21, \"kaska@gmail.com\")");
//            statement.addBatch("INSERT INTO users (name, age, email) VALUES(\"Gosha\", 21, \"brusok@gmail.com\")");
//
//            statement.executeBatch();
//
//            statement.clearBatch();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
