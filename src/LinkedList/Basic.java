package LinkedList;

public class Basic {
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

        Node(String data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    int size;

    Basic(){
        this.size = 0;
    }

    // add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add - Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void delFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void delLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secLast = head;
        Node current = head.next;
        while(current.next != null){
            current = current.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    // return the size of the list
    public int getSize(){
        return size;
    }

    // insert at any specific position
    public void insertAtIndex(String data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == size){
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void delAtIndex(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(index == size - 1){
            delLast();
        }

        if(index == 0){
            delFirst();
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

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

    public void insertRec(String data, int index){
        head = insertRecur(data, index, head);
    }

    private Node insertRecur(String data, int index,Node node){
        if(index == 0){
            Node temp = new Node(data);
            size++;
            return temp;
        }

        node.next = insertRecur(data, index-1, node.next);
        return node;
    }

    public void removingDuplicates(String data){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.data.equals(current.next.data)){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }



    public void display(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("head -> ");
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Basic list = new Basic();
        list.addFirst("a");
        list.display();

        list.addFirst("is");
        list.display();

        list.addFirst("This");
        list.display();

        list.addLast("List");
        list.display();

//        list.delLast();
//        list.display();

        System.out.println(list.getSize());

        list.insertAtIndex("yoo",2);
        list.display();

//        list.delAtIndex(1);
//        list.display();
//
//        list.reverseIterate();
//        list.display();

//        list.insertRec("Hello", 2);
//        list.display();
    }
}
