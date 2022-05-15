import java.util.Scanner;

public class e07_umnojen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1<0){
            n1 = -n1;
            n2 = -n2;
        }
        int rez = 0;
        for (int i=1; i<=n1; i++)
            rez+=n2;
        System.out.println(rez);
    }
}
