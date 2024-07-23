package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO2Ver2 {

    Connection conn = null;

    // constructor
    public UserDAO2Ver2() {
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
            //이건 UserDao와 달리 connetcion conn 선언을 미리했으니 conn만 쓴다.
            conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void addUser(UserVo1 newUser) {
        // try, catch, Exception e, e.printStackTrace 일단 만들고 시작
        try {
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
            } else {
                System.out.println("회원 추가 실패");
            }

            //5. 다섯번째 자원 해제. 쿼리문과 db연결 해제 이렇게 두개 해제하면됨
            pstmt.close();
//            얘를 가지고 있으면 conn정보가 날라가므로 주석처리
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public List<UserVo1> getAllUsers() {
        List<UserVo1> userList = new ArrayList<>();

        try {

            //3. 세번째 SQL 문 생성
            String sql = "SELECT id, email, password FROM users";
            Statement stmt = conn.createStatement();
            System.out.println("3.sql문 생성 ok");

            //4. SQL 문 전송
            ResultSet rs = stmt.executeQuery(sql);

            //결과 데이터를 전부 순회하는 whilr 문
    }catch (Exception e) {
            e.printStackTrace();
        }


    public void close() {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
