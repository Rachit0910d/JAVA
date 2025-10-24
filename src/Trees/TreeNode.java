package Trees;

import StackAndQueue.Queue.QueueEmptyException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput(sc);
        TreeNode<Integer> root = takeInputLevelWise();
        displayTree(root);
//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//        System.out.println(root);
    }

    private static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data : ");
        int rootData = sc.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            try{
                TreeNode<Integer> frontNode = pendingNodes.remove();
                System.out.println("Enter number of children of "+ frontNode.data);
                int numChildren = sc.nextInt();
                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.add(childNode);
                }
            } finally {
                System.out.println("Process is done.");
            }
        }
        return root;
    }

    /*
    private static TreeNode<Integer> takeInput(Scanner sc) {
        int n;
        System.out.print("Enter next node data : ");
        n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = sc.nextInt();

        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }
        return root;
    }
*/

    private static void displayTree(TreeNode<Integer> t){
        StringBuilder s = new StringBuilder();
         s.append(t.data).append(":");
        for (int i = 0; i < t.children.size(); i++){
            s.append(t.children.get(i).data).append(",");
        }
        System.out.println(s);
        for (int i = 0; i < t.children.size(); i++){
            displayTree(t.children.get(i));
        }
    }
}
