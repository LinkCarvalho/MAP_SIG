package excesoes;

public class DescontoMaiorQueValorLiquidoException extends Exception{
    public DescontoMaiorQueValorLiquidoException(){
        super("Descontos não podem ser maiores que o valor bruto");
    }
}
