package org.example.todo2;

import org.example.user.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final Connection conn;

    public UserDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVO loginUser(String userId, String password) {
        String sql = "SELECT * FROM todo_user WHERE user_id = ? AND password = ?";
        UserVO loginUser = null;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    loginUser = new UserVO(rs.getString("user_id"), rs.getString("name"), rs.getString("password"), null);
                };
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return loginUser;
    }
}