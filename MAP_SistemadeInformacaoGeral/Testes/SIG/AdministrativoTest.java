package SIG;

import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {

    @Test
    public void deveOrganizarUmaReuniao() throws PoucosParticipantesException, DiainvalidoException {
        Administrativo admin = new Administrativo();
        List<String> participantes = Arrays.asList("João", "Maria");
        String assunto = "Reunião de Planejamento";
        int dia = 15;
        String resultadoEsperado = "Titulo da reunião: Reunião de Planejamento\nParticipantes:\nJoão\nMaria\nDia: 15";
        String resultado = admin.organizarUmaReuniao(participantes, dia, assunto);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveAgendarReuniao() {
        Administrativo admin = new Administrativo();
        String assunto = "Reunião de Planejamento";
        String resultadoEsperado = "Reunião Reunião de Planejamento agendada com sucesso";
        String resultado = admin.agendarReuniao(assunto);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveRealizarUmaEntrevista() throws PoucosParticipantesException, DiainvalidoException {
        Administrativo admin = new Administrativo();
        List<String> candidatos = Arrays.asList("João", "Maria");
        String cargo = "Engenheiro de Software";
        int dia = 15;
        String resultadoEsperado = "Cargo: Engenheiro de Software\nParticipantes:\nJoão\nMaria\nDia: 15";
        String resultado = admin.realizarUmaEntrevista("Entrevistador", candidatos, dia, cargo);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveAgendarEntrevistas() {
        Administrativo admin = new Administrativo();
        String cargo = "Engenheiro de Software";
        String resultadoEsperado = "Entrevista para o cargo Engenheiro de Software agendada com sucesso";
        String resultado = admin.agendarEntrevistas(cargo);
        assertEquals(resultadoEsperado, resultado);
    }


}