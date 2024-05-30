<template>
  <div>
      <h1>{{ msg }}</h1>
      <EmitChildVue @send-msg="emitHandler"/>
  </div>
</template>

<script setup>
import {ref} from 'vue';
import EmitChildVue from './components/EmitChildVue.vue';

const msg = ref('자식놈이 바꿀 메세지입니다');
function emitHandler(value) {
  msg.value= Value;
}
</script>

<style lang="scss" scoped>

</style>