import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        Queue<String> queue = new PriorityQueue<>();
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Ales");
        tree.add("BBbBBB  df  df ");
        tree.add("aaa uh  u uhuhu");
        tree.add("Stitiyt");
        tree.add("Qles");
        tree.add("bgofbpm");
        System.out.println(tree);
        mp.put(1,"AAA");
        mp.put(2,"A2A");
        mp.put(3,"A3A");
        mp.put(4,"A4A");
        Collection <String> collection = mp.values();
        Set< Map.Entry<Integer,String>> entries = mp.entrySet();
        for (Map.Entry<Integer,String> entr: entries){
            System.out.println("Map.Entry: "+entr+" :  ");
            System.out.println("key:  "+entr.getKey()+" value:  "+entr.getValue());
        }
        System.out.println("--------------------");

        System.out.println(43 % 32);
    }
}
