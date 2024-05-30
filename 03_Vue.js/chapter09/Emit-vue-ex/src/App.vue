<!-- 부모 컴포넌트(App.vue)에서 0 ~ 20 사이의 숫자를 랜덤으로 생성해서 자
식컴포넌트(ChildComponent.vue)로 props 를 통해 내려주세요
• 자식 컴포넌트는 input 요소가 있고, 정답 버튼이 있으며 부모로 부터 받은
랜덤 숫자를 맞출 수 있습니다
• 정답 버튼을 클릭하면 부모로 부터 받은 랜덤 값과 비교하여 상황에 따라 Up
/ Down / 정답입니다 를 emit 으로 전달 후, 부모 컴포넌트에서 출력하는
어플리케이션을 작성하세요 -->

<template>
  <div>
    <h1>{{ msg }}</h1>
    <ChildQuizComponent :rand="rand" @send-msg="changeMsg" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildQuizComponent from './components/ChildQuizComponent.vue';

const msg = ref('랜덤 숫자를 맞춰 주세요!');
const rand = ref(parseInt(Math.random() * 20));

function changeMsg(payload) {
  msg.value = payload;
}
</script>

