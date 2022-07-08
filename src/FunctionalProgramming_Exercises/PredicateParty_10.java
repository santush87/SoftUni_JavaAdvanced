package FunctionalProgramming_Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateParty_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        List<String> names = List.of(scanner.nextLine().split("\\s+"));

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String command = input.split("\\s+")[0];
            String startOtEndWith = input.split("\\s+")[1];
            String lettersToSearch = input.split("\\s+")[2];
            switch (command) {
                case "Remove":
                    switch (startOtEndWith) {
                        case "StartsWith":
                            names = names.stream()
                                    .filter(name -> !name.startsWith(lettersToSearch))
                                    .collect(Collectors.toList());
                            break;
                        case "EndsWith":
                            names = names.stream()
                                    .filter(name -> name.endsWith(lettersToSearch))
                                    .collect(Collectors.toList());
                            break;
                        case "Length":
                            int lettLength = Integer.parseInt(lettersToSearch);
                            names = names.stream()
                                    .filter(name -> name.length() != lettLength)
                                    .collect(Collectors.toList());
                            break;

                    }
                    break;
                case "Double":
                    List<String> forDoubling = new ArrayList<>();
                    switch (startOtEndWith) {
                        case "StartsWith":
                            forDoubling = names.stream()
                                    .filter(name -> name.startsWith(lettersToSearch))
                                    .collect(Collectors.toList());
                            names = Stream.concat(names.stream(), forDoubling.stream()).collect(Collectors.toList());
                            break;
                        case "EndsWith":
                            forDoubling = names.stream()
                                    .filter(name -> name.endsWith(lettersToSearch))
                                    .collect(Collectors.toList());
                            names = Stream.concat(names.stream(), forDoubling.stream()).collect(Collectors.toList());
                            break;
                        case "Length":
                            int lettLength = Integer.parseInt(lettersToSearch);
                            forDoubling = names.stream()
                                    .filter(name -> name.length() == lettLength)
                                    .collect(Collectors.toList());
                            names = Stream.concat(names.stream(), forDoubling.stream()).collect(Collectors.toList());
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            names = names.stream()
                    .sorted((left, right) -> left.compareTo(right))
                    .collect(Collectors.toList());
                System.out.print(String.join(", ", names));
                System.out.println(" are going to the party!");

        }
    }
}
