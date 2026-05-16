package I;

public class ServicoEntrega implements GerenciadorEntrega {

    @Override
    public void iniciarEntrega(int idPedido) {
        System.out.println("Entrega do pedido #" + idPedido + " iniciada.");
    }

    @Override
    public void finalizarEntrega(int idPedido) {
        System.out.println("Entrega do pedido #" + idPedido + " finalizada.");
    }
}