package exceptions;

public class NoExistSendAccount extends Exception{
    public NoExistSendAccount(){
        super("No existe una cuenta que envíe el dinero con ese número");
    }
}
