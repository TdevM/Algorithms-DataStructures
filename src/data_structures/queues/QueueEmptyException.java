package data_structures.queues;

/**
 * Created by Tridev on 27-12-2016.
 */
public class QueueEmptyException extends RuntimeException {


    String error;

    public QueueEmptyException(String error) {
        this.error = error;
    }

    public QueueEmptyException(String message, String error) {
        super(message);
        this.error = error;
    }

    public QueueEmptyException(String message, Throwable cause, String error) {
        super(message, cause);
        this.error = error;
    }

    public QueueEmptyException(Throwable cause, String error) {
        super(cause);
        this.error = error;
    }

    public QueueEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }
}
