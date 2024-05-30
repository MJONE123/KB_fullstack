<template>
  <div>
    <h1>{{ count }}</h1>
    <h1>x = {{ obj.x }} / y = {{ obj.y }}</h1>
    <h1> {{ double }} </h1>
    <button @click="increment">+1</button>
    <br />
    <button @click="decrement">-1</button>
    <h2>버튼 누른 횟수: {{ actionCount }}</h2>
    <PropsChild :msg="msg"/>
    <p style="color: red">프롭스로 전달 될 메세지</p>

  </div>
</template>

<script setup>
import { ref, reactive, computed } from 'vue';
import PropsChild from './components/PropsChild.vue';

const count = ref(2);
const obj = reactive({x : 0, y : 0, result: 0});
const actionCount = ref(0);
const double = computed(function() {
  return count.value * 2;
});
function increment() {
  count.value++;
  actionCount.value++;
}
function decrement() {
  count.value--;
  actionCount.value++;
}

const msg = ref('props로 전달 될 메세지');
</script>


<style scoped>

</style>
