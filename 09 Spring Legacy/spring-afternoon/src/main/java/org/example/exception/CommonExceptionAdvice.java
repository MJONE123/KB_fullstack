package org.example.exception;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice // 모든 컨트롤러에서 발생하는 예외를 전역적으로 처리하는 클래스
@Log4j // 로그 출력을 위한 Lombok 어노테이션
public class CommonExceptionAdvice {

    private String context = "/exception"; // 예외 발생 시 이동할 뷰 페이지 경로

    @ExceptionHandler(NoHandlerFoundException.class) // 404 에러(페이지를 찾을 수 없음) 처리
    @ResponseStatus(HttpStatus.NOT_FOUND) // HTTP 상태 코드 404 반환
    public String handle404(NoHandlerFoundException e) {
        return context + "/404"; // 404 에러 페이지 반환
    }

    @ExceptionHandler(Exception.class) // 모든 예외를 처리하는 핸들러
    public String exception(Exception e, Model model) {
        log.error(e.getMessage()); // 예외 메시지를 로그로 출력
        e.printStackTrace(); // 예외 스택 트레이스 출력

        // 예외 정보를 모델에 추가하여 뷰에 전달
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("stackTrace", Arrays.asList(e.getStackTrace()));

        return context + "/error-page"; // 에러 페이지 반환
    }
}
