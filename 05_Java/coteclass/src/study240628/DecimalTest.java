package study240628;

public class DecimalTest {
    public static void main(String[] args) {
        Decimal decimal = new Decimal();

        // 테스트 케이스 1
        int[] nums1 = {1, 2, 3, 4};
        int result1 = decimal.solution(nums1);
        System.out.println("테스트 케이스 1 결과: " + result1);

        // 테스트 케이스 2
        int[] nums2 = {1, 2, 7, 6, 4};
        int result2 = decimal.solution(nums2);
        System.out.println("테스트 케이스 2 결과: " + result2);
    }
}
