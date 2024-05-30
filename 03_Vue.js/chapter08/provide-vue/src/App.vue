<script setup>
import Child from './components/Child.vue';
</script>

<template>
  <div>
    <Child :drilling="drilling" />
  </div>
</template>

<script>
export default {
  name:'App',
  data() {
    return{
      drilling: '어느정도높이까지내려가는거예요???',
    };
  },
  provide() {
    return {
      fly: 'App에서 맨 밑에 Child까지 한방에 올 수있는 방법은??? Provide!!!'
    }
  }
};
</script>