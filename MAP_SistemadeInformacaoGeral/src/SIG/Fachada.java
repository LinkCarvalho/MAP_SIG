package SIG;

import java.util.List;
import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;
import excesoes.NumeroSalaInvalidoException;
import excesoes.ItemJaExisteException;
import excesoes.DescontoMaiorQueValorLiquidoException;

public class Fachada {
    private final Administrativo ADMINISTRATIVO;
    private final Almoxarifado ALMOXARIFADO;
    private final Aluno ALUNO;
    private final Infraestrutura INFRAESTRUTURA;
    private final Professor PROFESSOR;
    private final ContasEDespesas CONTAS_E_DESPESAS;

    public Fachada() {
        this.ADMINISTRATIVO = new Administrativo();
        this.ALMOXARIFADO = new Almoxarifado();
        this.ALUNO = new Aluno();
        this.INFRAESTRUTURA = new Infraestrutura();
        this.PROFESSOR = new Professor();
        this.CONTAS_E_DESPESAS = new ContasEDespesas();
    }

    // Métodos que unificam as operações das classes
    public void organizarReuniao(List<String> participantes, int dia, String assunto) throws DiainvalidoException, PoucosParticipantesException {
        System.out.println(ADMINISTRATIVO.organizarUmaReuniao(participantes, dia, assunto));
        System.out.println(ADMINISTRATIVO.agendarReuniao(assunto));
    }


    public void realizarEntrevista(String entrevistador, List<String> candidatos, int dia, String cargo) throws DiainvalidoException, PoucosParticipantesException {
        System.out.println(ADMINISTRATIVO.realizarUmaEntrevista(entrevistador, candidatos, dia, cargo));
        System.out.println(ADMINISTRATIVO.agendarEntrevistas(cargo));
    }


    public void inventario(){
        ALMOXARIFADO.inventario();
    }

    public String pedirMaterial(String nome, String preco){
        return ALMOXARIFADO.pedirMaterial(nome, preco);
    }

    public String confirmarMaterial(String nome){
        return ALMOXARIFADO.confirmarMaterial(nome);
    }

    public void adicionarItem(String nome, double preco) throws ItemJaExisteException {
        ALMOXARIFADO.adicionarItem(nome, preco);
    }

    public String historicoAluno(String nome){
        return ALUNO.historicoAluno(nome);
    }

    public String rdmAluno(String nome){
        return ALUNO.rdmAluno(nome);
    }

    public void disponibilidadeSala(int numSala) throws NumeroSalaInvalidoException {
        System.out.println(INFRAESTRUTURA.disponibilidade(numSala));
        System.out.println(INFRAESTRUTURA.definirSala(numSala));
    }

    public String atribuirProfessorParaDisciplina(String nome, String disciplina){
        return PROFESSOR.atribuirProfessorParaDisciplina(nome, disciplina);
    }

    public String consultaTempoProfessor(String nome){
        return PROFESSOR.consultaTempo(nome);
    }

    public String balanco(List<Conta> contas) {
        return CONTAS_E_DESPESAS.balanco(contas);
    }

    public String folhaDePagamento(String titulo, double descontos, double valorBruto) throws DescontoMaiorQueValorLiquidoException {
        return CONTAS_E_DESPESAS.folhaDePagamento(titulo, descontos, valorBruto);
    }
}

