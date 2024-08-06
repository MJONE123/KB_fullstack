package org.example.controller.todo;


import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDTOListV1;
import org.example.dto.todo.TodoDTOListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    private TodoDTOListV2 todoDTOList;

    @Autowired
    public TodoShowControllerV2(TodoDTOListV2 todoDTOList) {
        this.todoDTOList = todoDTOList;
    }

    @GetMapping("/todo/V2/show")
    public String process(HttpServletRequest request, HttpServletResponse response) {
        log.info("========> 투두 리스트 조회 페이지 호출, /todo/V2/show");

        request.setAttribute("todoList", todoDTOList.getList());
        return "todo-show";
    }
}