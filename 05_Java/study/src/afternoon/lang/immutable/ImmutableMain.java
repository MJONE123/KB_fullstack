package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("준일");
        ImmutableUser user2 = user1;

        System.out.println("User1 = " + user1);
        System.out.println("User2 = " + user2);


//        아래와 같이 하면 user2도 준일로 나옴
//        user1.setName("시완");
        user2 = user1.setName("시완");
        System.out.println("User2의 이름을 '시완'으로 변경");
        System.out.println("User1 = " + user1);
        System.out.println("User2 = " + user2);


    }
}
