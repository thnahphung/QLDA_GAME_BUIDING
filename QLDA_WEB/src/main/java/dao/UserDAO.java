package dao;

import db.DBConnect;
import model.User;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    static UserDAO instance;

    //kết nối với MySQL
    public static UserDAO getInstance() {
        if (instance == null) instance = new UserDAO();
        return instance;
    }

    public static List<User> getAllUser() {
        List<User> result = new ArrayList<>();
        try {
            CallableStatement callableStatement = DBConnect.getInstance().get().prepareCall("{call getAllUser()}", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            callableStatement.execute();
            ResultSet rs = callableStatement.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setLinkAvatar(rs.getString(5));
                user.setTotalGames(rs.getInt(6));
                user.setTotalWins(rs.getInt(7));
                result.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
