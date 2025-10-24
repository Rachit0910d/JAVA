package LinkedList;

public class InsertingLastDouble {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data,Node next,Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;

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
        InsertingLastDouble list = new InsertingLastDouble();
        list.insertLast(34);
        list.insertLast(23);
        list.insertLast(12);
        list.insertLast(90);
        list.display();
    }
}
