package org.example.dto.todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoDTOListV2 {
    private List<TodoDTO> todoDTOList;

    private TodoDTOListV2() {
        this.todoDTOList = new ArrayList<>();

        this.addList("독거미 맛있게 먹기");
        this.addList("리액트 강의 듣기");
    }
    public void addList(String todo) {
        this.todoDTOList.add(new TodoDTO(todo));
    }

    public List<TodoDTO> getList() {
        return todoDTOList;
    }
}
