package SIG;

import excesoes.DiainvalidoException;
import excesoes.PoucosParticipantesException;

import java.util.List;

public class Administrativo {

    public String organizarUmaReuniao(List<String> participantes, int dia, String assunto) throws DiainvalidoException, PoucosParticipantesException {
        if (dia < 1 || dia > 31){
            throw new DiainvalidoException();
        }
        if (participantes.size() < 2) {
            throw new PoucosParticipantesException("Não tem como fazer uma reunião com menos de duas pessoas");
        }
        String reuniao = "Titulo da reunião: " + assunto + "\nParticipantes:\n";
        for (String participante : participantes) {
            reuniao += participante + "\n";
        }
        reuniao += "Dia: " + dia;
        return reuniao;
    }

    public String agendarReuniao(String assunto){
        return "Reunião " + assunto + " agendada com sucesso";
    }

    public String realizarUmaEntrevista(String entrevistador, List<String> candidatos, int dia, String cargo)throws DiainvalidoException, PoucosParticipantesException{
        if (dia < 1 || dia > 31){
            throw new DiainvalidoException();
        }
        if (candidatos.isEmpty()){
            throw new PoucosParticipantesException("Não existem candidatos");
        }
        String entrevista = "Cargo: " + cargo + "\nParticipantes:\n";
        for (String participante : candidatos) {
            entrevista += participante + "\n";
        }
        entrevista += "Dia: " + dia;
        return entrevista;
    }

    public String agendarEntrevistas(String cargo){
        return "Entrevista para o cargo "+ cargo + " agendada com sucesso";
    }

}
