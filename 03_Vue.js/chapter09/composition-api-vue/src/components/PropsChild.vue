<template>
    <div>
        <h2> {{ msg }}</h2>
    </div>
</template>

<script setup>
import { defineProps } from 'vue';

const props = defineProps({
    msg: {
        type: String,
        required: true,
    },
});
</script>

<style lang="scss" scoped>

</style>