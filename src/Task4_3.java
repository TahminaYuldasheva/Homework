import java.util.Random;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size from 2 to 6:");
        int arraySize = scanner.nextInt();
        if (arraySize >= 2 && arraySize <= 6) {
            int[][] array = new int[arraySize][arraySize];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(-100, 100);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            int mainDiagonalSum = 0;
            int secondaryDiagonalSum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        mainDiagonalSum += array[i][j];
                        secondaryDiagonalSum += array[i][arraySize - 1 - i];
                    }
                }
            }
            System.out.println("Sum of main diagonal: " + mainDiagonalSum);
            System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
        } else {
            System.out.println("Invalid input. Please enter a number between 2 and 6.");

        }
        scanner.close();
    }
}
