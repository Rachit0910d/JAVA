package LinkedList;

public class InsertingAtLast {
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null){
            head = newNode;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("head -> ");
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertingAtLast list = new InsertingAtLast();
        list.insertAtLast(34);
        list.insertAtLast(23);
        list.insertAtLast(12);
        list.display();
    }
}
