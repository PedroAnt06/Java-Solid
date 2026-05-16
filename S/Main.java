package S;

public class Main {
    public static void main(String[] args) {
            Pedido criar = new Pedido("Pizza", 49.90);

            AdicionarPedido salvar = new AdicionarPedido();
            salvar.salvarPedido(criar);

            ListarPedido exibir = new ListarPedido();
            exibir.exibir(criar);
    }

}
