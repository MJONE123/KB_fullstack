package afternoon.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer integer = GenericMethod.<Integer>genericMethod(10);

        // numberMethod는 정의되어 있지 않으므로 genericMethod를 사용합니다.
        Integer integer2 = GenericMethod.<Integer>genericMethod(10);
        System.out.println(integer);
        System.out.println(integer2);
    }
}
