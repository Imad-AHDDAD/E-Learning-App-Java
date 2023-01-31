
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AHDDAD
 */
public class DBConnection {
    private Connection connection;
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning","root","root");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error creating connection ");
        }
        
    }
    
    public Connection getConnection(){
        return this.connection;
    }
}
