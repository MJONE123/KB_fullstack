package study240705;
import java.util.*;
        import java.util.stream.*;

class Stack {
    public int solution(String s) {
        int result = s.length(); // 초기 결과값은 문자열의 길이로 설정

        // 문자열 길이의 절반까지 가능한 압축 단위(l)를 반복
        for (int l = 1; l <= s.length() / 2; l++) {
            // 현재 압축 단위에 따라 문자열을 나눈다.
            List<String> words = new ArrayList<>();
            for (int i = 0; i < s.length(); i += l) {
                words.add(s.substring(i, Math.min(s.length(), i + l))); // i부터 i+l까지 문자열을 잘라서 리스트에 추가
            }

            Deque<Entry> stack = new ArrayDeque<>(); // 스택을 사용하여 중복된 부분 문자열을 관리
            stack.push(new Entry(words.get(0), 1)); // 첫 부분 문자열을 스택에 추가

            // 나눠진 부분 문자열을 순회
            for (String word : words.subList(1, words.size())) {
                if (stack.peek().word.equals(word)) {
                    // 만약 스택의 top과 현재 부분 문자열이 같다면, top의 중복 개수를 1 증가시킨다.
                    Entry top = stack.pop();
                    stack.push(new Entry(top.word, top.count + 1));
                } else {
                    // 만약 다르다면, 현재 부분 문자열과 중복 개수 1을 스택에 push한다.
                    stack.push(new Entry(word, 1));
                }
            }

            // 압축 문자열을 만든다.
            String compressed = stack.stream()
                    .map(Entry::toString)
                    .collect(Collectors.joining());

            // 최소 길이를 업데이트한다.
            result = Math.min(result, compressed.length());
        }

        // 가장 짧은 압축 문자열의 길이를 반환한다.
        return result;
    }

    // Entry 클래스: 부분 문자열과 중복 개수를 저장
    static class Entry {
        String word;
        int count;

        public Entry(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public String toString() {
            // 중복 개수가 1보다 크면, 중복 개수와 부분 문자열을 압축 문자열에 이어 붙인다.
            return (count == 1) ? word : count + word;
        }
    }
}
