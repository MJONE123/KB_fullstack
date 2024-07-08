package afternoon.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObj(10);
        Integer integer = (Integer) integerBox.getObj();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setObj(10); // "hello" 문자열을 직접 저장
        String str = (String) stringBox.getObj();
        System.out.println("str = " + str);

    }
}