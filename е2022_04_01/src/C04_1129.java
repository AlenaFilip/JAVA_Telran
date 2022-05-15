import java.util.Scanner;

public class C04_1129 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num % 10;
        System.out.println("Все числа, оканчивающиеся на "+num);
        for (int i = 100; i<=999;i++)
            if (i % 10 == num)
                System.out.print(i+" ");
        System.out.println("");
        System.out.println("Финиш");
    }
}
