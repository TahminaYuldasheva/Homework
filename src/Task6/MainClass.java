package Task6;

import java.util.Scanner;
import Task6.ClassWithMethods;



public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial sum for the first card:");
        double initialSum1 = scanner.nextDouble();
        CreditCard card1 = new CreditCard(initialSum1, "123-456");

        System.out.println("Enter initial sum for the second card:");
        double initialSum2 = scanner.nextDouble();
        CreditCard card2 = new CreditCard(initialSum2, "223-456");

        System.out.println("Enter initial sum for the third card:");
        double initialSum3 = scanner.nextDouble();
        CreditCard card3 = new CreditCard(initialSum3, "323-456");


        card1.addMoney(15.50);
        card2.addMoney(16.70);
        card3.withdrawMoney(10);

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();

        scanner.close();

    }
}
