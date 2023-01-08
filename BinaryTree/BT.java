package BinaryTree;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


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

    static Scanner scan = null;
    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(200);
//        root.right.left = new Node(6);
//        root.right.left.left = new Node(7);
//        root.right.left.right = new Node(8);
//        Scanner scan = new Scanner(System.in);
        Node root=createTree();


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
//        nodeAtDisK(root,2);
        levelOrderTraversal(root);
        System.out.println();
        System.out.println(size(root));
        System.out.println(sizeItratively(root));
        System.out.println(MaxInBT(root));
        leftView(root);

    }

    static Node createTree() {
        scan = new Scanner(System.in);
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


    public static void levelOrderTraversal(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.val + " ");
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
    }

    public static int size(Node root){
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;

    }
    public static int sizeItratively(Node root){
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int size = 0;
        while(!q.isEmpty()){
            Node n = q.poll();
//            System.out.print(n.val + " ");
            size++;
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }

        return size;
    }

    public static int MaxInBT(Node root){
        if(root==null) return -999999;
        else return Math.max(root.val,Math.max(MaxInBT(root.left),MaxInBT(root.right)));
    }

    static int MaxLevel = 0;
    public static void leftView(Node root){

        leftView(root,1);
    }
    private static void leftView(Node root,int currLvl){
        if(root == null) return;
        if(MaxLevel < currLvl){
            System.out.print(root.val+" ");
            MaxLevel= currLvl;
        }
        leftView(root.left,currLvl+1);
        leftView(root.right,currLvl+1);

    }


}
