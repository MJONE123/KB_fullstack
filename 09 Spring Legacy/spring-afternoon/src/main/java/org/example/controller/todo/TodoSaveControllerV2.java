package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDTOListV1;
import org.example.dto.todo.TodoDTOListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class TodoSaveControllerV2 {
    private TodoDTOListV2 todoList;

    @Autowired
    public TodoSaveControllerV2(TodoDTOListV2 todoDTOList) {
        this.todoDTOList = todoDTOList;
    }

    @RequestMapping(value = "/todo/V2/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest request) {
        log.info("========> 할 일 추가, Request 호출, /todo/form/save");

        String todo = request.getParameter("todo");

        todoList.addList(todo);

        request.setAttribute("todoList", todoList.getList());
        return "todo-show2";
    }
}