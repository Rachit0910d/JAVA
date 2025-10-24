package StackAndQueue.Queue;

public class CircularQueue {

    private int rear;
    private int[] arr;
    private int size;
    private int front;

    public CircularQueue(int size) {
        rear = -1;
        front = -1;
        this.size = size;
        arr = new int[size];
    }

    void add(int ele) {
        if (isFull(size - 1)) {
            System.out.println("Cannot be inserted in the Queue.");
            return;
        }

        rear++;
        arr[rear] = ele;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Cannot be removed!");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot be removed!");
            return -1;
        }

        return arr[0];
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull(int size) {
        return rear == size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

}


