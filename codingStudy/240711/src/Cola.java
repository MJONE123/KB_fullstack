public class Cola {
    public int solution(int a, int b, int n) {
        return calculateCola(a, b, n, 0);
    }
//    a = 가져갈 빈 병 b = 받은 빈 병
    private int calculateCola(int a, int b, int n, int totalBottles) {

        // 현재 가진 빈 병 수가 교환할 수 있는 최소 병 수 a보다 작을 경우, 누적된 콜라 병 수 반환
        if (n < a) return totalBottles;
        // 현재 가진 빈 병으로 받을 수 있는 새 콜라 병 수 계산 (newCola)
        int newCola = (n / a) * b;
        // 현재 가진 빈 병으로 받을 수 있는 새 콜라 병 수 계산 (remainingBottles)
        int remainingBottles = (n % a) + newCola;

        // 재귀 호출하여 남은 빈 병으로 추가로 받을 콜라 병 수를 누적하여 반환
        return calculateCola(a,b,remainingBottles, totalBottles + newCola);
    }
}