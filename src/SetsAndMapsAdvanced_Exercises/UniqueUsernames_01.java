package SetsAndMapsAdvanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            names.add(scanner.nextLine());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
