package afternoon.interfacee.ex1;

public class American implements Human{
    @Override
    public void speak() {
        System.out.println("hello");
    };

    @Override
    public void eat() {
        System.out.println("미국인은 햄버거를 먹습니다");
    };

    @Override
    public void hello() {
        System.out.println("hello. lt is currently the year"+ year);
    };

}
