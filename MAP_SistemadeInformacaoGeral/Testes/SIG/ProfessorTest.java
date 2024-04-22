package SIG;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    public void deveAtribuirProfessorParaDisciplina() {
        Professor professor = new Professor();
        String nome = "João";
        String disciplina = "Matemática";
        String resultadoEsperado = "Designando o professor João para a disciplina Matemática";
        String resultado = professor.atribuirProfessorParaDisciplina(nome, disciplina);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveConsultarTempo() {
        Professor professor = new Professor();
        String nome = "João";
        String resultadoEsperado = "Tempo que o professor João está conosco";
        String resultado = professor.consultaTempo(nome);
        assertEquals(resultadoEsperado, resultado);
    }
}
