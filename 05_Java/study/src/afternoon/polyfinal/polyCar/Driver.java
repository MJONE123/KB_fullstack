package afternoon.polyfinal.polyCar;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar() {
        int input;
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져 / 3. G70) : ");
        input = scanner.nextInt();
        if (input == 1) {
            setCar(new K5Car());
        } else if (input == 2) {
            setCar(new Grand());
        } else if(input == 3) {
            setCar(new G70());
        }
        drive();
    }

    public void drive() {
        car.drive();
    }

}
