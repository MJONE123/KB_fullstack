package afternoon.lang.wrapper;

public class CompareMain {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf(2);

        //숫자면 equals가 아니라 compareTo
//        System.out.println(a.compareTo(b));

        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(7.23);

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
        System.out.println(long1.longValue());
        System.out.println(double1.doubleValue());
    }
}

