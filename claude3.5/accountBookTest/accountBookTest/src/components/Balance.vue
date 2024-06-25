<template>
  <div class="balance">
    <h2>24년 자산 현황</h2>
    <p class="total">{{ totalBalance }}원</p>
    <div class="details">
      <div class="income">
        <span>수입</span>
        <span class="amount positive">{{ income }}원</span>
      </div>
      <div class="expense">
        <span>지출</span>
        <span class="amount negative">{{ expense }}원</span>
      </div>
    </div>
    <div class="year-selector">
      <label for="year">연간내역</label>
      <select id="year" v-model="selectedYear">
        <option value="2024">2024</option>
      </select>
    </div>
  </div>
</template>

<script>
import { ref, computed } from 'vue'
import { db, getYearlyBalance } from '../data/db'

export default {
  setup() {
    const selectedYear = ref('2024')
    const totalBalance = computed(() => db.balance + getYearlyBalance())
    const income = computed(() => 
      db.transactions.filter(t => t.type === 'income').reduce((sum, t) => sum + t.amount, 0)
    )
    const expense = computed(() => 
      db.transactions.filter(t => t.type === 'expense').reduce((sum, t) => sum + Math.abs(t.amount), 0)
    )

    return {
      selectedYear,
      totalBalance,
      income,
      expense
    }
  }
}
</script>

<style scoped>
.balance {
  background-color: #f9f9f9;
  padding: 20px;
  border-radius: 8px;
  margin-bottom: 20px;
}

h2 {
  margin-top: 0;
  color: #333;
}

.total {
  font-size: 24px;
  font-weight: bold;
  margin: 10px 0;
}

.details {
  display: flex;
  justify-content: space-between;
  margin-bottom: 20px;
}

.income, .expense {
  flex: 1;
  text-align: center;
}

.amount {
  display: block;
  font-weight: bold;
}

.positive {
  color: green;
}

.negative {
  color: red;
}

.year-selector {
  margin-bottom: 10px;
}

.no-data {
  text-align: center;
  color: #888;
}

@media (max-width: 400px) {
  .details {
    flex-direction: column;
  }
  
  .income, .expense {
    margin-bottom: 10px;
  }
}</style>