<template>
    <div>
        <ChidlSlot>
            <h1>
                테스트, 너는 잘 가니?!
            </h1>
        </ChidlSlot>
    </div>
</template>

<script>
import ChildSlotVue from './ChildSlot.vue';
import ChildSlot from './ChildSlot.vue'

    export default {
        name: 'ParentsSlot',
        Components: { ChildSlot }
    };
</script>

<style lang="scss" scoped>

</style>