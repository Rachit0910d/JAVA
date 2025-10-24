package LinkedList;

public class DelFirstDouble {
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

        public DelFirstDouble() {
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
                size++;
                return;
            }

            if(head.next == null){
                head.next = newNode;
                size++;
                return;
            }

            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            size++;
        }

        public void insertFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                size++;
                return;
            }

            if(head.next == null){
                head.next = newNode;
                size++;
                return;
            }

            newNode.next = head;
            head = newNode;
            size++;
        }

        public void deleteFirst(){
            if(head == null){
                System.out.println("Lost is empty");
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }

        public void deleteLast(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            if(head.next == null){
                deleteFirst();
                size--;
                return;
            }

            Node current = head.next;
            Node currentPrev = head;
            while(current.next != null){
                current = current.next;
                currentPrev = currentPrev.next;
            }
            currentPrev.next = null;
            size--;
        }

        public void deleteSpecificPosition(int index){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            if(index == 0){
                deleteFirst();
                size--;
                return;
            }

            if(index == size){
                deleteLast();
                size--;
                return;
            }

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = temp.next;
            size--;
        }

        public void reverse(){
            if(head == null || head.next == null){
                return;
            }

            Node previous = head;
            Node current = head.next;

             while(current != null){
                Node nextNode = current.next;
                current.next = previous;

                previous = current;
                current = nextNode;
            }
             head.next = null;
             head = previous;
        }

        public void reverseBetween(Node head, int left, int right){
            if(left == right){
                return;
            }

            Node current = head;
            Node prev = null;

            for (int i = 0; current != null && i < left - 1; i++) {
                prev = current;
                current = current.next;
            }

            Node last = prev;
            Node newEnd = current;
            assert current != null;
            Node next = current.next;
            for (int i = 0; current != null && i < right - left + 1; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            } else{
                head = prev;
            }
            newEnd.next = current;
        }

        public void display(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            System.out.print("head -> ");
            while(current != null) {
                System.out.print(current.data + "-> <- ");
                current = current.next;
            }
            System.out.print("null");
        }

        public static void main(String[] args) {
           DelFirstDouble list = new DelFirstDouble();
            list.insertLast(34);
            list.insertLast(23);
            list.insertFirst(12);
            list.insertFirst(90);
            list.InsertAtIndex(45, 3);
            list.display();
            System.out.println();

//            list.deleteFirst();
//            list.display();
//            System.out.println();
//
//            list.deleteLast();
//            list.display();
//            System.out.println();
//
//            list.deleteSpecificPosition(1);
//            list.display();

//            list.reverse();
//            list.display();

            list.reverseBetween(list.head, 1,3);
            list.display();
        }
    }

