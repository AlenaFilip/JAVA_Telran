import java.util.Scanner;

public class Sender {
    String name;

    public Sender(String name) {
        this.name = name;
    }

    public static void send(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the method of sending the letter");
        System.out.println("Enter the number: 1 - DHL");
        System.out.println("                  2 - E-mail");
        System.out.println("                  3 - Pigeon");
        int typeSend = sc.nextInt();
        switch (typeSend){
            case 1:{
                DHL letter = new DHL("My letter DHL");
                letter.sendMail();
                break;
            }
            case 2:{
                Email letter = new Email("My letter E-Mail");
                letter.sendMail();
                break;
            }
            case 3:{
                Pigeon letter = new Pigeon("My letter Pigeon");
                letter.sendMail();
                break;
            }
        }
    }
}
