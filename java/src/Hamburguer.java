import java.util.List;

public class Hamburguer extends Produto {
    private List<String> ingredientes;

    public Hamburguer(String nome, double preco, List<String> ingredientes) {
        super(nome, preco);
        this.ingredientes = ingredientes;
    }

    @Override
    public String getDescricao() {
        return "Hamburguer: " + nome + " - Ingredientes: " + String.join(", ", ingredientes);
    }
}
