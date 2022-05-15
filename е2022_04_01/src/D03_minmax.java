import java.util.Scanner;

/* найти мин и макс цифры числа
*/
public class D03_minmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int numb1;
        int nmax = 0;
        int nmin = 9;
        while (numb !=0 ){
            numb1 = numb % 10;
//            nmax = (nmax < numb1) ? numb1 : nmax ;
//            nmin = (nmin > numb1) ? numb1 : nmin ;
            if (nmax < numb1) nmax = numb1 ;
            if (nmin > numb1) nmin = numb1 ;
            numb = numb / 10;
        }
        System.out.println(nmin + " " + nmax);
    }
}
