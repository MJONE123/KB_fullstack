package org.scoula.frontcontrollerservlet.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "FrontControllerServlet", value = "/")
public class FrontControllerServlet extends HttpServlet {
    private Map<String, Controller> controllers = new HashMap<>();

    @Override
    public void init() throws ServletException {
        // 주소값과 컨트롤러 맵핑
        controllers.put("/", new HomeController());
        controllers.put("/about", new AboutController());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        System.out.println("requestURI: " + requestURI);
        String contextPath = req.getContextPath();
        System.out.println("contextPath: " + contextPath);
        String path = requestURI.substring(contextPath.length());
        System.out.println("path: " + path);

        Controller controller = controllers.get(path);

        if (controller != null) {
            String viewName = controller.getView(req, resp);
            String targetView = "/WEB-INF/views/" + viewName + ".jsp";
            req.getRequestDispatcher(targetView).forward(req, resp);
        } else {
            String notFoundView = "WEB-INF/views/404.jsp";
            req.getRequestDispatcher(notFoundView).forward(req, resp);
        }

    }
}

