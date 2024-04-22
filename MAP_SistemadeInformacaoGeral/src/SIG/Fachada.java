package SIG;

import java.util.List;
import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;
import excesoes.NumeroSalaInvalidoException;
import excesoes.ItemJaExisteException;
import excesoes.DescontoMaiorQueValorLiquidoException;

public class Fachada {
    private Administrativo administrativo;
    private Almoxarifado almoxarifado;
    private Aluno aluno;
    private Infraestrutura infraestrutura;
    private Professor professor;
    private ContasEDespesas contasEDespesas;

    public Fachada() {
        this.administrativo = new Administrativo();
        this.almoxarifado = new Almoxarifado();
        this.aluno = new Aluno();
        this.infraestrutura = new Infraestrutura();
        this.professor = new Professor();
        this.contasEDespesas = new ContasEDespesas();
    }

    // Métodos que unificam as operações das classes
    public String organizarReuniao(List<String> participantes, int dia, String assunto) throws DiainvalidoException, PoucosParticipantesException {
        return administrativo.organizarUmaReuniao(participantes, dia, assunto);
    }

    public String agendarReuniao(String assunto){
        return administrativo.agendarReuniao(assunto);
    }

    public String realizarEntrevista(String entrevistador, List<String> candidatos, int dia, String cargo) throws DiainvalidoException, PoucosParticipantesException {
        return administrativo.realizarUmaEntrevista(entrevistador, candidatos, dia, cargo);
    }

    public String agendarEntrevistas(String cargo){
        return administrativo.agendarEntrevistas(cargo);
    }

    public void inventario(){
        almoxarifado.inventario();
    }

    public String pedirMaterial(String nome, String preco){
        return almoxarifado.pedirMaterial(nome, preco);
    }

    public String confirmarMaterial(String nome){
        return almoxarifado.confirmarMaterial(nome);
    }

    public void adicionarItem(String nome, double preco) throws ItemJaExisteException {
        almoxarifado.adicionarItem(nome, preco);
    }

    public String historicoAluno(String nome){
        return aluno.historicoAluno(nome);
    }

    public String rdmAluno(String nome){
        return aluno.rdmAluno(nome);
    }

    public String disponibilidadeSala(int numSala) throws NumeroSalaInvalidoException {
        return infraestrutura.disponibilidade(numSala);
    }

    public String definirSala(int numSala){
        return infraestrutura.definirSala(numSala);
    }

    public String atribuirProfessorParaDisciplina(String nome, String disciplina){
        return professor.atribuirProfessorParaDisciplina(nome, disciplina);
    }

    public String consultaTempoProfessor(String nome){
        return professor.consultaTempo(nome);
    }

    public String balanco(List<Conta> contas) {
        return contasEDespesas.balanco(contas);
    }

    public String folhaDePagamento(String titulo, double descontos, double valorBruto) throws DescontoMaiorQueValorLiquidoException {
        return contasEDespesas.folhaDePagamento(titulo, descontos, valorBruto);
    }
}

