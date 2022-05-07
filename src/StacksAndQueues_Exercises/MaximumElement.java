package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stackNums = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);
            switch (command) {
                case 1:
                    stackNums.push(Integer.parseInt(input[1]));
                    break;
                case 2:
                    if (!stackNums.isEmpty()){
                        stackNums.pop();
                    }
                    break;
                case 3:
                    if (!stackNums.isEmpty()){
                        System.out.println(Collections.max(stackNums));
                    }
                    break;
            }
        }
    }
}
