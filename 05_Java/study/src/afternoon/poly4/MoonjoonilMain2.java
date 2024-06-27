package afternoon.poly4;

public class MoonjoonilMain2 {
    public static void main(String[] args) {
        Animal animals[] = {new Dog(), new Moonjoonil()};
        for (Animal animal : animals) {
            animalDo(animal);
        }
    }

    private static void animalDo(Animal animal) {
        if(animal instanceof Animal) {
            System.out.println("동물 기능 테스트");
            animal.eat();
            animal.sleep();
            System.out.println("동물 기능 테스트 종료!\n");
        }

        if(animal instanceof Human) {
            System.out.println("사람 기능 테스트");
            ((Human) animal).think();
            System.out.println("사람 기능 테스트 종료!\n");
        }
    }

    public static void dogDo(Dog dog){
        System.out.println("동물 기능 테스트");
        dog.eat();
        dog.sleep();
        System.out.println("동물 기능 테스트 종료!\n");
    }

    public static void moonjoonilDo(Moonjoonil moonjoonil){
        System.out.println("동물 기능 테스트");
        moonjoonil.eat();
        moonjoonil.sleep();
        System.out.println("동물 기능 테스트 종료!\n");
        System.out.println("사람 기능 테스트");
        moonjoonil.think();
        System.out.println("사람 기능 테스트 종료!\n");
    }
}