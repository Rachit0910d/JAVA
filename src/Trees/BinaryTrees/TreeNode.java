package Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
  T data;
  TreeNode<T> left;
  TreeNode<T> right;

  public TreeNode(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static TreeNode<Integer> takeInput(Scanner sc){
    System.out.println("Enter root data : ");
    int rootData = sc.nextInt();
    if(rootData == -1){
      return null;
    }
    TreeNode<Integer> root = new TreeNode<Integer>(rootData);
    root.left = takeInput(sc);
    root.right = takeInput(sc);
    return root;
  }

  public static TreeNode<Integer> takeInputLevelWise(){
    Scanner sc = new Scanner(System.in);
    Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
    System.out.println("Enter the root data: ");
    int rootData = sc.nextInt();
    TreeNode<Integer> root = new TreeNode<>(rootData);
    pendingNodes.add(root);
    if(rootData == -1){
      return null;
    }
    while(!pendingNodes.isEmpty()){
      TreeNode<Integer> headNode = pendingNodes.remove();
      System.out.println("Enter left child for: "+headNode.data);
      int leftChildData = sc.nextInt();
      if(leftChildData != -1){
        TreeNode<Integer> child = new TreeNode<>(leftChildData);
        pendingNodes.add(child);
        headNode.left = child;
      }
      System.out.println("Enter right child for: "+headNode.data);
      int rightChildData = sc.nextInt();
      if(rightChildData != -1){
        TreeNode<Integer> child = new TreeNode<>(rightChildData);
        pendingNodes.add(child);
        headNode.right = child;
      }
    }
    sc.close();
    return root;
  }

  public static void display(TreeNode<Integer> root){
    if(root == null) return;
    String toBePrinted = root.data + " : ";
     if(root.left != null){
       toBePrinted += " L: " + root.left.data + ",";
     }
     if(root.right != null){
       toBePrinted += " R: " + root.right.data+ ",";
     }
    System.out.println(toBePrinted);
     display(root.left);
      display(root.right);
  }

  public static void displayLevelWise(TreeNode<Integer> root){
    if(root == null) return;

    String toBePrinted = root.data + " : ";
    Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
    pendingNodes.add(root);

    while(!pendingNodes.isEmpty()){
      if(root.left != null) {
        toBePrinted += " L: " + root.left.data + ",";
        pendingNodes.add(root.left);
      }
      if(root.right != null){
        toBePrinted += " R: " + root.right.data + ",";
        pendingNodes.add(root.right);
      }
      System.out.println(toBePrinted);


      pendingNodes.remove();
    }
  }

  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//    TreeNode<Integer> root = new TreeNode<>(1);
//    TreeNode<Integer> node1 = new TreeNode<>(2);
//    root.left = node1;
//    TreeNode<Integer> node2 = new TreeNode<>(3);
//    root.right = node2;

//    TreeNode<Integer> root = takeInput(sc);
//    display(root);
//    sc.close();

    TreeNode<Integer> root = takeInputLevelWise();
//    display(root);
    displayLevelWise(root);

  }
}
