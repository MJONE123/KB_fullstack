package afternoon.extendss;

public class HydrogenCar extends Car {

    @Override
    public void move() {
        System.out.println("수소차가 이동합니다");
    }

    @Override
    public void filloil() {
        System.out.println("수소를 충전 ㅃㄹㅃㄹㅃ");
    }

    @Override
    public void openDoor() {
        System.out.println("수소차의 문을 엽니다");
    }
}
