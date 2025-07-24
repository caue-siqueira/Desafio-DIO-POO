import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cauê");

        Hamburguer h1 = new Hamburguer("X-Bacon", 18.50, Arrays.asList("Pão", "Carne", "Bacon", "Queijo"));
        Bebida b1 = new Bebida("Coca-Cola", 6.00, true);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(h1);
        pedido.adicionarProduto(b1);

        pedido.imprimirResumo();
    }
}
