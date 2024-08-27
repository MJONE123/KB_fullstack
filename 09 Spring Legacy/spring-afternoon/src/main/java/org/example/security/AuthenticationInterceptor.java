package org.example.security;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(final HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        String requestURI = request.getRequestURI();
//        System.out.println("오청 URI : " + requestURI);
//
//        HttpSession session = request.getSession();
//        if (session.getAttribute("loginUser") == null) {
//            System.out.println("로그인 안됨. 리다이렉트 중 : ");
//            response.sendRedirect("/user/login");
//            return false;
//        }
//
//        return true;
//    }
}