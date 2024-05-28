<script setup>
import CheckList from './components/CheckList.vue';
import TodoProps from './components/TodoProps.vue';
</script>


<template>
  <div class="todo">
    <h1>오늘의 할일</h1>
    <CheckList/>
    <hr/>
    <TodoProps todo="Vue부수기"/>

    <h2>뷰 부수기</h2>
    <hr/>
    <CheckList/>
    <TodoProps todo="배열함수 끝장??"/>
    <h2>배열함수 끝장내기</h2>
  </div>
</template>

  <style>
  .todo{
    text-align: center;
  }
  </style>
