package afternoon.collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input  = "이게바로스택이다이말이야";

        char[] charArr = input.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }

        char[] reverserArr = new char[charArr.length];
        int i = 0;
        while (!stack.isEmpty()) {
            reverserArr[i++] = stack.pop();
        }

        String reverseString = new String(reverserArr);
        System.out.println(reverseString);
    }
}

