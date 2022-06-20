import java.util.*;

/*  Пусть дан List Integer. Необходимо проверить, есть ли в нем такая пара чисел,
что в сумме они дают заданное число.
Задачу необходимо решить всеми известными вам способами. */
public class Main {
    public static void main(String[] args) {
        Integer amount = 71;
        List<Integer> list = createListInteger(30,99);
        System.out.println(list);
        System.out.println("--------- only 1 pair --------------");
        System.out.println(isPairEqSumma(amount,list)); // находит 1 пару и останавливает поиск
        System.out.println("--------- all pairs --------------");
        System.out.println(isAllPairEqSumma(amount, list)); // Все пары
        System.out.println("--------- 1 pair with sort --------------");
        System.out.println(isPairWithSort(amount, list)); // Сортировка, 1 цикл, поиск 1 пары
        System.out.println("--------- all pairs with sort --------------");
        System.out.println(isAllPairWithSort(amount, list)); // Сортировка, 1 цикл, поиск всех пар
    }

    public static String isAllPairWithSort(Integer amount, List<Integer> list){
        String result = "";
        Collections.sort(list);
        int i=0;
        int j = list.size()-1;
        while (i<j){
            if (list.get(i)+list.get(j) == amount) {
                result += System.lineSeparator() +"    " + list.get(i) + " + " + list.get(j);
                if (i<list.size()-1 || list.get(i) == list.get(i+1)) i++;
                else if (j>0 || list.get(j) == list.get(j-1)) j--;
                else {
                    i++;
                    j--;
                }
            } else if(list.get(i)+list.get(j) > amount) j--;
            else if (list.get(i)+list.get(j) < amount) i++;
        }
        return makeResalt(amount,result) ;
    }
    public static String makeResalt(Integer amount, String res){
        if (res.length()==0) return "Pair for amount "+amount+ " not found.";
        return amount+" = "+ res;
    }

    public static String isPairWithSort(Integer amount, List<Integer> list){
        String result = "";
        Collections.sort(list);
        int i=0;
        int j = list.size()-1;
        while (i<j){
            if (list.get(i)+list.get(j) == amount) {
                result = list.get(i) + " + " + list.get(j);
                break;
            }
            if (list.get(i)+list.get(j) > amount) j--;
            else if (list.get(i)+list.get(j) < amount) i++;
        }
        return makeResalt(amount,result) ;
    }

    public static String isAllPairEqSumma(Integer amount, List<Integer> list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)+list.get(j)==amount){
                    result += System.lineSeparator() +"    " + list.get(i) + " + " + list.get(j);
                }
            }
        }
        return makeResalt(amount,result) ;
    }

    public static String isPairEqSumma(Integer amount, List<Integer> list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)+list.get(j)==amount){
                    result = list.get(i) + " + " + list.get(j);
                }
            }
        }
        return makeResalt(amount,result) ;
    }


    public static List<Integer> createListInteger(int number, int maxnumb){
        List<Integer> res = new ArrayList<>();
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < number; i++) {
            Integer in = (Integer)rnd.nextInt(maxnumb);
            res.add(in);
        }
        return res;
    }
}
