import java.util.Scanner;
import java.math.BigInteger;
public class b03_jopa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger b = BigInteger.valueOf(2);
        BigInteger c = b.pow(179);
        System.out.println(c.toString());
        sc.close();
    }
}
