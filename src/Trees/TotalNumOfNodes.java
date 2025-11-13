package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TotalNumOfNodes {

    static class TreeNode<T>{
        T data;
        ArrayList<TreeNode<T>> children;

        public TreeNode(T data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    private static TreeNode<Integer> takeInput(){
        int count  = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data : ");
        int root = sc.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> rootNode = new TreeNode<>(root);
        pendingNodes.add(rootNode);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNodes.remove();
            System.out.println("Enter the number of children for " + frontNode.data);
            int numChild = sc.nextInt();
            count += numChild;
            for (int i = 0; i < numChild; i++) {
                System.out.println("Enter the " + (i + 1) + "th child for " + frontNode.data);
                int child = sc.nextInt();

                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        System.out.println(count);
        return rootNode;
    }

    private static void display(TreeNode<Integer> root){
        StringBuilder s = new StringBuilder();
        s.append(root.data).append(":");
        for (int i = 0; i < root.children.size(); i++) {
            s.append(root.children.get(i).data).append(",");
        }
        System.out.println(s);

        for (int i = 0; i < root.children.size(); i++) {
            display(root.children.get(i));
        }
    }

    private static int numNodes(TreeNode<Integer> root){
        if(root == null){ // this is not a base case. it is an edge case
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) { // no need of base case as if any node does not have any child then it will stop recursion automatically
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    private static int largestNode(TreeNode<Integer> root, int max){
        if(root == null) return Integer.MIN_VALUE;

        for (int i = 0; i < root.children.size(); i++) {
            if(max < root.children.get(i).data){
                max = root.children.get(i).data;
            }
            largestNode(root.children.get(i), max);
        }
        return max;
    }

    private static void depth(TreeNode<Integer> root, int k){
        if(k < 0) return;

        if(k==0){
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            depth(root.children.get(i), k - 1);
        }
    }

    private static int TotalLeafNode(TreeNode<Integer> root){
        // if root is null, return 0
        if(root == null) return 0;
        // if root has no children, it is a leaf node, so return 1
        if(root.children.isEmpty()) {
            return 1;
        }
        // initialize count to 0


        int count = 0;
        // recursively call TotalLeafNode for each child and add the result to count
        for (int i = 0; i < root.children.size(); i++){
            count += TotalLeafNode(root.children.get(i));
        }
        // return the total count
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
//        System.out.println(numNodes(root));
//        display(root);
//        System.out.println(largestNode(root, root.data));
//        depth(root, 0);
        System.out.println(TotalLeafNode(root));
    }
}
