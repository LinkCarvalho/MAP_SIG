package excesoes;

public class ItemJaExisteException extends Exception{
    public ItemJaExisteException(){
        super("Ainda tem deste material no almoxarifado");
    }
}
