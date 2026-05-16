package D;

public class SmsNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}