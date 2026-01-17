package exceptions;

public class SoldeInsuffisantException extends RuntimeException {
    public SoldeInsuffisantException() {
        super("Solde insuffisant");
    }
}
