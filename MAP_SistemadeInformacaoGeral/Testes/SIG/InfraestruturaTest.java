package SIG;

import excesoes.NumeroSalaInvalidoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InfraestruturaTest {

    @Test
    public void deveVerificarDisponibilidade() {
        Infraestrutura infra = new Infraestrutura();
        int numSala = 101;
        String resultadoEsperado = "Verificando a disponibilidade da sala 101";
        String resultado = infra.disponibilidade(numSala);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveLancarExcecaoParaNumeroSalaInvalido() {
        Infraestrutura infra = new Infraestrutura();
        int numSala = -1;
        assertThrows(NumeroSalaInvalidoException.class, () -> infra.disponibilidade(numSala));
    }

    @Test
    public void deveDefinirSala() {
        Infraestrutura infra = new Infraestrutura();
        int numSala = 101;
        String resultadoEsperado = "Sala 101 alocada com sucesso";
        String resultado = infra.definirSala(numSala);
        assertEquals(resultadoEsperado, resultado);
    }
}
