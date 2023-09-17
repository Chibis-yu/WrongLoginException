package Exception;

public class WrongConfirmPasswordException extends Exception{
    public WrongConfirmPasswordException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
