package afternoon.extendss;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        gasCar.filloil();
        gasCar.move();
        gasCar.openDoor();


        electricCar.filloil();
        electricCar.openDoor();
        electricCar.move();

        hydrogenCar.filloil();
        hydrogenCar.move();
        hydrogenCar.openDoor();

    }
}
