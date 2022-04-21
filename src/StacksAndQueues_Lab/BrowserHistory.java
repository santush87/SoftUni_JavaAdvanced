package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> box = new ArrayDeque<>();

        while (!input.equals("Home")){
            if (input.equals("back")){
                if (box.size() < 2){
                    System.out.println("no previous URLs");
                } else {
                    box.pop();
                    String currUrl = box.peek();
                    System.out.println(currUrl);
                }
            }else {
                box.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }
    }
}
