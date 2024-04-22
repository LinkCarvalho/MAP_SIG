package SIG;

import excesoes.ItemJaExisteException;

import java.util.List;

public class Almoxarifado {

    private List<Item> inventario;

    public void inventario() {
        System.out.println("Inventário da Universidade: ");
        for (Item item : inventario) {
            System.out.println("Nome: " + item.getNome() + " | Preço: " + item.getPreco());
        }
    }

    public String pedirMaterial(String nome, String preco) {
        return "Pedido do item " + nome + ", R$ " + preco + " feito";
    }

    public String confirmarMaterial(String nome) {
        return "Pedido do item " + nome + " confirmado";
    }

    public void adicionarItem(String nome, double preco) throws ItemJaExisteException {
        Item novoItem = new Item(nome, preco);
        if(inventario.contains(novoItem)){
            throw new ItemJaExisteException();
        }
        inventario.add(novoItem);
        System.out.println("Novo item adicionado: " + nome + ", R$ " + preco);
    }
}
