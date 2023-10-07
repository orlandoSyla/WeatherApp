package Com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnnector {
    public static Connection getDbConnection() throws SQLException {
        Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "711191888");
        return conn;
    }
}
