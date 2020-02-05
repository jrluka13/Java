import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/postgresql?serverTimezone=UTC";
        String username = "root";
        String password = "7335511";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            System.out.println("Details");
            System.out.println("Student");
            while (resultSet.next()) {
                System.out.println("------------------------------------------");
                System.out.println("First Name: " +  resultSet.getString(4));
                System.out.println("Last Name: " + resultSet.getString(5));
                System.out.println("Address: " + resultSet.getString(6));
//
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
