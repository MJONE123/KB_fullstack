package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);

        switch (sex) {
            case '1':
                System.out.println("남자입니다");
                break;
            case '2':
                System.out.println("여자입니다");
        }
    }
}
