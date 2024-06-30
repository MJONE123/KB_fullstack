package afternoon.polyfinal.polyCar;

public class G70 implements Car {
    @Override
    public void openDoor() {
        System.out.println("G70, 차 문을 엽니다");
    }

    @Override
    public void drive() {
        System.out.println("G70가 주행을 시작합니다");
        System.out.println("G70 주행 종료");
    }
}
