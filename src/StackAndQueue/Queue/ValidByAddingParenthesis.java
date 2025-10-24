package StackAndQueue.Queue;

import java.util.Stack;

public class ValidByAddingParenthesis {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if(stack.isEmpty() && ch == ')'){
                stack.push(ch);
                count++;
            }else if(ch == '(' || ch == ')') {
                stack.push(ch);
                count++;
            }
        }
        return count;
    }
}
