package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null); // 오류가 발생. null을 쓰면 안됨.
            printLength("ThisIsJava");
            printLength(null);//null을 printLength 하여 에러 유발
        System.out.println("[프로그램 종료]");
    }
}


