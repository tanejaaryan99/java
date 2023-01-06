package BinaryTree;

public class BT {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            val = data;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        postOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        System.out.println(height(root));
        System.out.println(depth(root));
        System.out.println(heightByPI(root));
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static int height(Node root){ //height starts from 1
        if(root == null) return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return Math.max(lHeight,rHeight)+1;
    }
    public static int heightByPI(Node node)//height starts from 0
    {
        if(node==null)
            return 0;
        else
            return Math.max(heightByPI(node.left), heightByPI(node.right)+1);
    }
    public static int depth(Node root){
        if(root == null) return -1;
        int ld = depth(root.left);
        int rd = depth(root.right);
        return Math.max(ld,rd)+1;

    }
}
