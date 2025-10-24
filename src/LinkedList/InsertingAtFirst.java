package LinkedList;

public class InsertingAtFirst {
    class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void removingDuplicates(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }

    public Node sortListByMerge(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = middleNode(head);
        Node nextOfMiddle = mid.next;
        mid.next = null;


        Node left = sortListByMerge(head);
        Node right = sortListByMerge(mid);

        return mergeTwoLinkedList(left, right);
    }

    public Node middleNode(Node head){
        if(head == null || head.next == null) return head;
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeTwoLinkedList(Node a, Node b){

        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = mergeTwoLinkedList(a.next, b);
        } else {
            result = b;
            result.next = mergeTwoLinkedList(a, b.next);
        }
        return result;
    }

    public void sortLinkedListByBubbleSorting(){
        if(head == null || head.next == null) return;
        for(Node current = head; current != null; current = current.next){
            for(Node nextNode = current.next; nextNode != null; nextNode = nextNode.next){
                if(nextNode.data < current.data) {
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }
            }
        }
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
        InsertingAtFirst list = new InsertingAtFirst();
        list.insertAtFirst(0);
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
//        list.removingDuplicates();
//        list.display();

        list.sortListByMerge(list.head);
        list.display();

//        list.sortLinkedListByBubbleSorting();
//        list.display();

    }
}
