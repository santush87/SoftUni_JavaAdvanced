package Stacks_and_Queues__Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> box = new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (box.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    String text = box.poll();
                    System.out.printf("Canceled %s%n", text);
                }
            }else {
                box.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String s : box) {
            System.out.println(s);
        }
    }
}
