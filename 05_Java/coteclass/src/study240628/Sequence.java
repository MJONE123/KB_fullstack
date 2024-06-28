package study240628;

public class Sequence {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,1000000};
        int start = 0;
        int total = 0;
        int end = 0;

        for (end = 0; end < sequence.length; end++) {
            total += sequence[end];

            while (total >= k) {
                total -= sequence[end];
                start++;
            }

            if (total == k) {
                if((end - start) < (answer[1] - answer[0])) {
                    answer[0] = start;
                    answer[1] = end;
                }
            }
            return answer;
        }



        return answer;
    }
}
