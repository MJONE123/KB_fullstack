package org.example.dto.todo;

public class TodoDTO {
    private String todo;

    public TodoDTO(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}