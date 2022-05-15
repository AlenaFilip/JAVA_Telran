import java.util.Scanner;

public class a01_kolvo4t {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во вводимых чисел: ");
        int kolv = sc.nextInt();
        System.out.println("Введите "+ kolv+ " чисел: ");
        int num = 0;
        int rez = 0;
        for (int i = 1; i<=kolv; i++){
            num = sc.nextInt();
            if (num % 2 ==0)
                rez++;
        }
        System.out.println("Кол-во четных = " + rez);
    }
}
