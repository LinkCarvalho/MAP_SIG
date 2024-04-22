package SIG;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlmoxarifadoTest {

    @Test
    public void devePedirMaterial() {
        Almoxarifado almoxarifado = new Almoxarifado();
        String nome = "Caneta";
        String preco = "1.50";
        String resultadoEsperado = "Pedido do item Caneta, R$ 1.50 feito";
        String resultado = almoxarifado.pedirMaterial(nome, preco);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveConfirmarMaterial() {
        Almoxarifado almoxarifado = new Almoxarifado();
        String nome = "Caneta";
        String resultadoEsperado = "Pedido do item Caneta confirmado";
        String resultado = almoxarifado.confirmarMaterial(nome);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveAdicionarItem() {
        Almoxarifado almoxarifado = new Almoxarifado();
        String nome = "Caneta";
        String preco = "1.50";
        assertDoesNotThrow(() -> almoxarifado.adicionarItem(nome, preco));
    }
}
