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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        postOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        inOrder(root);
//        System.out.println();
//        System.out.println(height(root));
//        System.out.println(depth(root));
//        System.out.println(heightByPI(root));
        nodeAtDisK(root,2);
//        System.out.println(nodeAtDisK(root,2));
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
    public static int heightByPI(Node root)//height starts from 0
    {
        if(root==null)
            return 0;
        else
            return Math.max(heightByPI(root.left), heightByPI(root.right)+1);
    }
    public static void nodeAtDisK(Node root , int k){
        //by PI
        if(root == null) return;
        if(k==0) System.out.print(root.val + " ");
//        if(k==0 && root != null){
//            System.out.print(root.val + " ");
//        }
//        if(root == null && k == 0) return;


        nodeAtDisK(root.left,k-1);
        nodeAtDisK(root.right,k-1);
//        System.out.println();
//        return ansL;
    }
    public static int depth(Node root){
        if(root == null) return -1;
        int ld = depth(root.left);
        int rd = depth(root.right);
        return Math.max(ld,rd)+1;

    }
}
