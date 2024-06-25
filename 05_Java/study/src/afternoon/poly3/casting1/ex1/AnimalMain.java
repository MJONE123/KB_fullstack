package afternoon.poly3.casting1.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
        ((Dog)dog).sound();
        ((Cat)cat).sound();

    }
}
