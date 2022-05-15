public class R0504_evklidTheBest {
    public static void main(String[] args) {
        int n1 = 14;
        int n2 = 21;
        System.out.print("НОД ("+ n1+" "+ n2+ ") = ");
        int ostatok = n1 % n2 ;
        while (ostatok != 0) {
            n1 = n2;
            n2 = ostatok;
            ostatok = n1 % n2;
        }
        System.out.println( n2 );
    }
}
