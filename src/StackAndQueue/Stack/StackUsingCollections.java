package StackAndQueue.Stack;

import java.util.*;

public class StackUsingCollections {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(34);
//        stack.push(23);
//        stack.push(12);
//        System.out.println(stack);
//
//        stack.pop();
//        stack.pop();
//        System.out.println(stack);
//
//        System.out.println(stack.peek());


        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(33);
        queue.add(233);
        queue.add(235);
        queue.add(3);
        queue.add(2);
        System.out.println(queue);

        System.out.println(queue.remove());

    }
}
