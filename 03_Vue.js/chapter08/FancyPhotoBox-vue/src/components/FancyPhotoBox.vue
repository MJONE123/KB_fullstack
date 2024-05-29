<template>
    <div class="fancy">
        <slot name="title"></slot>
        <slot name="photo"></slot>
    </div>
</template>

<script>
    export default {
        name: 'FancyPhotoBox',
    };
</script>

<style>
    .fancy {
        text-align: center;
        padding: 30px;
        border-radius: 30px;
        border: 10px solid #c8c8c8;
        background-color: #c8c8;
        margin: 30px 0px;
    }
</style>