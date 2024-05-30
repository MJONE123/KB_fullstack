<!-- 부모 컴포넌트(App.vue)에서 0 ~ 20 사이의 숫자를 랜덤으로 생성해서 자
식컴포넌트(ChildComponent.vue)로 props 를 통해 내려주세요
• 자식 컴포넌트는 input 요소가 있고, 정답 버튼이 있으며 부모로 부터 받은
랜덤 숫자를 맞출 수 있습니다
• 정답 버튼을 클릭하면 부모로 부터 받은 랜덤 값과 비교하여 상황에 따라 Up
/ Down / 정답입니다 를 emit 으로 전달 후, 부모 컴포넌트에서 출력하는
어플리케이션을 작성하세요 -->
<template>
  <div>
    <input type="text" v-model.number="inputNum" />
    <button @click="checkAnswer">정답 확인!</button>
  </div>
</template>

<script setup>
import { ref, defineProps, defindEmits } from 'vue';

const props = defineProps({
  rand: {
    type: Number,
    required: true,
  },
});

const inputNum = ref(0);

const emit = defindEmits(['send-msg']);

function checkAnswer() {
  let msg = '';

  if (props.rand === inputNum.value) {
    msg = '정답입니다!';
  } else if (props.rand > inputNum.value) {
    msg = 'UP';
  } else {
    msg = 'DOWN';
  }
  emit('send-msg', msg);
}
</script>
  