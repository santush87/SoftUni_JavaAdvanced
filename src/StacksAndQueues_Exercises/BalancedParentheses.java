package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> box = new ArrayDeque<>();
        boolean isBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                box.push(ch);
            }else if (box.isEmpty()){
                isBalanced = false;
                break;
            }else if (ch == ')') {
                if (box.pop() == '(') {
                    isBalanced = true;
                }
            } else if (ch == ']') {
                if (box.pop() == ']') {
                    isBalanced = true;
                }
            } else if (ch == '}') {
                if (box.pop() == '}') {
                    isBalanced = true;
                }
            } else {
                isBalanced = false;
                break;
            }

        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
