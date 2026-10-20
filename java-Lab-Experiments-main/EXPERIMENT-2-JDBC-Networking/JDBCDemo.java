import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_lab";
String user = "javalab";
String password = System.getenv("DB_PASSWORD");
        try (Connection con =
                DriverManager.getConnection(url, user, password)) {

            System.out.println("JDBC Connection Successful!");
            System.out.println("Connected to MySQL Server.");

        } catch (SQLException e) {
            System.out.println("JDBC Connection Failed!");
            System.out.println(e.getMessage());
        }
    }
}