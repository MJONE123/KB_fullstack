<template>
  <div>
    <h1>Date</h1>
    <h1>오늘은 {{ outputMsg }} 입니다ㅏㅏ</h1>
    <button @click="getYear">년도 출력</button>
    <button @click="getMonth">월 출력</button>
    <button @click="getDate">일 출력</button>
  </div>
</template>

<script setup>
import { computed } from "vue";
import { useDateStore } from "@/stores/date";

const dateStore = useDateStore();
const { getYear, getMonth, getDate } = dateStore;

const outputMsg = computed(() => dateStore.outputMsg);
</script>
