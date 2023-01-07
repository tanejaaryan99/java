package BinaryTree;
import java.util.*;

public class btBySid {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Scanner scan = null;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Node root=createTree();
        System.out.print("inOrder : ");
        inOrder(root);
        System.out.println();
        System.out.print("preOrder : ");

        preOrder(root);
        System.out.println();

        System.out.print("postOrder : ");

        postOrder(root);
        System.out.println();
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter the data: ");
        int data = scan.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);

        System.out.println("Enter to the left of " + data);
        root.left = createTree();

        System.out.println("Enter to the right of " + data);
        root.right = createTree();
        return root;
    }
    public static void  inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void  preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");

        preOrder(root.left);
        preOrder(root.right);
    }
    public static void  postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

}


