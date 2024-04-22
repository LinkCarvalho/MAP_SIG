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
        facadeSIG.organizarReuniao(participantesReuniao, 15, "Planejamento Estrategico");
        System.out.println("----------------------------------------------------------------------");

        List<String> candidatos = Arrays.asList("Pedro", "Lucas");
        facadeSIG.realizarEntrevista("Sabrina", candidatos, 20, "Professor");
        System.out.println("----------------------------------------------------------------------");

        facadeSIG.disponibilidadeSala(9);
        System.out.println("----------------------------------------------------------------------");







    }
}
