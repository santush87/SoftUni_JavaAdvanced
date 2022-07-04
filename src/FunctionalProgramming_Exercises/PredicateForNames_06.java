package FunctionalProgramming_Exercises;

import java.util.List;
import java.util.Scanner;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        int theLength = Integer.parseInt(scanner.nextLine());
        List<String> names = List.of(scanner.nextLine().split("\\s+"));

        names.stream()
                .filter(name -> name.length() <= theLength)
                .forEach(System.out::println);
    }
}
