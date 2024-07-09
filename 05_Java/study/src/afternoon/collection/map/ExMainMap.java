package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMainMap {
    public static void main(String[] args) {
        int[] arr = new int[10];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<10; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(10)+1;
            map.put(i+1,0);
        }

        for(int i=0; i<10; i++){
            map.put(arr[i], map.get(arr[i])+1);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key) + "번");
        }
    }
}
