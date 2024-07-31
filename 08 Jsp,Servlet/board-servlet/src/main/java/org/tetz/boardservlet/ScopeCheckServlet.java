package org.tetz.boardservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "/scope-check")
public class ScopeCheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("request", "리퀘스트 스코프에 저장한 데이터");

        HttpSession session = req.getSession();
        session.setAttribute("session", "세션 스코프에 저장한 데이터");

        ServletContext context = getServletContext();
        context.setAttribute("application", "어플리케이션 스코프에 저장한 데이터");

        req.getRequestDispatcher("scope.jsp").forward(req, resp);
    }


}
