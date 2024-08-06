import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {

    private final String url = "jdbc:mysql://localhost:3306/hotel";
    private final String username = "root";
    private final String password = "My123";

    public void loadDrivers() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    public Connection getconnection(){
        Connection connection = null;
        try{
           connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return connection;
    }



}
