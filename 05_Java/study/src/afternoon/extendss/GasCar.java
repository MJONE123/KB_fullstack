package afternoon.extendss;

public class GasCar extends Car {
    @Override
    public void move() {
        System.out.println("기름차가 이동합니다");
    }
    @Override
    public void openDoor() {
        System.out.println("기름차 문을 엽니다!");
    }

    @Override
    public void filloil() {
        System.out.println("기름차를 주유 합니다");
    }
}
