package Exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String mess){
        super(mess);
    }

    public WrongPasswordException() {
    }
}
