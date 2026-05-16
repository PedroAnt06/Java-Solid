package D;

public class Main {
    public static void main(String[] args) {
        SistemaNotificacao porEmail = new SistemaNotificacao(new EmailNotificacao());
        SistemaNotificacao porSms = new SistemaNotificacao(new SmsNotificacao());
        SistemaNotificacao porWhatsapp = new SistemaNotificacao(new WhatsappNotificacao());

        porEmail.notificarUsuario("Seu pedido foi confirmado!");
        porSms.notificarUsuario("Seu pedido está a caminho!");
        porWhatsapp.notificarUsuario("Seu pedido chegou!");
    }
}