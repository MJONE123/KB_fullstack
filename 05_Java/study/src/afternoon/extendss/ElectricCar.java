package afternoon.extendss;

public class ElectricCar extends Car{
    @Override
    public void move() {
        System.out.println("기름차가 이동합니다!");

    }

    public void openDoor() {
        System.out.println("전기차 문을 엽니다!");
    }

    @Override
    public void filloil() {
        System.out.println("기름을 주유합니다!");
    }
}


