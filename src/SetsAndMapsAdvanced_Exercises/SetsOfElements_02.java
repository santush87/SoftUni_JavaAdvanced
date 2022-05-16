package SetsAndMapsAdvanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int sec = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secSet = new LinkedHashSet<>();
        for (int i = 0; i < first; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < sec; i++) {
            secSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.retainAll(secSet);
        for (Integer integer : firstSet) {
            System.out.print(integer + " ");
        }
    }
}
