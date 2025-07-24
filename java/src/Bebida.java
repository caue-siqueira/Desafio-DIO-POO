public class Bebida extends Produto {
    private boolean gelada;

    public Bebida(String nome, double preco, boolean gelada) {
        super(nome, preco);
        this.gelada = gelada;
    }

    @Override
    public String getDescricao() {
        return "Bebida: " + nome + (gelada ? " (gelada)" : " (natural)");
    }
}
