<template>
  <div>
    <h1>오늘의 기분은?? {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed, watch } from "vue";
import { useRoute } from "vue-router";

const currnetRoute = useRoute();
const mood = ref(currnetRoute.params.mood);

watch(() =>
  currnetRoute.params.mood,
  (newMood) => (mood.value = newMood)
);
const msg = computed(() =>
  mood.value === "happy" ? "행복합니다" : "신난당🎶🎶"
);

const imgSrc = computed(() =>
  mood.value === "happy"
    ? "https://imgnews.pstatic.net/image/023/2024/06/03/0003838087_001_20240603131213986.jpg?type=w647"
    : "https://imgnews.pstatic.net/image/020/2024/06/03/0003568407_001_20240603122308268.jpg?type=w647"
);
</script>
