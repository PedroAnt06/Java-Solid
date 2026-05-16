package O;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();
        Pagamento dinheiro = new PagamentoDinheiro();

        cartao.pagar(100.00);
        pix.pagar(50.00);
        dinheiro.pagar(25.00);
    }
}