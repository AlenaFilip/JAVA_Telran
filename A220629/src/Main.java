import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<String> qu = new PriorityQueue<>((s1, s2) -> s2.length() - s1.length());

        Queue<String> queue = new PriorityQueue<>();
        queue.add("we");
        queue.add("are");
        queue.add(" studing");
        queue.add("the");
        queue.add("Queue");
        queue.add("1");
        queue.add("3");
        queue.add("interface");

        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
