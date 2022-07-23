import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        String s=null;
        m2(s);
    }

    public static void m2(String s){

        try {
            System.out.println(m3(s));
        } catch (FileNotFoundException e){
            System.out.println("Метод m3 не может: файда нет");
            System.out.println("Берем значение по умолчанию");
        } catch (NullPointerException e){
            System.out.println("Null................");
        }



    }

    public static int m3(String s) throws FileNotFoundException {
        int res=0;
        s.length();
        FileReader fileReader = new FileReader("D:/xcvbn1.txt");
        /* читаем файл*/
        res=10;
        return res;
    }



}