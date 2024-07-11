public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        int result = fibonacci(number);
        System.out.println( number +"까지의 피보나치 수열은 :"+ result);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
