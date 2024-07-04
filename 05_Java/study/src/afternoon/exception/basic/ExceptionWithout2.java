package afternoon.exception.basic;

public class ExceptionWithout2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        if (accessArr(arr, 5)) {
            System.out.println("배열 접근이 가능합니다!");
            System.out.println("원하던 작업을 이어갑니다!");
            Object obj = null;
            if (!accessNull(obj)) {
            System.out.println("객체가null이 아닙니다");
                System.out.println("원하는 작업을 이어갑니다");
        } else {
            System.out.println("배열 접근이 불가능합니다. 에러 발생");
        }
    }
    }


    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
