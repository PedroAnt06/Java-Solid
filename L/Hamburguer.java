package L;

public class Hamburguer extends Produto {
    private String recheio;

    public Hamburguer(String nome, double preco, String recheio) {
        super(nome, preco);
        this.recheio = recheio;
    }

    @Override
    public void exibir() {
        System.out.println("Hamburguer: " + getNome() + " (" + recheio + ") - R$ " + getPreco());
    }
}