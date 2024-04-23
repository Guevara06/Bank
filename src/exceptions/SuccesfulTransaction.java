package exceptions;

public class SuccesfulTransaction extends Exception{
    public SuccesfulTransaction(){
        super("La transacción se realizó de manera exitosa");
    }
}
