import java.util.Scanner;

public class d02_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rez = "";
        for (int i=1; i<=n; i++)
            rez = rez + i*2 + " ";
        System.out.println(rez);
//        for (int i=1; i<=n; i++)
//            System.out.print(i*2+" ");
    }
}

