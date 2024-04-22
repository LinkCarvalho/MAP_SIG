import SIG.Fachada;


import java.util.Arrays;
import java.util.List;
import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;
import excesoes.NumeroSalaInvalidoException;
import excesoes.ItemJaExisteException;
import excesoes.DescontoMaiorQueValorLiquidoException;

public class Main {
    public static void main(String[] args) throws PoucosParticipantesException, DiainvalidoException {
        Fachada facadeSIG = new Fachada();

        List<String> participantesReuniao = Arrays.asList("João", "Maria", "Carlos");
        int diaReuniao = 15;
        String assuntoReuniao = "Planejamento Estratégico";
            String detalhesReuniao = facadeSIG.organizarReuniao(participantesReuniao, diaReuniao, assuntoReuniao);
            System.out.println(detalhesReuniao);


        String entrevistador = "Ana";
        List<String> candidatos = Arrays.asList("Pedro", "Lucas");
        int diaEntrevista = 20;
        String cargo = "Desenvolvedor";
        try {
            String detalhesEntrevista = facadeSIG.realizarEntrevista(entrevistador, candidatos, diaEntrevista, cargo);
            System.out.println(detalhesEntrevista);
        } catch (DiainvalidoException | PoucosParticipantesException e) {
            e.printStackTrace();
        }



    }
}
