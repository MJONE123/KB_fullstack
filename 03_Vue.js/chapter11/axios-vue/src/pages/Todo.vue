<template>
  <main>
    <div>
      <h1>Todo List</h1>
      <!-- Todo 입력 파트 -->
      <div>
        <input type="text" v-model.trim="todo" />
        <button @click="addTodo">추가</button>
      </div>
      <br />
      <ol>
        <li v-for="todoItem in states.todoList" :key="todoItem.id">
          <span
            :style="
              todoItem.done
                ? { textDecoration: 'line_thruogh' }
                : { textDecoration: 'done' }
            "
            >{{ todoItem.todo }} {{ todoItem.done ? "(완료)" : "" }}</span
          >
          &nbsp;
          <!-- v-if="!todoItem.editing" -->
          <span>
            <button>수정</button>
            /
            <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
          </span>
        </li>
      </ol>
    </div>
  </main>
</template>

<script setup>
import axios from "axios";
import { ref, reactive } from "vue";

const states = reactive({
  todoList: [],
});

const todo = ref("");
// api는 로컬호스트:3000이다. 위에서 선언함
const BASEURL = "api/todos/";

async function fetchTodoList() {
  try {
    const fetchtodoRes = await axios.get(BASEURL);

    states.todoList = fetchtodoRes.data;

    console.log(states.todoList);
  } catch (e) {
    alert("TodoList 데이터 통신 Err 발생");
    console.log(e);
  }
}

async function addTodo() {
  if (todo.value === "") return alert(" 할 일을 입력하세용");

  try {
    const newTodo = { todo: todo.value, done: false };
    const addTodoRes = await axios.post(BASEURL, newTodo);

    if (addTodoRes.status !== 201) return alert("Todo 추가 실패");

    todo.value = "";
    fetchTodoList();
  } catch (e) {
    alert("Todolist 추가 작업 중, ERR 발생");
    console.log(e);
  }
}

async function deleteTodo(id) {
  try {
    const deleteTodoRes = await axios.delete(BASEURL + `/${id}`);

    if (deleteTodoRes.status !== 200) return alert("Todo 삭제 실패");

    fetchTodoList();
  } catch (e) {
    alert("Todolist 삭제 작업 중... ERR 발생");
    console.log(e);
  }
}

fetchTodoList();
</script>
