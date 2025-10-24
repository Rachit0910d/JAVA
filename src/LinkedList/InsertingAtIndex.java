package LinkedList;

public class InsertingAtIndex {
    class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private int size;

    public InsertingAtIndex() {
        this.size = 0;
    }

    public void InsertAtIndex(int data, int index){
        Node newNode = new Node(data);
        if(head == null || index == 0){
            insertFirst(data);
            size++;
            return;
        }

        if(index == size - 1){
            insertLast(data);
            size++;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next.prev = newNode;

        current.next = newNode;
        newNode.prev = current;
        size++;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        if(head.next == null){
            head.next = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        if(head.next == null){
            head.next = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("head -> ");
        while(current != null){
            System.out.print(current.data + "-> <- ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertingAtIndex list = new InsertingAtIndex();
        list.insertLast(34);
        list.insertLast(23);
        list.insertFirst(12);
        list.insertFirst(90);
        list.InsertAtIndex(45, 3);
        list.display();
    }
}
