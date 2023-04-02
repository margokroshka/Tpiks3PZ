package Exception;

public class WrongLoginException extends Exception {
    public WrongLoginException(String mess) {
        super(mess);
    }

    public WrongLoginException() {
    }
}
