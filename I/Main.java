package I;

public class Main {
    public static void main(String[] args) {
        ServicoEmail email = new ServicoEmail();
        ServicoRelatorio relatorio = new ServicoRelatorio();
        ServicoPedido pedido = new ServicoPedido();
        ServicoEntrega entrega = new ServicoEntrega();

        pedido.criarPedido("Pizza Calabresa");
        email.enviarNotificacao("Seu pedido foi recebido!");
        entrega.iniciarEntrega(1);
        entrega.finalizarEntrega(1);
        relatorio.gerarRelatorio();
    }
}