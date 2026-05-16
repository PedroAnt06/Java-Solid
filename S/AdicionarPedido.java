package S;

import java.util.ArrayList;
import java.util.List;

public class AdicionarPedido {

    public List<Pedido> pedidoList = new ArrayList<>();

    public void salvarPedido(Pedido pedido){
        pedidoList.add(pedido);
        System.out.println("Pedido salvo com sucesso!");

    }
}
