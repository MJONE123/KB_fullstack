package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(10)+1;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++){
            boolean isContained = set.add(arr[i]);
            if(!isContained){
                System.out.println(arr[i] + "는 중복이다!");
            } else{
                System.out.println(arr[i] + "는 중복이 아니다!");
            }
        }
    }
}