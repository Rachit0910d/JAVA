package StackAndQueue.Stack;
import java.util.ArrayList;

public class Push_Pop_Peek_using_ArrayList {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int data){
        list.add(data);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public int size() {
        return list.size();
    }


    public static void main(String[] args) {
        Push_Pop_Peek_using_ArrayList stack = new Push_Pop_Peek_using_ArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("New Top: " + stack.peek());      // 20
        System.out.println("Stack size: " + stack.size());   // 2
    }
}
