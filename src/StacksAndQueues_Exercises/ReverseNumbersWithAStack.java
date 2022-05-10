package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String num : numbers){
            stack.push(num);
        }

        for (String s : stack) {
            System.out.print(s + " ");
        }
    }
}
