package Stacks_and_Queues__Lab;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> box = new ArrayDeque();

        box.addAll(List.of(input));

        while (box.size() > 2) {
            int result = 0;
            int first = Integer.parseInt(box.pop());
            String sign = box.pop();
            int second = Integer.parseInt(box.pop());
            if (sign.equals("-")){
                result = first - second;
                box.push(String.valueOf(result));
            }else {
                result = first + second;
                box.push(String.valueOf(result));
            }
        }
        System.out.println(box.peek());
    }
}
