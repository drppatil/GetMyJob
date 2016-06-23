package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/HRBASE";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "root";
        static Connection connection = null;

        public  static Connection getConnection() {
            try {
                Class.forName(JDBC_DRIVER).newInstance();
               // Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return connection;
        }

}
