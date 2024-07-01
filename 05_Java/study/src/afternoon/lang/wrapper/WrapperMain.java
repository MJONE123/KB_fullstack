package afternoon.lang.wrapper;

public class WrapperMain {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        //사실 아래처럼 쓰면됨. 그냥 알고만 있자
        Integer b = 20;

        //long 타입 오랜만에 보네
        Long c = 100L;

        Double d = 7.23;

        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
