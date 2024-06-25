<template>
  <div class="home">
    <Header />
    <Balance />
    <MonthlyChart />
  </div>
</template>

<script>
import Header from '../components/Header.vue'
import Balance from '../components/Balance.vue'
import MonthlyChart from '../components/MonthlyChart.vue'

export default {
  name: 'Home',
  components: {
    Header,
    Balance,
    MonthlyChart
  }
}
</script>