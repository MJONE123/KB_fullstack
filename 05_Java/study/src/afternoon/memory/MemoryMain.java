package afternoon.memory;

import java.sql.SQLOutput;

public class MemoryMain {
    public static void main(String[] args) {
        System.out.println("메인 메서드 시작");
        method1();
        System.out.println("메인 메서드 종료");

    }

    static void method1() {
        System.out.println("메서드1 시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("메서드1 종료");
    }

    static void method2(Data data) {
        System.out.println("메서드2 시작");
        System.out.println("매개변수 data의 value값은 :" + data.getValue());
        System.out.println("메서드2 수행 종료");
    }


}
