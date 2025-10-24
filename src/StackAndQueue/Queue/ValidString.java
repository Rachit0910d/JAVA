package StackAndQueue.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ValidString {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        if(isValid(s)){
            System.out.println("String is valid");
        } else{
            System.out.println("String is invalid");
        }
    }
}
