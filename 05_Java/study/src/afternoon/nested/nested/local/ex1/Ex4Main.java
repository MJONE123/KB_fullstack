package afternoon.nested.nested.local.ex1;

import java.util.Random;

public class Ex4Main {
    public static void complicatedProgram(Dice dice) {
        dice.run();

        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        // 여기서 원하는 프로그램 실행
        dice.run();

        System.out.println("복잡한 과정 다시 시작");
        System.out.println("복잡한 과정 종료 후, 프로그램 종료");
    }

    public static void main(String[] args) {
        complicatedProgram(new DiceOnce());
        complicatedProgram(new DiceSum());
    }

    static class DiceOnce implements Dice {
        @Override
        public void run() {
            int rand = new Random().nextInt(6) + 1;
            System.out.println("주사위의 값은 : " + rand);
        }
    }

    static class DiceSum implements Dice {
        @Override
        public void run() {
            int rand1 = new Random().nextInt(6) + 1;
            int rand2 = new Random().nextInt(6) + 1;
            int sum = rand1 + rand2;
            System.out.println("두 주사위의 합은 : " + sum);
        }
    }
}
