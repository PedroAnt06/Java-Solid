package L;

public class Pizza extends Produto {
    private String sabor;

    public Pizza(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    @Override
    public void exibir() {
        System.out.println("Pizza: " + getNome() + " (" + sabor + ") - R$ " + getPreco());
    }
}