<script setup>
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';
</script>

<template>
  <div style="display: flex; flex-direction:column; align-items:center">
    <h1> joonil TodoList</h1>
    <InputTodo @addTodo="addTodo"/>
    <TodoList 
    :todolist="todoList" 
    @toggleCompleted="toggleCompleted" 
    @deleteTodo="deleteTodo"
    />
  </div>  
</template>

<script>
export default {
  components: {InputTodo, TodoList},
  data() {
    return {
      todoList: [
        {id: 1, todo: 'TodoList 만들기', completed: true},
        {id: 2, todo: 'vue 복습하기', completed: false},
        {id: 3, todo: '블로그 올리기', completed: false},
        {id: 4, todo: '코테 내용 복습하기', completed: false},
      ],
    };
  },
  methods: {
    addTodo(todo) {
      this.todoList.push({
        id: this.todoList.length + 1,
        todo: todo.todo,
        completed: false,
      });
    },
    toggleCompleted(id) {
      const index = this.todoList.findIndex(function(item, index) {
        return id === item.id;
      });
      this.todoList[index].completed = !this.todoList[index].completed;
    },
    deleteTodo(id) {
      const index = this.todoList.findIndex((item) => id === item.id);
      this.todoList.splice(index, 1);
    }
  },
};
</script>

<style scoped>
</style>
