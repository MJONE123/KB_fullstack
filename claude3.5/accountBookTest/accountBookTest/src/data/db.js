// src/data/db.js

export const db = {
  balance: 1000000,
  transactions: [
    { id: 1, date: '2024-01-15', amount: 50000, type: 'income', category: '급여' },
    { id: 2, date: '2024-01-20', amount: -30000, type: 'expense', category: '식비' },
    { id: 3, date: '2024-02-01', amount: -20000, type: 'expense', category: '교통비' },
    { id: 4, date: '2024-02-15', amount: 60000, type: 'income', category: '부수입' },
    { id: 5, date: '2024-03-10', amount: -40000, type: 'expense', category: '쇼핑' },
    { id: 6, date: '2024-04-05', amount: -25000, type: 'expense', category: '의료비' },
    // 더 많은 거래 내역을 추가할 수 있습니다.
  ]
}

export function getMonthlyExpenses() {
  const monthlyExpenses = Array(12).fill(0);
  db.transactions.forEach(transaction => {
    if (transaction.type === 'expense') {
      const month = new Date(transaction.date).getMonth();
      monthlyExpenses[month] += Math.abs(transaction.amount); // 절대값 사용
    }
  });
  return monthlyExpenses;
}

export function getYearlyBalance() {
  return db.transactions.reduce((acc, transaction) => {
    return transaction.type === 'income' ? acc + transaction.amount : acc - Math.abs(transaction.amount);
  }, 0);
}