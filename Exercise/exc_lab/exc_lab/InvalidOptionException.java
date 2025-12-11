package exc_lab;

/**
 * An exception used to report invalid menu option selection.
 *
 */
@SuppressWarnings("serial")
public class InvalidOptionException extends Exception {

    /**
     * Constructor.
     *
     * @param msg the exception message.
     */
    InvalidOptionException(String msg) {

        super(msg);
    }
}