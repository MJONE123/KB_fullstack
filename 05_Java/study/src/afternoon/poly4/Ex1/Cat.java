package afternoon.poly4.Ex1;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("야옹이가 사료를 먹습니다");
    }
    @Override
    public void sound() {
        System.out.println("야옹이가 야옹");
    }
}

