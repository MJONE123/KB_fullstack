package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            } else {
                System.out.println("회원 추가 실패");
            }

            //5. 다섯번째 자원 해제. 쿼리문과 db연결 해제 이렇게 두개 해제하면됨
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<UserVo1> getAllUsers() {
        List<UserVo1> userList = new ArrayList<>();

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

            //3. 세번째 SQL 문 생성
            String sql = "SELECT id, email, password FROM users";
            Statement stmt = conn.createStatement();
            System.out.println("3.sql문 생성 ok");

            //4. SQL 문 전송
            ResultSet rs = stmt.executeQuery(sql);

            //결과 데이터를 전부 순회하는 while 문
            while (rs.next()) {
                int userid = rs.getInt("id");
                String email = rs.getString("email");
                String userpassword = rs.getString("password");

                UserVo1 user = new UserVo1(userid, email, userpassword);
                userList.add(user);

                //5. 자원 해제
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //6. 결과 리턴
        //데이터가 전부 추가된 리스트를 리턴
        // 통신이 잘못되면 try catch 구문이 정상적으로 실행이 안되므로 빈 리스트가 리턴

        return userList;
    }

    public void updateUser(int userid, String newEmail, String newPassword) {
        try{
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

            //3. SQL 문 생성
            String sql = "UPDATE users SET email = ?, password = ? WHERE id = ?";
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1, newEmail);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, userid);
            System.out.println("3. SQL 문 생성 OK");

            //4. SQL 문 전송
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 정보 수정 성공!");
            }else {
                System.out.println("회원 정보 수정 실패!");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userid) {
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

            //3. SQL 문 생성
            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userid);
            System.out.println("3. SQL 문 생성 OK");

            // 4. SQL 문 전송
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 삭제 성공!");
            }else {
                System.out.println("회원 삭제 실패");
            }

            //5. 자원 해제
            pstmt.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllUsersWithName() {
        try{
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

            //3. SQL문 생성
            String sql = "SELECT users.id, users.email, users.password, user_info.name" +
                    "FROM users" +
                    "JOIN user_info ON users.id = user_info.id";
            Statement stmt = conn.createStatement();
            System.out.println("3. SQL문 생성 OK");

            //4. SQL 문 전송
            
        }
    }



}