package hashMap;
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
    Map<String, Object> map = new HashMap<>();
    for (int i = 0; i < phone_book.length; i++) {
        map.put(phone_book[i],i);
    }
    for (int i = 0; i < phone_book.length; i++) {
        for (int j = i + 1; j < phone_book.length; j++) {
            if (phone_book[i].equals(phone_book[j])) {
                return false;
            }

        }
    }
        return true;
    }
}