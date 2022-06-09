public class Email implements MailDeliveryService{
    String text;

    public Email(String text) {
        this.text = text;
    }

    @Override
    public void sendMail() {
        System.out.println("Send by internet");
        System.out.println("<< " + text + ">>");
    }
}
