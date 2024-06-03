<template>
  <div>
    <nav>
      <router-link to="/">홈페이지</router-link>
      &nbsp;
      <router-link to="/login">로그인</router-link>
      &nbsp;
      <router-link to="todo">Todolist</router-link>
      &nbsp;
    </nav>
    <router-view />
  </div>
</template>

<script setup>
localStorage.setItem("name", "문준일");
localStorage.setItem("joonil", "준일에오");
localStorage.setItem("pororo", "뽀로로");
// localStorage.removeItem("pororo"); 하나씩 삭제
// localStorage.clear(); 전체 삭제

const name = localStorage.getItem("name");
console.log(localStorage);
</script>
