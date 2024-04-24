package exceptions;

public class NoExistAccount extends Exception {
    public NoExistAccount() {
        super("La cuenta no existe");
    }
}
