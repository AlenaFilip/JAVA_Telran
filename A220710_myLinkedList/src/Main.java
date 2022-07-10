import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        MyLinkedList myLList = new MyLinkedList();
        myLList.print();
        myLList.pushToHead(2);
        myLList.pushToTail(4);
        myLList.pushToHead(1);
        myLList.pushToIndex(2,3);
        myLList.pushToIndex(0,0);
        myLList.pushToIndex(5,5);
        myLList.print();
        myLList.removeFirst();
        myLList.removeLast();
        myLList.print();
        myLList.remove(2);
        myLList.print();
        System.out.println(myLList.get(1));
    }
}

