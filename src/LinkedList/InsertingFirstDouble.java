package LinkedList;

public class InsertingFirstDouble {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;

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
            System.out.print(current.data + " -> <- ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertingFirstDouble list = new InsertingFirstDouble();
        list.insertFirst(34);
        list.insertFirst(23);
        list.insertFirst(12);
        list.insertFirst(90);
        list.display();
    }
}
