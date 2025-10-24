package LinkedList;

public class CircularLinkedList {
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        head   = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        tail.next = head.next;
        head = head.next;
    }

    public boolean findCycle(){
        if(head == null || head.next == null) return false;
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public int findCycleLength(){
        Node fast = head;
        Node slow = head;

        while(slow != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public Node CycleStartingTerm(){
        if(head == null || head.next == null) {
            System.out.println("list is empty");
            return head;
        }

        int length = 0;
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = findCycleLength();
                break;
            }
        }

        if(length == 0){
            return null;
        }

        Node f = head;
        Node s = head;

        while(length > 0){
            s = s.next;
            length--;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return f;
    }

    public boolean isHappy(int n){
         int slow = n;
         int fast = n;
         do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
         } while(fast != slow);

        return slow == 1;
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }

    public Node middleNode() {
        if (head == null || head.next == null) return head;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void display(){
        Node current = head;
        if(head != null){
            do{
                System.out.print(current.data + " -> ");
                current = current.next;
            } while(current != head);
        }
        System.out.println("Again head");
    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(45);
        list.insertFirst(4);
        list.insertFirst(25);
        list.insertFirst(89);
        list.insertFirst(12);
        list.display();

//        list.deleteFirst();
//        list.display();
//
//        System.out.println(list.findCycle());
//        System.out.println(list.findCycleLength());

//        System.out.println(list.isHappy(19));
//        System.out.println(list.middleNode());


    }
}
