package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    public class Node{
        int val;
        Node left;
        Node right;
    }

    Scanner scn = new Scanner(System.in);

    Node root = null;

    public BinaryTree(){
        root = construct(null,false);
        display(root);
    }

    public Node construct(Node root,boolean lc)
    {
        if(root==null)
        {
            System.out.println("Enter the val for root node");
        }
        else {
            if(lc)
            {
                System.out.println("Enter the val for left child of "+root.val);
            }
            else {
                System.out.println("Enter the val for right child of "+root.val);
            }
        }
        Node nn=new Node();
        int val=scn.nextInt();
        nn.val=val;
        System.out.println(nn.val+" Has any left child ?");
        boolean hlc=scn.nextBoolean();
        if(hlc==true)
        {
            nn.left=construct(nn,true);
        }
        System.out.println(nn.val+" has any right child ?");
        boolean hrc=scn.nextBoolean();
        if(hrc)
        {
            nn.right=construct(nn,false);
        }
        return nn;
    }

    public void display(){
        display(root);
    }
    private void display(Node root) {
        if (root == null) {
            return;
        }
        String str = "";
        if (root.left != null) {
            str += root.left.val;
        } else {
            str += ".";
        }
        str += " <- ";
        str += root.val + " -> ";
        if (root.right != null) {
            str += root.right.val;
        } else {
            str += ".";
        }
        System.out.println(str);
    }

    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        }
        int leftside = size(root.left);
        int rightside = size(root.right);
        return leftside + rightside + 1;
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        // height of left subtree:hls
        // height of right subtree:hrs
        int hls = height(root.left);
        int hrs = height(root.right);
        int max = Math.max(hls, hrs);
        return max + 1;

    }

    public int max() {
        return max(root);

    }

    public int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);
        int ans = Math.max(lmax, rmax);
        return Math.max(root.val, ans);

    }

    public int min() {
        return min(root);
    }

    public int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int lmin = min(root.left);
        int rmin = min(root.right);
        int min = Math.min(lmin, rmin);
        return Math.min(min, root.val);
    }

    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        boolean l = find(root.left, target);
        boolean r = find(root.right, target);
        return l || r;

    }
//    public void levelOrder(){
//        levelOrder(root);
//    }
//    private void levelOrder(Node root){
//        Queue<Node> q=new Queue();
//
//    }

}
