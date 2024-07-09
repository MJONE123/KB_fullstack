package afternoon.collection.map;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("애플", 100000);
        hashMap.put("버내너", 2000);
        hashMap.put("틈메이러", 500);
        hashMap.put("워러멜론", 100000);
        System.out.println("hashMap = " + hashMap);

        // 키 존재 확인
//        boolean hasBanana = hashMap.containsKey("버내너");
//        System.out.println("버내너 존재 여부 확인 : " + hasValue(20000));



        int removedValue = hashMap.remove("수박");
        System.out.println("hashMap = " + hashMap);


    }
}
