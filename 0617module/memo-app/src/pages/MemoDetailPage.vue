<script setup>
import { ref, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const BASE = '/api/memo';
const memo = ref({ title: '', content: '' });

const back = () => {
  router.push('/memo');
};

onMounted(() => {
  load();
});

const load = async () => {
  const memoId = useRoute().params.id;
  const response = await axios.get(`${BASE}/${memoId}`);
  memo.value = response.data;
};
</script>

<template>
  <div>
    <h2>제목: {{ memo.title }}</h2>
    <hr />
    {{ memo.content }}
    <div>
      <button @click="back">돌아가기</button>
    </div>
  </div>
</template>

<style scoped></style>
