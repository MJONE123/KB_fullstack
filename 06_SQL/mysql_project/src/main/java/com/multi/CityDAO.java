package com.multi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//mySQLDB연결 처리 담당 클래스
public class CityDAO {
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/world2";
    private String user = "root";
    private String password = "1234";

    //객체생성시 클래스로딩과 DB연결
    public CityDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("발생한 에러 정보>> " + e.getMessage());
        }
    }

    //city테이블에 데이터를 삽입 처리 기능 구현
    //문제 4-2. insert()메서드를 완성하여 데이터 삽입 처리를 구현하시오.
    //     조건1) try-catch를 이용하여 "하나 이상의 예외처리"를 하시오.
    //     조건2) db처리와 관련된 모든 객체에 대해 "자원해제 처리"를 하시오.
    //     조건3) city테이블에 넣을 데이터는 "sql문에 직접 필드 타입에 맞게 넣어" SQL문을 완성하시오.
    //     조건4) 해당 메서드에서 데이터 삽입 처리후 결과는 반환하지 않는다.

    public void insert() {

        //SQL문 완성


        /***********************************************
         * 구현 코드
         *
         *
         *
         */
        try {
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);
                System.out.println("1. 드라이버 설정 OK");


                String url = "jdbc:mysql://localhost:3306/user_ex";
                String id = "root";
                String password = "1234";

                Connection conn = DriverManager.getConnection(url, id, password);
                System.out.println("연결 성공~");


                String sql = "INSERT INTO users(ID, Name, CounrtryCode, District, Population) VALUES(?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, insert().getID());
                pstmt.setString(2, insert().getName());
                pstmt.setString(3, insert().getCountryCode());
                pstmt.setString(4, insert().getDistrict());
                pstmt.setInt(5, insert().getPopulation());


                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("회원 추가 성공");
                } else {
                    System.out.println("회원 추가 실패");
                }

                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


    } //insert기능 구현

    //city테이블에서 검색하여 UI에 반환 처리 기능 구현
    //문제 5-1. select()메서드를 완성하여 데이터 검색 처리를 구현하시오.
    //   조건1)  try-catch를 이용하여 "하나 이상의 예외처리"를 하시오.
    //   조건2)  db처리와 관련된 모든 객체에 대해 "자원해제 처리"를 하시오.
    //   조건3)  city테이블에서 검색에 사용할 SQL문은
    //          CityUI.java에서 전달된 데이터를 이용하여 완성한다.
    //   조건4)  해당 메서드에서 데이터 검색 처리후 결과 목록은 List<CityVO>타입으로 반환한다.

    public List<CityVO> select(int ID) {

        //SQL문 완성


        /***********************************************
         * 구현 코드
         *
         *
         *
         */
        List<CityVO> getList = new ArrayList<>();

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


            //3. 세번째 SQL 문 생성
            String sql = "SELECT ID, Name, CountryCode, District, Population FROM city";
            Statement stmt = conn.createStatement();


            //4. SQL 문 전송
            ResultSet rs = stmt.executeQuery(sql);

            //결과 데이터를 전부 순회하는 while 문
            while (rs.next()) {
                int getID = rs.getInt("ID");
                String getName = rs.getString("Name");
                String getCountryCode = rs.getString("CountryCode");
                String getGetDistrict = rs.getString("District");
                int getPopulation = rs.getInt("Population");

                CityVO cityVO = new CityVO(getID, getName, getCountryCode, getGetDistrict, getPopulation);
                getList.add();


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

    return null;
    } //select기능 구현
}
