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
                ? { textDecoration: 'line-through' }
                : { textDecoration: 'none' }
            "
            v-on:click="toggleTodo(todoItem.id)"
            >{{ todoItem.todo }} {{ todoItem.done ? "(완료)" : "" }}
          </span>
          <!-- <수정모드> -->
          <div v-if="todoItem.editing">
            <input type="text" v-model.trim="todoEdit" />
            <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
            <button v-on:click.stop="cancelEditTodo(todoItem.id)">취소</button>
          </div>
          &nbsp;
          <!-- v-if="!todoItem.editing" -->
          <span v-if="!todoItem.editing">
            <button @click.stop="editTodo(todoItem.id)">수정</button>
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
const todoEdit = ref("");
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

async function toggleTodo(id) {
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    //수정할 때 살려하 할 것은 ...targetTodo 해버린다!!!!!매우중요@@@@@@@@@@@@
    const payload = { ...targetTodo, done: !targetTodo.done };

    const toggleTodoRes = await axios.put(BASEURL + `/${id}`, payload);

    if (toggleTodoRes.status !== 200) return alert("Todo toggle 실패");

    fetchTodoList();
  } catch (e) {
    alert("Todolist 토글 작업 중 ERR 발생");
    console.log(e);
  }
}

function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = true;
}

function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = false;
}
// 확인은 서버에 전송을 해야 하니 async를 해야한다.
async function confirmEditTodo(id) {
  // 비동기처리할거니 무지성으로 trycatch
  if (todoEdit.value === "") return alert("수정 내용을 입력하세요!");
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    // editing: false 입력해야 수정한 뒤에 창이 사라짐
    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };

    const editTodoRes = await axios.put(BASEURL + `/${id}`, payload);

    if (editTodoRes.status !== 200) return alert("Todo 수정 실패");

    todoEdit.value = "";
    fetchTodoList();
  } catch (e) {
    alert("수정 작업 중 ERR 발생");
    console.log(e);
  }
}

fetchTodoList();
</script>

<style scoped>
* {
  user-select: none;
}
</style>
