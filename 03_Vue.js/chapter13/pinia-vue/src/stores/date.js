import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useDateStore = defineStore('date', () => {
    // console.log('!');
    const today = new Date();
    const outputMsg = ref('');
    const dateYear = today.getFullYear();
    const dateMonth = today.getMonth() + 1;
    const dateDate = today.getDate();

    function getYear() {
        // console.log('!')
        outputMsg.value = `${dateYear}년`;
    }
    function getMonth() {
        outputMsg.value = `${dateMonth}월`;
    }
    function getDate() {
        outputMsg.value = `${dateDate}일`;
    }

    return { outputMsg, getYear, getMonth, getDate };
});
    
  