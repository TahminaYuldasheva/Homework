import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows (m >= 3): ");
        int m = scanner.nextInt();
        System.out.println("Please enter the number of columns (n >= 3: ");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        Random random = new Random();

        if (m <=3 && n <= 3) {
            System.out.println("Invalid input. Both dimensions must be >= 3.");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 100);
            }
        }
        System.out.println("Array before sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println();
        System.out.println("Array after sorting each row:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        scanner.close();
    }
}


