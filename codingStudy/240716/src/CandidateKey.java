import java.util.*;

public class CandidateKey {
    // 후보 키를 저장하기 위한 변수
    static boolean[] result;
    // 테이블의 열 수와 행 수를 저장하는 변수
    static int col;
    static int row;
    // 후보 키의 개수를 저장하는 변수
    static int answer = 0;
    // 입력받은 테이블을 복사해서 저장하는 변수
    static String[][] relationCopy;
    // 이전에 찾은 후보 키의 열 조합을 저장하는 리스트
    static ArrayList<HashSet<Integer>> prevCandidateCols = new ArrayList<>();

    public int solution(String[][] relation) {
        // 테이블의 열 수와 행 수를 설정
        col = relation[0].length;
        row = relation.length;
        // 후보 키를 찾기 위한 boolean 배열 초기화
        result = new boolean[col];
        // 입력받은 테이블을 복사
        relationCopy = relation;

        // 열의 부분집합을 구해 후보 키가 될 수 있는지 검사
        subset(0);

        // 후보 키의 개수를 반환
        return answer;
    }

    // 열의 모든 부분집합을 구하는 메소드
    public static void subset(int idx) {
        // 모든 열에 대해 부분집합을 생성한 경우
        if (idx >= col) {
            // 현재 열 조합이 후보 키인지 검사
            if (isCandidate()) {
                answer++;
            }
            return;
        }

        // 현재 열을 포함하지 않는 경우
        result[idx] = false;
        subset(idx + 1);
        // 현재 열을 포함하는 경우
        result[idx] = true;
        subset(idx + 1);
    }

    // 현재 열 조합이 후보 키가 될 수 있는지 검사하는 메소드
    public static boolean isCandidate() {
        // 중복을 검사하기 위해 문자열을 저장하는 HashSet
        HashSet<String> tupleStr = new HashSet<>();

        // 각 행에 대해 열 조합에 따라 문자열을 합침
        for (int i = 0; i < row; i++) {
            String temp = "";
            for (int j = 0; j < col; j++) {
                if (!result[j]) continue; // 현재 열 조합에 포함되지 않는 열은 건너뜀
                temp += relationCopy[i][j];
            }
            tupleStr.add(temp); // 합쳐진 문자열을 HashSet에 추가
        }

        // 중복된 값이 없는지 확인
        if (tupleStr.size() == row) {
            // 최소성을 만족하는지 확인
            if (isMinimal()) {
                return true;
            }
        }

        return false;
    }

    // 현재 열 조합이 최소성을 만족하는지 검사하는 메소드
    public static boolean isMinimal() {
        // 현재 열 조합을 저장하는 HashSet
        HashSet<Integer> nowCols = new HashSet<>();
        for (int i = 0; i < col; i++) {
            if (result[i]) nowCols.add(i); // result 배열에서 true인 열을 HashSet에 추가
        }

        // 현재 열 조합이 이전 후보 키 조합을 포함하고 있는지 확인
        for (HashSet<Integer> set : prevCandidateCols) {
            if (nowCols.containsAll(set)) {
                return false; // 포함하고 있다면 최소성을 만족하지 않음
            }
        }

        // 현재 열 조합을 이전 후보 키 조합 리스트에 추가
        prevCandidateCols.add(new HashSet<>(nowCols));
        return true; // 최소성을 만족
    }
}
