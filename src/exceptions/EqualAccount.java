package exceptions;

public class EqualAccount extends  Exception{
    public EqualAccount(){
        super("El número de las cuentas no pueden ser iguales");
    }
}
