package StackAndQueue.Stack;

// for static array and the array size is passed by constructor call
public class Push_Pop_Peek_using_array {
    private int top;
    private int[] arr;
    private int capacity;


public Push_Pop_Peek_using_array(int size){
    arr = new int[size];
    capacity = size;
    top = -1; // stack is empty
    }
 
    //
    public void push(int data){
    if(isFull()){
        System.out.println("Stack underflow!");
        return;
    }
    top++;
    arr[top] = data;
    }

    private boolean isFull() {
    return top == capacity - 1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow!");
            return -1;
        }
        int head = top;
        top--;
        return arr[head];
    }

    public int peek(){
    if(isEmpty()){
        System.out.println("Stack Underflow!");
        return -1;
    }
    return arr[top];
    }

    public boolean isEmpty() {
    return top == -1;
    }

    public int getSize(){
    return ++top;
    }

    public static void main(String[] args) {
        Push_Pop_Peek_using_array stack = new Push_Pop_Peek_using_array(6);
        stack.push(23);
        stack.push(3);
        stack.push(2);
        stack.push(213);
        stack.push(223);
        stack.push(237);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
