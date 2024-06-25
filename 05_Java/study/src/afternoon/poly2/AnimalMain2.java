package afternoon.poly2;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Donkey(), new Chicken()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }

}


