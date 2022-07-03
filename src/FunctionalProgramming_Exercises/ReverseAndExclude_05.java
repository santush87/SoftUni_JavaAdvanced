package FunctionalProgramming_Exercises;

import java.util.*;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        String[] input = scanner.nextLine().split("\\s+");
        int numToDiv = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = input.length-1; i >=0; i--) {
            numbers.add(Integer.parseInt(input[i]));
        }

        numbers.stream()
                .filter(num -> num % numToDiv != 0)
                .forEach(num -> System.out.print(num +" "));
    }
}
