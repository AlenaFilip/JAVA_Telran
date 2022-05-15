import java.util.Scanner;

public class R0504_02evkl2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int kolv = 1;
        while (num1>0 && num2>0 && num1!=num2){
            if (num1>num2) {
                num1=num1 % num2;
            } else {
                num2=num2 % num1;
            }
            kolv++;
        }
        System.out.println(num1+" "+kolv);
    }
}
