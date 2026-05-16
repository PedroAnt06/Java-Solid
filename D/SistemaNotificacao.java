package D;

public class SistemaNotificacao {
    private Notificacao notificacao;

    public SistemaNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void notificarUsuario(String mensagem) {
        notificacao.enviar(mensagem);
    }
}