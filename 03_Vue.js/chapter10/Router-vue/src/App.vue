<script setup>
import router from "./router";
</script>

<template>
  <div>
    <nav>
      <router-link to="/">홈페이지</router-link>
      &nbsp;
      <router-link to="/about">라우터란?</router-link>
      &nbsp;
      <router-link to="/dynamic/happy">행복하다</router-link>
      &nbsp;
      <router-link to="/dynamic/exciting">신난다🎶</router-link>
      &nbsp;
    </nav>
    <router-view />
  </div>
</template>

<style scoped></style>
