<script>
import CheckboxItem from "./components/CheckboxItem.vue";
export default {
  name: "App",
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: "BTS", checked: true },
        { id: 2, name: "Black Pink", checked: false },
        { id: 3, name: "EXO", checked: false },
        { id: 4, name: "ITZY", checked: false },
      ],
    };
  },
};
</script>
<template>
  <header>
    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>

    <div>
      <h2>App 컴포넌트</h2>
      <hr />
      <ul>
        <CheckboxItem />
        <CheckboxItem />
        <CheckboxItem />
        <CheckboxItem />
      </ul>
    </div>
  </header>

  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>

<style scoped>
header {
  line-height: 1.5;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }


  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
