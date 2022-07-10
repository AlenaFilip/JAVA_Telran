public class MyLinkedList {
    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void pushToHead(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
    }

    public void pushToIndex(int index, int data) {
        if (head == null && index == 0){
            Node newNode = new Node(data,null);
            head = newNode;
            return;
        }
        if (index==0){
            Node newNode = new Node(data,head);
            head = newNode;
            return;
        }
        Node node=head;
        for (int i = 0; i < index-1; i++) {
            if(node.getNext() == null){
                System.out.println("Exception in thread ...");
                return;
            }
            node = node.getNext();
        }
        Node newNode = new Node(data,node.getNext());
        node.setNext(newNode);
    }

    public void removeFirst() {
        if (head == null){
            System.out.println("Exception in thread ...");
            return;
        }
        head = head.getNext();
    }

    public void removeLast() {
        if (head == null){
            System.out.println("Exception in thread ...");
            return;
        }
        Node last = head;
        Node node;
        for (node = head; node.getNext() != null; node = node.getNext()) {
            last = node;
        }
        last.setNext(null);
    }

    public void remove(int index) {
        if (head == null){
            System.out.println("Exception in thread ...");
            return;
        }
        if (head.getNext() == null && index == 0){
            head = null;
            return;
        }
        Node last = head;
        Node next  = head;
        for (int i = 0; i < index; i++) {
            if (next.getNext() == null){
                System.out.println("Exception in thread ...");
                return;
            }
            last = next;
            next = next.getNext();
        }
        last.setNext(next.getNext());
    }

    public int get(int index) {
        if (head == null){
            System.out.println("Exception in thread ...");
            return 0;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node.getNext()==null){
                System.out.println("Exception in thread ...");
                return 0;
            }
            node=node.getNext();
        }
        return node.getData();
    }

    public int size() {
        Node node;
        int count = 0;
        for(node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }

    public void print() {
        System.out.print('[');
        Node node;
        for (node = head; node!=null ; node = node.getNext()) {
            System.out.print(node.getData()+ ((node.getNext()==null)?"":",") );
        }
        System.out.print(']');
        System.out.println();
    }
}
