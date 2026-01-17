package exceptions;

public class LimiteDepasseeException extends RuntimeException {
    public LimiteDepasseeException() {
        super("Limite dépassée");
    }
}
