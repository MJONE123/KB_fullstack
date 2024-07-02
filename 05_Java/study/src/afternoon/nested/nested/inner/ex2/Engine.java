package afternoon.nested.nested.inner.ex2;

public class Engine {
    private InnerCar car;

    public Engine(InnerCar car) {
        this.car = car;
    }

    public void start() {
        System.out.println("자동차 주유 상태 확인" + car.getOilAmount());

        if (car.getOilAmount() > 0) {
            System.out.println(car.getModel() + "의 엔진을 구동합니다");
        }
    }
}