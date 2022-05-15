import java.util.Scanner;

public class С01_sek921 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sek = n % 60;
        int min = n / 60 % 60;
        int h = n / 3600;
        int day = n / (24 * 3600);
        if (day > 0)
            System.out.println("Расчет не производится");
        else {
            System.out.println(h + " часов " + min + " минут " + sek + " секунд");
        }
    }
}
