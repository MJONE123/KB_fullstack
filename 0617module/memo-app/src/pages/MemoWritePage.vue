<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const BASE = '/api/memo';
const memo = ref({ title: '', content: '' });

const submit = async () => {
  await axios.post(BASE, memo.value);
  router.push('/memo');
};

const back = () => {
  router.push('/memo');
};
</script>

<template>
  <h2>새 메모 작성</h2>
  <div>제목: <input v-model="memo.title" /></div>
  <div>내용: <textarea rows="5" style="width: 100%" v-model="memo.content"></textarea></div>
  <button @click="submit">확인</button>
  <button @click="back">돌아가기</button>
</template>

<style scoped></style>
