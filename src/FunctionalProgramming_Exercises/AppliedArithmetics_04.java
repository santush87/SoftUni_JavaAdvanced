package FunctionalProgramming_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
//        Function<List<Integer>, Integer> adding = num -> num++;

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = numbers.stream()
                            .map(num -> num + 1)
                            .collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream()
                            .map(num -> num * 2)
                            .collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream()
                            .map(num -> num - 1)
                            .collect(Collectors.toList());
                    break;
                case "print":
                    numbers.stream()
                            .forEach(num -> System.out.print(num + " "));
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
