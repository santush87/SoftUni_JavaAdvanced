package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stackNumbers.push(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            if (!stackNumbers.isEmpty()) stackNumbers.pop();
        }

        if (stackNumbers.isEmpty()){
            System.out.println(0);
        } else {
            if (stackNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stackNumbers));
            }
        }
    }
}
