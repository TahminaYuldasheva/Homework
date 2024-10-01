package Task9_2;

public class ValidateCredentials {
    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Login must be less than 20 characters and must not contain spaces.");
            }

            if (password.length() >= 20 || password.contains(" ")|| !password.contains("1")) {
                throw new WrongPasswordException("Password must be less than 20 characters and must not contain spaces." +
                        " Password must contain the digit 1");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirmation password do not match.");
            }
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

}
