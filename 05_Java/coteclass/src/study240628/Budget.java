package study240628;

import java.util.Arrays;

class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;

        for (int price : d) {
            budget-= price;
            if (budget < 0) break;
            result ++;
        }


        return result;
    }
}