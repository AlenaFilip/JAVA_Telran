import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("atftafta");
        lst.add("123456789");
        lst.add("ssd");
        System.out.println(lst);
        makeShorterNumb(4,lst);
        System.out.println(lst);
    }

    public static void makeShorterNumb(int numb,List<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>numb) {
                list.set(i, list.get(i).substring(0,numb));
            }
        }
    }
}
