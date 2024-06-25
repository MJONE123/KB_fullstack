<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<style>
body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  background-color: #f0f0f0;
}

#app {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  background-color: white;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

@media (max-width: 600px) {
  #app {
    padding: 10px;
  }
}
</style>