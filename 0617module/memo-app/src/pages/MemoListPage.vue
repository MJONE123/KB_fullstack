<script setup>
import MemoItem from '@/components/MemoItem.vue';
import { defineProps } from 'vue';

defineProps({
  memos: {
    type: Array,
    required: true,
  },
});

// load();
</script>

<template>
  <table style="width: 100%">
    <thead>
      <tr>
        <th style="width: 50px">id</th>
        <th>title</th>
      </tr>
    </thead>
    <tbody>
      <MemoItem v-for="memo in memos" :key="memo.id" :memo="memo" />
    </tbody>
  </table>
</template>

<style scoped></style>
