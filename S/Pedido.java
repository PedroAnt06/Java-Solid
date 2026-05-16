package S;

public class Pedido {
    private String nome;
    private Double valor;

    public Pedido(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Pedido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
