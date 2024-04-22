package excesoes;

public class NumeroSalaInvalidoException extends RuntimeException {
    public NumeroSalaInvalidoException() {
        super("Número de sala inválido. Deve ser maior ou igual a 1.");
    }
}
