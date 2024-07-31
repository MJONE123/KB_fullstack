package org.tetz.boardservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "/ex1")
public class Ex1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg1", "오늘은 하늘이 맑았다");

        HttpSession session = req.getSession();
        session.setAttribute("msg2", "그런데 좀 더운듯");

        ServletContext context = getServletContext();
        context.setAttribute("msg3", "암튼 럭키비키");

        req.getRequestDispatcher("ex1.jsp").forward(req, resp);
    }


}
