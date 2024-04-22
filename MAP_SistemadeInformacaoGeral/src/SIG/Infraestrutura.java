package SIG;
import excesoes.NumeroSalaInvalidoException;
public class Infraestrutura {

    public String disponibilidade(int numSala)throws NumeroSalaInvalidoException{
        if (numSala <= 0){
            throw new NumeroSalaInvalidoException();
        }
        return "Verificando a disponibilidade da sala " + numSala;
    }

    public String definirSala(int numSala){
        return "Sala " + numSala + " alocada com sucesso";
    }
}
