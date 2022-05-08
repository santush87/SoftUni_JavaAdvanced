package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> fibo = new ArrayDeque<>();
        int num = Integer.parseInt(scanner.nextLine());
        fibo.push(1);
        fibo.push(1);

        if (num == 0 || num == 1) {
            System.out.println(1);
        }
        if (2 <= num && num <= 49) {
            for (int i = 2; i <= num; i++) {
                int sec = fibo.pop();
                int first = fibo.pop();
                fibo.push(sec);
                fibo.push(sec + first);
            }
            System.out.println(fibo.peek());
        }
    }
}
