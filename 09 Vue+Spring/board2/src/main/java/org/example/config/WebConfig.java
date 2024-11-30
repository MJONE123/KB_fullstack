package org.example.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

// 웹 애플리케이션의 초기 설정을 담당하는 클래스
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 루트 설정 클래스를 지정 (DB, 서비스, 보안 등의 전역 설정)
        return new Class[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // 서블릿 설정 클래스를 지정 (Spring MVC 관련 설정)
        return new Class[] { ServletConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        // DispatcherServlet이 처리할 URL 패턴을 지정 ("/"는 모든 요청을 처리)
        return new String[] { "/" };
    }

    @Override
    protected Filter[] getServletFilters() {
        // 한글 인코딩 필터 설정 (모든 요청을 UTF-8로 설정)
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[] { characterEncodingFilter };
    }
}
