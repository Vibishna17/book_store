package dao;

import connection.MyConnection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDao {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(id) from user");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return row + 1;
    }

    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareStatement("select * from user where uemail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public void insert(int id, String username, String email, String phone, String pass, String address1, String address2) {
        String sql = "insert into user values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, pass);
            ps.setString(6, address1);
            ps.setString(7, address2);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "User added successfully");
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public String[] getUserValue(int id) {
        String[] value = new String[7];
        try {
            ps = con.prepareStatement("select * from user where uemail = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return value;
    }
    
    public int getUserId(String email) {
        int id = 0;
        try {
            ps = con.prepareStatement("select id from user where uemail = ?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return id;
    }
}
