import java.util.Scanner;

public class C08_delitklv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int kolv = 0;
        for (int i = 1; i<=x; i++){
            if (x % i == 0)
                kolv++;
        }
        System.out.println(kolv);
    }
}
