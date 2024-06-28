package study240628;
import java.util.*;

public class CompletedPlayerAnswer {
    public String solution(String[] participant, String[] completion) {
        // 배열을 정렬하여 비교를 용이하게 함
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        //completion 배열의 길이만큼 반복
        for (i = 0; i < completion.length; i++) {
            //정렬된 배열애서 같은 인덱스의 요소를 비교
            if (!participant[i].equals(completion[i])) {
                //불일치하는 첫 번째 요소를 찾으면 해당 참가자 반환
                return participant[i];
            }
        }
        //모든 요소가 일치한다면, 마지막 참가자가 원주하지 못한 선수
        return participant[i];
    }
}
