package I;

public class ServicoEmail implements Notificador {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }
}