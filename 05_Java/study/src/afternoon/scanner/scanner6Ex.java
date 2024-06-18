package afternoon.scanner;

import java.util.Scanner;

public class scanner6Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ranNum = (int) (Math.random() * 100);

        while (true) {
            System.out.println("랜덤 숫자를 입력하세요 : ");
            int inputRanNum = scanner.nextInt();

            if (inputRanNum == ranNum) {
                System.out.println("정답입니다! 랜덤 숫자는 : " + ranNum);
                break;
            } else if (inputRanNum < ranNum) {
                System.out.println("Up");
            } else {
                System.out.println("Down");
            }
        }
    }
}

