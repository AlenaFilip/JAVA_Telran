import java.util.Scanner;

public class R0504_01evkl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int kolv=0;
        while (num1>0 && num2>0){
            if (num1>num2){
                num1=num1 % num2;
            } else {
                num2=num2 % num1;
            }
            kolv++;
        }
        if (num1==0){
            System.out.println(num2+" "+kolv);
        }else{
            System.out.println(num1+" "+kolv);
        }
    }
}
