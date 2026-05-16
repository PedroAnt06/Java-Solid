package S;

import javax.swing.*;

public class ListarPedido {

    public void exibir(Pedido pedido) {
        System.out.println("----- Pedido -----");
        System.out.println("Produto: " + pedido.getNome());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}