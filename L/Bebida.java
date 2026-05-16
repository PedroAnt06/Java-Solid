package L;

public class Bebida extends Produto {
    private int mlVolume;

    public Bebida(String nome, double preco, int mlVolume) {
        super(nome, preco);
        this.mlVolume = mlVolume;
    }

    @Override
    public void exibir() {
        System.out.println("Bebida: " + getNome() + " (" + mlVolume + "ml) - R$ " + getPreco());
    }
}