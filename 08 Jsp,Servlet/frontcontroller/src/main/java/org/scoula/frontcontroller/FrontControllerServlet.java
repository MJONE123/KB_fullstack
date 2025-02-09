package org.scoula.frontcontroller;

import org.scoula.frontcontroller.command.Command;
import org.scoula.frontcontroller.controller.HomeController;
import org.scoula.frontcontroller.controller.TodoController;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static jdk.javadoc.internal.tool.Main.execute;

@WebServlet("/")
public class FrontControllerServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    HomeController homeController = new HomeController();
    TodoController todoController = new TodoController();

    public void init() {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        getMap.put("/", homeController::getIndex);

        getMap.put("/todo/list", todoController::getList);
        getMap.put("/todo/view", todoController::getView);
        getMap.put("/todo/create", todoController::getCreate);
        getMap.put("/todo/update", todoController::getUpdate);

        postMap.put("/todo/create", todoController::getCreate);
        postMap.put("/todo/update", todoController::getUpdate);
        postMap.put("/todo/delete", todoController::postDelete);
    }

    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);
        System.out.println("commandName : " + commandName);

        Command command;
        if (request.getMethod().equals("GET")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }
        return command;
    }

    private void execute(Command command, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String viewName = command.execute(request, response);

        System.out.println(viewName);

        if(viewName.startsWith("redirect:")){
            response.sendRedirect(viewName.substring("redirect:".length()));

        }else {
            String view = prefix + viewName + suffix;
            RequestDispatcher disp = request.getRequestDispatcher(view);
            disp.forward(request, response);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Command command = getCommand(request);
        System.out.println("command: " + command);
        if (command != null) {
            execute(command, request, response);
        } else {
            String view = prefix +"404" + suffix;
            RequestDispatcher disp = request.getRequestDispatcher(view);
            disp.forward(request, response);

        }

    }
}

