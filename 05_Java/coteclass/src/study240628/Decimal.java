package study240628;
import java.util.*;

class Decimal {
    public int solution(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            //i,j,k 완전 탐색 (하나씩 다 더해보는 것)
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        counter++;
                    }
                }
            }
        }




        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return counter;
    }

    private boolean isPrime(int num) {
        for (int i = 2 ; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

