package SetsAndMapsAdvanced_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (symbols.containsKey(ch)){
                symbols.put(ch, symbols.get(ch)+1);
            } else {
                symbols.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> chars : symbols.entrySet()) {
            System.out.printf("%s: %d time/s%n", chars.getKey(), chars.getValue());
        }
    }
}
