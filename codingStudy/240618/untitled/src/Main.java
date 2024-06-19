//import javax.management.openmbean.SimpleType;
//import java.util.Scanner;
//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args)  {
//        Scanner scan = new Scanner(System.in);
//
//        var N = scan.nextInt();
//        int[] arr = new int[N];
//        for(int i=0; i<arr.length; i++)
//            arr[i] = scan.nextInt();
//
//        int count = 1;
//        int maxHeight = arr[arr.length-1];
//
//        for(int i=arr.length-2; i>=0; i--)
//            arr[i] = Math.max(arr[i], maxHeight);
//    }
//
//}

import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int b = Integer.parseInt(st.nextToken());
                stack.push(b);
            } else if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }

            } else if (s.equals("top")) {
                System.out.println(stack.peek());
            }
        }
    }
}