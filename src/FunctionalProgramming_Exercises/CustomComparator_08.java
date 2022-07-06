package FunctionalProgramming_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbersOdd = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 2 == 0) {
                numbers.add(num);
            } else {
                numbersOdd.add(num);
            }
        }
        numbersOdd.stream()
                .sorted()
                .collect(Collectors.toList());
        numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        numbers.addAll(numbersOdd);
        numbers.forEach(num -> System.out.print(num +" "));
    }
}
