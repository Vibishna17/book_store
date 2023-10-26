package dao;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import user.Forgotpassword;

public class ForgotpasswordDao {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareCall("select * from user where uemail = ?");
            ps.setString(1,email);
            rs = ps.executeQuery();
            if(rs.next()){
                Forgotpassword.UserNameBox.setText(rs.getString(3));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Email address doesn't exist");
            }
        } catch (SQLException e) {
            Logger.getLogger(ForgotpasswordDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    // set new password
    public void setPassword(String email, String pass){
        String sql = "update user set password = ? where uemail = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, email);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Password successfully updated");
            }
        } catch (SQLException e) {
            Logger.getLogger(ForgotpasswordDao.class.getName()).log(Level.SEVERE, null, e);
        }    
    }
}
