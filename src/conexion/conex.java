package conexion;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;

public class conex {
    static Connection connection;

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlines_reservation","root","");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Connection failed"+e);
        }
        return connection;
    }
}
