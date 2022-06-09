public class Pigeon implements MailDeliveryService{
    String text;

    public Pigeon(String text) {
        this.text = text;
    }

    @Override
    public void sendMail() {
        System.out.println("Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away");
        System.out.println("<< " + text + ">>");
    }
}
