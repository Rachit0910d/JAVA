package LinkedList;

public class RevLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
}
