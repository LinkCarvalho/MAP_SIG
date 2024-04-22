package SIG;

import excesoes.DescontoMaiorQueValorLiquidoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContasEDespesasTest {

    @Test
    public void deveLancarExcecaoParaDescontoMaiorQueValorBruto() {
        ContasEDespesas contasEDespesas = new ContasEDespesas();
        double valorBruto = 100.0;
        double descontos = 200.0;
        assertThrows(DescontoMaiorQueValorLiquidoException.class, () -> contasEDespesas.folhaDePagamento("Pagamento", descontos, valorBruto));
    }

    @Test
    public void deveCalcularValorLiquido() throws DescontoMaiorQueValorLiquidoException {
        ContasEDespesas contasEDespesas = new ContasEDespesas();
        double valorBruto = 200.0;
        double descontos = 100.0;
        double resultadoEsperado = 100.0;
        double resultado = contasEDespesas.valorLiquido(valorBruto, descontos);
        assertEquals(resultadoEsperado, resultado);
    }
}
