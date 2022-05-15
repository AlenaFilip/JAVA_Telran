import java.util.Scanner;

public class a06_dvoi4naya {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n!=0){
            System.out.print(n % 2);
            n = n - n % 2;
            n = n / 2;
        }
    }
}
