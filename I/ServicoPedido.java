package I;

public class ServicoPedido implements GerenciadorPedido {

    @Override
    public void criarPedido(String descricao) {
        System.out.println("Pedido criado: " + descricao);
    }

    @Override
    public void cancelarPedido(int id) {
        System.out.println("Pedido #" + id + " cancelado.");
    }
}