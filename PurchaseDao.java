package dao;
import connection.MyConnection;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PurchaseDao {
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(id) from purchase");
            while (rs.next()) {
                row = rs.getInt(1);       
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return row + 1;
    }
}
