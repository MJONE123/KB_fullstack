<script setup>
import FancyPhotoBox from "./components/FancyPhotoBox.vue";
import ParentFancyPhotoBox from "./components/ParentFancyPhotoBox.vue";
import ParentScopedSlot from "./ParentScopedSlot.vue"
</script>

<template>
  <div>
    <ParentFancyPhotoBox />
  </div>
</template>

<script>
import  FancyPhotoBox  from './FancyPhotoBox.vue';

export default {
    name: 'FancyPhotoBox',
    components: {
      FancyPhotoBox,
      ParentScopedSlot,
      ChildScopedSlot,
    },
};

</script>


<style scoped>

</style>
