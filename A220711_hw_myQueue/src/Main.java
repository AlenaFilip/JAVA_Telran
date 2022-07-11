import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.pushToEnd(1);
        myQueue.pushToEnd(2);
        myQueue.remove();
        myQueue.pushToEnd(3);
        myQueue.pushToEnd(4);
        myQueue.remove();
        System.out.println(myQueue.getAll());
        myQueue.printArr();
        myQueue.pushToEnd(5);
        myQueue.pushToEnd(6);
        myQueue.pushToEnd(7);
        System.out.println(myQueue.getAll());
        myQueue.printArr();
        myQueue.remove();
        myQueue.remove();
        System.out.println(myQueue.getAll());
        myQueue.printArr();
        myQueue.pushToEnd(8);
        myQueue.pushToEnd(9);
        System.out.println(myQueue.getAll());
        myQueue.printArr();
        myQueue.pushToEnd(10);
        System.out.println(myQueue.getAll());
        myQueue.printArr();
        myQueue.pushToEnd(11);
        System.out.println(myQueue.getAll());
        myQueue.printArr();
    }
}
