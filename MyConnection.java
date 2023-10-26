package connection;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;


public class MyConnection {
    public static final String username = "root";
    public static final String password = "Chinnu@2000";
    public static final String url = "jdbc:mysql://localhost:3306/online_book_shop";
    public static Connection con = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e,"", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
