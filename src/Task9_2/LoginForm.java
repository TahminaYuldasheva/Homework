package Task9_2;
import java.util.Scanner;

import static Task9_2.ValidateCredentials.validateCredentials;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter your login: ");
        String login = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Confirm your password: ");
        String confirmPassword = scanner.nextLine();

        if(validateCredentials(login, password, confirmPassword)){
            System.out.println("You are successfully logged.");
        } else {
            System.out.println("You haven't logged.");
        }
    }
}
