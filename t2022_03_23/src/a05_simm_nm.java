import java.util.Scanner;

public class a05_simm_nm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num4 = sc.nextInt();
        if ((num4/1000 == num4 % 10) && ((num4 / 100) % 10 == (num4 / 10) % 10))
            System.out.println(1);
        else
            System.out.println(2);
    }
}
