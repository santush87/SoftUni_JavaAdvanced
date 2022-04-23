package Stacks_and_Queues__Lab;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();
        kids.addAll(List.of(input));

        int arrDeqLength = kids.size();

        while (kids.size() > 1){
            if (num == 1){
                for (int i = 1; i < arrDeqLength; i++) {
                    String first = kids.pop();
                    System.out.printf("Removed %s%n", first);
                }
            } else {
                for (int i = 0; i < num; i++) {
                    if (i == num -1){
                        String first = kids.pop();
                        System.out.printf("Removed %s%n", first);
                    } else {
                        String first = kids.pop();
                        kids.offer(first);
                    }
                }
            }
        }
        System.out.printf("Last is %s", kids.peek());
    }
}
