package Stacks_and_Queues__Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> box = new ArrayDeque<>();

        if (num == 0) {
            System.out.println(0);
        } else {
            while (num > 0){
                if (num % 2 == 0){
                    box.push(0);
                } else {
                    box.push(1);
                }
                num /= 2;
            }
        }

        for (Integer integer : box) {
            System.out.print(integer);
        }
    }
}
