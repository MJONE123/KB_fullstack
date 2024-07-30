package org.tetz.boardservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class CountFilter implements Filter {
    public static int count = 0;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                count++;

        System.out.println("카운트: " + count);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
