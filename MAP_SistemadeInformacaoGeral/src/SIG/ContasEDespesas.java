package SIG;

import excesoes.DescontoMaiorQueValorLiquidoException;

import java.util.List;

public class ContasEDespesas {

    public String balanco(List<Conta> contas) {
        String balancoConta = "Componentes para o balanço:\n";
        for (Conta conta : contas) {
            balancoConta += "Nome: " + conta.getNome() + " | Valor: " + conta.getValor() + "\n";
        }
        return balancoConta;
    }

    public String folhaDePagamento(String titulo, double descontos, double valorBruto) throws DescontoMaiorQueValorLiquidoException {
        String pagamento = "Título: " + titulo + "\nValor Bruto: " + valorBruto + "\nDiscontos: " + descontos +
                "\nValor Líquido: " + valorLiquido(valorBruto, descontos);
        return pagamento;
    }

    public double valorLiquido(double valorBruto, double descontos) throws DescontoMaiorQueValorLiquidoException{
        if (descontos > valorBruto){
            throw new DescontoMaiorQueValorLiquidoException();
        }

        return valorBruto - descontos;
    }

}
