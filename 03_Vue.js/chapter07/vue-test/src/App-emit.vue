<script setup>
import SendNameComponent from './components/SendNameComponent.vue';
</script>

<template>
  <div>
    <h1> 너의 이름은 {{ name }}</h1>
    <SendNameComponent v-on:nameChange="NameChangeHandler" />
  </div>
</template>

<script>
  export default {
    name: 'App',
    data() {
      return{
        name:'',
      };
    },
    methods: {
      NameChangeHandler(e) {
       this.name = e.name;

      }
    }
  }
</script>

<style lang="scss" scoped>

</style>