package afternoon.lang.object;

import java.sql.SQLOutput;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("문준일", "MJONE");
        User user2 = new User("문준일", "MJONE");

        //당연히 주소가 다르므로 fasle
        System.out.println(user1 == user2);
        // equals를 하더라도 overriding을 안했으므로 false
        //User에 Overriding을 하니 비로소 true
        System.out.println(user1.equals(user2));


    }
}
