package SetsAndMapsAdvanced_Exercises;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            String[] chemicalsArr = scanner.nextLine().split("\\s+");
            chemicals.addAll(List.of(chemicalsArr));
        }

        for (String chemical : chemicals) {
            System.out.print(chemical + " ");
        }
    }
}
