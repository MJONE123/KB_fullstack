<script setup>
import { defineProps } from 'vue';

defineProps({
  memo: {
    type: Object,
    required: true,
  },
});
</script>

<template>
  <tr>
    <td>{{ memo.id }}</td>
    <td>{{ memo.title }}</td>
  </tr>
</template>

<style scoped></style>
