import java.util.Scanner;

public class a04_ulitka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rez = (h - a) / (a - b);  // колво целых суток в отрезке
        if (((h - a) % (a - b))>0)   // есть неполные сутки делаем +1
            rez = rez + 1;
        rez = rez + 1; // прибавили последний день
        System.out.println(rez);
    }
}
