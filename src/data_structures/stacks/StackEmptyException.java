package data_structures.stacks;

/**
 * Created by Tridev on 26-12-2016.
 */
public class StackEmptyException extends RuntimeException {

    private String error;

    public StackEmptyException(String error) {
        super(error);
        this.error = error;
    }

    public StackEmptyException(String message, String error) {
        super(message);
        this.error = error;
    }

    public StackEmptyException(String message, Throwable cause, String error) {
        super(message, cause);
        this.error = error;
    }

    public StackEmptyException(Throwable cause, String error) {
        super(cause);
        this.error = error;
    }

    public StackEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }
}
