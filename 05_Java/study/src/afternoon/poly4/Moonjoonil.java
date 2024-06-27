package afternoon.poly4;

public class Moonjoonil implements Animal,Human{
    @Override
    public void eat() {
        System.out.println("문준일이 사료를 먹습니다");
    }
    public void sleep() {
        System.out.println("문준일이 수업시간에 꾸벅꾸벅 졸고 있습니다");
    }
    public void think() {
        System.out.println("문준일이 웬일로 생각이라는걸 합니다");
    }
}
