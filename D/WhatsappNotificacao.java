package D;

public class WhatsappNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}