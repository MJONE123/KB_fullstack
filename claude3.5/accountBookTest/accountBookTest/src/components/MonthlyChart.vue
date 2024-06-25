<template>
  <div class="monthly-chart">
    <h3>월별 지출 차트</h3>
    <div class="chart">
      <div v-for="(expense, index) in monthlyExpenses" :key="index" class="bar-container">
        <div class="bar" :style="{ height: getBarHeight(expense) }">
          <span class="expense-amount">{{ formatCurrency(expense) }}</span>
        </div>
        <span class="month">{{ index + 1 }}월</span>
      </div>
    </div>
  </div>
</template>

<script>
import { ref, onMounted } from 'vue'
import { getMonthlyExpenses } from '../data/db'

export default {
  setup() {
    const monthlyExpenses = ref([])
    const maxExpense = ref(0)

    onMounted(() => {
      monthlyExpenses.value = getMonthlyExpenses()
      maxExpense.value = Math.max(...monthlyExpenses.value, 1)
    })

    const getBarHeight = (expense) => {
      return `${(expense / maxExpense.value) * 100}%`
    }

    const formatCurrency = (value) => {
      return new Intl.NumberFormat('ko-KR', { style: 'currency', currency: 'KRW' }).format(value)
    }

    return {
      monthlyExpenses,
      getBarHeight,
      formatCurrency
    }
  }
}
</script>

<style scoped>
.monthly-chart {
  margin-top: 20px;
}

h3 {
  margin-bottom: 10px;
}

.chart {
  display: flex;
  justify-content: space-between;
  align-items: flex-end;
  height: 200px;
  border-bottom: 1px solid #ccc;
}

.bar-container {
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.bar {
  width: 20px;
  background-color: #3498db;
  margin: 0 2px;
  display: flex;
  flex-direction: column;
  justify-content: flex-end;
  align-items: center;
  transition: height 0.3s ease;
}

.expense-amount {
  font-size: 10px;
  color: white;
  writing-mode: vertical-rl;
  text-orientation: mixed;
  padding: 5px 0;
}

.month {
  margin-top: 5px;
  font-size: 12px;
}

@media (max-width: 600px) {
  .chart {
    height: 150px;
  }
  
  .bar {
    width: 15px;
  }
  
  .month {
    font-size: 10px;
  }

  .expense-amount {
    font-size: 8px;
  }
}
</style>