import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> Q = new LinkedList<>();

        //1. 1부터 N까지를 Q에 더해봅시다 - add, offer
        for(int i=1; i<=N; i++){
            Q.offer(i);
//            System.out.println(Q.size());
        }

        //2. 값을 조회하여봅시다 - element, peek, contains, size
//        System.out.println(Q.peek());
//        System.out.println(Q.element());
//        System.out.println(Q.contains(3));
//        System.out.println(Q.size());


        //3. 값을 삭제하여봅시다 - remove, poll, clear
        System.out.println(Q.remove()); // 맨앞의값을 삭제 반환
        System.out.println(Q.peek()); //맨앞의 값을 확인
        System.out.println(Q.poll()); // 맨앞의 값을 제거하고 가져오기
        System.out.println(Q.poll()); // 위와 동일
        System.out.println(Q.peek()); // 큐가 비어있을 시 null 값 반환
        Q.clear(); // 초기화
        System.out.println(Q.peek()); // 큐가 비어있을 시 null 값 반환
//        System.out.println(Q.element()); // 에러 발생되야함

        //4. 값이 비어있는지 확인하여봅시다
        System.out.println(Q.isEmpty());
        Q.add(1);
        System.out.println(Q.isEmpty());

        br.close();
    }
}