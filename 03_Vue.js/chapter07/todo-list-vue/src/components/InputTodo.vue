<template>
    <div>
        <input type="text" v-model.trim="todo" />
        <button @click="$emit('addTodo', )">더해</button>
    </div>
</template>

<script>
    export default {
        name: 'InputTodo',
        data() {
            return {
                todo: '',
            }
        },
    };
</script>

<style lang="scss" scoped>

</style>