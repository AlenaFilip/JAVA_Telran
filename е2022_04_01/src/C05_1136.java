import java.util.Scanner;

public class C05_1136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        for (int i = 0; i<10; i++){
            System.out.print(num3 - 6*i + " ");
        }
        sc.close();
    }
}
