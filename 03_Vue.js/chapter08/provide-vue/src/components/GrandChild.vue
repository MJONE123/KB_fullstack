<template>
    <div>
        <h1>child -> child -> GrandChild 까지 드릴링해서 내려온 props 의 내용은?</h1>
        <h2>{{ drilling }}</h2>
        <h2>{{ fly }}</h2>
    </div>
</template>

<script>
    export default {
        name: 'GrandChild',
        props: ['drilling'],
        inject: ['fly'],
    }
</script>

<style lang="scss" scoped>

</style>
  