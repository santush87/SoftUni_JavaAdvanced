package SetsAndMapsAdvanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> contacts = new LinkedHashMap<>();

        while (!input.equals("search")){
            String[] inputArr = input.split("-");
            contacts.put(inputArr[0], inputArr[1]);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")){
            if (contacts.containsKey(name)){
                System.out.printf("%s -> %s%n", name, contacts.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
