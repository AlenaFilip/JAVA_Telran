public class e06_del5 {
    public static void main(String [] args){
        int kol = 0;
        for (int i = 10; i<=99;i++)
            if ((i % 10 ==5) && i % 5 == 0)
                kol = kol + 1;
        System.out.println(kol);
    }
}
