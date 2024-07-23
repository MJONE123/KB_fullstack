package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO2 {
    public void addUser(UserVo1 newUser) {
        // try, catch, Exception e, e.printStackTrace 일단 만들고 시작
        try {
            // 1.첫번째로 Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2.두번째로 DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            //접속과정
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            //3.세번째  SQL문 생성
            String sql = "INSERT INTO users(email, password) VALUES(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newUser.getEmail());
            pstmt.setString(2, newUser.getPassword());
            System.out.println("3.sql문 생성 OK");

            //4. 네번째 SQL문 전송 및 실행
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 추가 성공");
            }else {
                System.out.println("회원 추가 실패");
            }

            //5. 다섯번째 자원 해제. 쿼리문과 db연결 해제 이렇게 두개 해제하면됨
            pstmt.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
