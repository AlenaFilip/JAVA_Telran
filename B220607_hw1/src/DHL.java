public class DHL implements MailDeliveryService{
    String text;

    public DHL(String text) {
        this.text = text;
    }

    @Override
    public void sendMail() {
        System.out.println("Put a letter in an envelope, put a stamp, send");
        System.out.println("<< " + text + ">>");
    }
}
