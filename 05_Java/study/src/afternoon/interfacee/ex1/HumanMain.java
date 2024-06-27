package afternoon.interfacee.ex1;

public class HumanMain {
    public static void main(String[] args) {
        Human[] human = {new Korean(), new American(), new Spanish()};

        for (Human h : human) {
            humanCall(h);
        }

    }

    public static void humanCall(Human human) {
        human.eat();
        human.hello();
        human.speak();
    }
}
