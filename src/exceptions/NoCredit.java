package exceptions;

public class NoCredit extends Exception{
    public NoCredit(){
        super("NO se tiene el saldo suficiente en la cuenta");
    }
}
