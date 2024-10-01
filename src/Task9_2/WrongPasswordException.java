package Task9_2;

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}