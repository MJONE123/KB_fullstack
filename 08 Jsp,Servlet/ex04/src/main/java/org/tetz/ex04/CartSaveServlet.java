package org.tetz.ex04;

import jakarta.servlet.http.HttpSession;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cart_save")
public class CartSaveServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        String product = request.getParameter("product");

        HttpSession session = request.getSession();
        ArrayList<String> list = (ArrayList<String>)session.getAttribute("product");
            if(list == null) {
                list = new ArrayList<String>();
                session.setAttribute("product", list);
            }
            list.add(product);

            out.println("<html><body>");
            out.print("product 추가!!<br>");

    }


}