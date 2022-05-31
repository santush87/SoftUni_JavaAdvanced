package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[num][num];

        for (int row = 0; row < num; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = input;
        }
        int primariSum = 0;
        for (int row = 0; row < num; row++) {
            primariSum += matrix[row][row];
        }

        int secSum = 0;
        int cols = 0;
        for (int row = num - 1; row >= 0; row--) {
            secSum += matrix[row][cols];
            cols++;

        }
        System.out.println(Math.abs(secSum - primariSum));
    }
}
