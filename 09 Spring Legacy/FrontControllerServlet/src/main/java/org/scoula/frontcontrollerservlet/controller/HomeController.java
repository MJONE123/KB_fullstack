package org.scoula.frontcontrollerservlet.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("imgsrc", "data:image/jpeg;base64,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");
        return "index";
    }
}