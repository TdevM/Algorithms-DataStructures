package data_structures.stacks;

/**
 * Created by Tridev on 27-12-2016.
 */
public class StackFullException extends RuntimeException {              //Only used for StackAsArray

    private String error;

    public StackFullException(String error) {
        this.error = error;
    }

    public StackFullException(String message, String error) {
        super(message);
        this.error = error;
    }

    public StackFullException(String message, Throwable cause, String error) {
        super(message, cause);
        this.error = error;
    }

    public StackFullException(Throwable cause, String error) {
        super(cause);
        this.error = error;
    }

    public StackFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }
}
