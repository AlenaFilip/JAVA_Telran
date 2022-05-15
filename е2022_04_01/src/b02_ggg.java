import java.util.Scanner;

public class b02_ggg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int ar = sc.nextInt();
        int k = 0;
        while (ar !=0 ){
            if (ar % 2 ==0)
                k=k+1;
            System.out.println("Введите число ");
            ar = sc.nextInt();
        }
        System.out.println(k);
    }
}
