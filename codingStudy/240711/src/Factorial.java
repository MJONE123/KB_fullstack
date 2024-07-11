public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(" = Factorial result : " +result);
    }

    private static int factorial(int number) {
        if (number == 1) {
            System.out.println(number);
            return 1;
        }
        System.out.println(number + "*");
        return number * factorial(number - 1);
    }
}

