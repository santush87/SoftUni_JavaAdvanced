package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queueNumbers.offer(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            if (!queueNumbers.isEmpty()) queueNumbers.poll();
        }

        if (queueNumbers.isEmpty()){
            System.out.println(0);
        } else {
            if (queueNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queueNumbers));
            }
        }
    }
}
