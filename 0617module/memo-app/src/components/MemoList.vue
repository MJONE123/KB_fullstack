
<template>
  <table style="width: 100%">
    <thead>
      <tr>
        <th style="width: 50px">id</th>
        <th>title</th>
      </tr>
    </thead>

    <tbody>
      <!-- 문제 3. memos 프로퍼티로 MemoItem 컴포넌트를 메모 수 만큼 렌더링 하세요. -->
      
    </tbody>
  </table>
</template>

  <script setup>
  import MemoItem from "./MemoItem.vue";
  
  // 문제 3. memos 프로퍼티를 정의하세요.
  defineProps({
    memos: {
      type: Array,
      required: true,
    },
  });
  </script>

<style scoped></style>
