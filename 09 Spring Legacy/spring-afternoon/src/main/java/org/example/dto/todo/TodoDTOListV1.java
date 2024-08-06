package org.example.dto.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDTOListV1 {
    private static TodoDTOListV1 instance;
    private List<TodoDTO> todoDtoList;

    private TodoDTOListV1() {
        this.todoDtoList = new ArrayList<>();

        this.addList("스프링 정복하기");
        this.addList("코테도 정복하기");
    }

    public static synchronized TodoDTOListV1 getInstance() {
        if (instance == null) {
            instance = new TodoDTOListV1();
        }
        return instance;
    }

    public void addList(String todo) {
        this.todoDtoList.add(new TodoDTO(todo));
    }

    public List<TodoDTO> getList() {
        return todoDtoList;
    }
}
