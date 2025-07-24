import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> itens = new ArrayList<>(); // Lista para armazenar os produtos do pedido

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) { // Método para adicionar um produto ao pedido
        itens.add(produto);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Produto::getPreco).sum(); // Método para calcular o total do pedido
    }

    public void imprimirResumo() { // Método para imprimir o resumo do pedido
        System.out.println("Pedido de: " + cliente.getNome());
        for (Produto item : itens) {
            System.out.println("- " + item.getDescricao() + " | R$" + item.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
