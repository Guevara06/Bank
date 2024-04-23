package exceptions;

public class NoExistGetAccount extends Exception{
    public NoExistGetAccount(){
        super("No existe una cuenta que reciba el dinero con ese número");
    }
}
