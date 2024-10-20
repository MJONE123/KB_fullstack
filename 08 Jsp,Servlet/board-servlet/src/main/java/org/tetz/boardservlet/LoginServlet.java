package org.tetz.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1234";
    private static Connection con = null;

    @Override
    public void init() throws ServletException {
        System.out.println("#### LoginServlet init 메서트 호출####");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            System.out.println("####MYSQL 연결 성공 ####");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        boolean isLoginSuccess = false;

        try {
            String sql = "select * from users where username = ? and password = ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        isLoginSuccess = true;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (isLoginSuccess) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("/board");
        } else {
            response.sendRedirect("loginFailed.jsp");
        }


    }

    @Override
    public void destroy() {
        try{
            con.close();
            System.out.println("####MYSQL 접속 종료####");
        }catch(Exception e) {
            e.printStackTrace();
        }


        System.out.println("####loginservlet destroy 호출####");
    }
}
