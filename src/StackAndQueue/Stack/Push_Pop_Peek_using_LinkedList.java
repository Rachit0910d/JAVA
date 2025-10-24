package StackAndQueue.Stack;

public class Push_Pop_Peek_using_LinkedList {
    static class StackLinkedList {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node top;

        void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        int peek() {
            if (isEmpty())
                return -1;
            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }

        void add_At_Bottom(int data, StackLinkedList stack){
            if(isEmpty()){
                push(data);
                return;
            }
            int top = stack.pop();
            add_At_Bottom(data, stack);
            stack.push(top);
        }

        void reverseStack(StackLinkedList stack){
            if(isEmpty()){
                 return;
            }
            int top = stack.pop();
            reverseStack(stack);
            stack.add_At_Bottom(top, stack);
        }
    }

    public static void main(String[] args) {
            StackLinkedList stack = new StackLinkedList();
            stack.push(23);
            stack.push(34);
            stack.push(12);
            stack.push(23);
            stack.push(34);
            stack.push(12);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();

        stack.push(23);
        stack.push(34);
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(12);
        stack.add_At_Bottom(6, stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();

        stack.push(23);
        stack.push(34);
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(12);
        stack.reverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

        }
    }
