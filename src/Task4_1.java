import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to increment each element in the array:");
        int number = scanner.nextInt();

        int[][][] array = new int[2][3][2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(-100, 100);

                }
            }
        }
        System.out.println("Array before incrementing:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(Arrays.toString(array[i][j]));
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        System.out.println("Array after incrementing:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(Arrays.toString(array[i][j]));
            }

        }
        scanner.close();
    }
}

