package afternoon.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scanner3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번재 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("두번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int a = num1 - num2;
        System.out.println("두 수의 차는 : " + a);

        int multiple = num1 * num2;
        System.out.println("두 수의 곱은 : " + multiple);
    }
}
