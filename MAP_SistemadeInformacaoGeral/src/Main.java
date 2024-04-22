import SIG.Conta;
import SIG.Fachada;

import java.util.Arrays;
import java.util.List;
import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;
import excesoes.ItemJaExisteException;
import excesoes.DescontoMaiorQueValorLiquidoException;

public class Main {
    public static void main(String[] args) throws PoucosParticipantesException, DiainvalidoException, ItemJaExisteException, DescontoMaiorQueValorLiquidoException {
        Fachada facadeSIG = new Fachada();

        List<String> participantesReuniao = Arrays.asList("João", "Maria", "Carlos");
        facadeSIG.organizarReuniao(participantesReuniao, 15, "Planejamento Estrategico");
        System.out.println("----------------------------------------------------------------------");

        List<String> candidatos = Arrays.asList("Pedro", "Lucas");
        facadeSIG.realizarEntrevista("Sabrina", candidatos, 20, "Professor");
        System.out.println("----------------------------------------------------------------------");

        facadeSIG.disponibilidadeSala(9);
        System.out.println("----------------------------------------------------------------------");

        facadeSIG.historicoAluno("Ribamiltom");
        facadeSIG.rdmAluno("Noiana");

        System.out.println("----------------------------------------------------------------------");

        facadeSIG.atribuirProfessorParaDisciplina("Edson", "Linguagens formais");
        facadeSIG.consultaTempoProfessor("Daniel");

        System.out.println("----------------------------------------------------------------------");

        facadeSIG.pedido("Vassoura", "15,00");
        facadeSIG.inventario();

        System.out.println("----------------------------------------------------------------------");
        List<Conta> contas = Arrays.asList(new Conta("Internet", 129.00), new Conta("Água", 900.00), new Conta("Luz", 450.00));

        System.out.println(facadeSIG.balanco(contas));

        String pagamento = facadeSIG.folhaDePagamento("Salários", 5000.00, 20000.00);
        System.out.println(pagamento);


    }
}
