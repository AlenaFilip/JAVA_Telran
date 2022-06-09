/* Your program should ask user (use Scanner) how to send mail: by DHL, by E-mail or by Pigeon
and send mail by using the appropriate service.
• Create interface MailDeliveryService with one method void sendMail ()
• Create class DHL that should implement the interface MailDeliveryService.
Its way to send mail is print something like: “Put a letter in an envelope, put a stamp, send”
• Create class Email that should implement the interface MailDeliveryService.
Its way to send mail is print something like: “Send by internet”
• Create class Pigeon that should implement the interface MailDeliveryService.
Its way to send mail is print something like: “ Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away ”
• Create class Sender with the method send in it. As argument this method takes
the MailDeliveryService and send the mail using given service.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sender ivan = new Sender("Ivan");
        ivan.send();
    }
}
