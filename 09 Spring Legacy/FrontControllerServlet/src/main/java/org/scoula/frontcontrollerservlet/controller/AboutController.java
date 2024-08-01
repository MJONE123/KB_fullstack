package org.scoula.frontcontrollerservlet.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("msg", "컨트롤러가 전달한 메세지입니다.");
        req.setAttribute("imgsrc", "https://flexible.img.hani.co.kr/flexible/normal/970/783/imgdb/child/2024/0731/17224034838018_8617224032804765.jpg");
        return "about";
    }
}
