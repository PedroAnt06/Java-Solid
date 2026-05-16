package L;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Pizza("Pizza Grande", 59.90, "Calabresa");
        Produto p2 = new Hamburguer("X-Burguer", 29.90, "Bacon");
        Produto p3 = new Bebida("Coca-Cola", 8.00, 350);

        p1.exibir();
        p2.exibir();
        p3.exibir();

        System.out.println("\n--- Produtos ---");
        Produto[] produtos = { p1, p2, p3 };

        for (Produto produto : produtos) {
            produto.exibir();
        }
    }
}