<script setup></script>

<template>
  <div>
    <nav>
      <router-link to="/"> 홈 </router-link>
      &nbsp;
      <router-link to="/about"> 라우터란 </router-link>
      &nbsp;
    </nav>
    <router-view />
  </div>
</template>
