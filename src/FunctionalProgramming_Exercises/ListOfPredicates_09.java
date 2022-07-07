package FunctionalProgramming_Exercises;

import java.util.Scanner;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        int number = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");
        int[] toDev = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            toDev[i] = Integer.parseInt(input[i]);
        }

        for (int i = 1; i <= number; i++) {
            boolean isDiv = false;
            for (int j = 0; j < toDev.length; j++) {
                if (i % toDev[j] == 0){
                    isDiv = true;
                } else {
                    isDiv = false;
                    break;
                }
            }
            if (isDiv){
                System.out.print(i + " ");
            }
        }
    }
}
