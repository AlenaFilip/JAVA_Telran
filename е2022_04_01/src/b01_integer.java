import java.util.Scanner;

public class b01_integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
        System.out.println(Integer.valueOf(x) + Integer.valueOf(y));
    }
}
