package SIG;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void deveRetornarHistoricoAluno() {
        Aluno aluno = new Aluno();
        String nome = "João";
        String resultadoEsperado = "Historico do aluno João";
        String resultado = aluno.historicoAluno(nome);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveRetornarRdmAluno() {
        Aluno aluno = new Aluno();
        String nome = "João";
        String resultadoEsperado = "RDM do aluno João";
        String resultado = aluno.rdmAluno(nome);
        assertEquals(resultadoEsperado, resultado);
    }
}
