package queue;

import java.io.*;
import java.util.*;


public class Baekjoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> Cake = new LinkedList<>();
        for(int i=1; i<=N; i++){
            Cake.add(i);
        }

        int count =1;
        while(!Cake.isEmpty()) {
            int piece = Cake.poll();
            if (count == K) {
                System.out.println(piece + "번째 냠냠");
                count = 1;
            }
            else{
                count++;
                Cake.add(piece);
            }
        }
        System.out.println("배부르다!");
        br.close();
    }
}