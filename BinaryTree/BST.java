package BinaryTree;

public class BST {
    static class Node{
        int val = 0;
        Node left;
        Node right;

        Node(int data){
            val = data;
            left=right=null;
        }
    }

    public static void main(String[] args) {

        //========= Lvl 1 =============
        Node root = new Node(70);
        //========= Lvl 2 =============
        root = insert(root , 50);
        root = insert(root , 90);
        //========= Lvl 3 =============
        root = insert(root , 80);
        root = insert(root , 30);
        root = insert(root , 110);
        root = insert(root , 60);
        //=============================

        //========= Lvl 1 =============
        Node root2 = new Node(70);
        //========= Lvl 2 =============
        root2 = insertRecursivly(root2 , 50);
        root2 = insertRecursivly(root2 , 90);
        //========= Lvl 3 =============
        root2 = insertRecursivly(root2 , 80);
        root2 = insertRecursivly(root2 , 30);
        root2 = insertRecursivly(root2 , 110);
        root2 = insertRecursivly(root2 , 60);

        preOrder(root);
        System.out.println();
        preOrder(root2);
        System.out.println();

        System.out.println(search(root,80));
        System.out.println(searchItratively(root,100));

        deleteNode(root , 80);
        preOrder(root);
        System.out.println();
        deleteNode(root2 , 90);
        preOrder(root2);
        System.out.println();
        deleteNode(root2,70);
        preOrder(root2);
        System.out.println();

    }

    public static Node insert(Node root ,int val){
        Node n = new Node(val);
        Node temp = root;
        Node parent = null;

        while(temp != null){
            parent = temp;
            if(val < temp.val) temp = temp.left;
            else temp = temp.right;
        }
        if(parent == null) return n;
        if(val > parent.val) parent.right = n;
        if(val < parent.val) parent.left = n;

        return root;
    }

    public static Node insertRecursivly(Node root , int val){
        if(root == null) return new Node(val);
        if(val < root.val) root.left = insertRecursivly(root.left,val);
        if(val > root.val) root.right = insertRecursivly(root.right,val);

        return root;
    }


    public static boolean search(Node root , int val){
        if(root == null || root.val == val){
            return true;
        }
        if(val > root.val) {
            return search(root.right , val);
        }
        else if(val < root.val) {
            return search(root.left , val);
        }
        return false;
    }

    public static boolean searchItratively(Node root , int val){
        while(root!= null){
            if(root.val == val) return true;
            else if (val > root.val) root = root.right;
            else root = root.left;
        }
        return false;
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static Node inOrderSucessor(Node root){
        root = root.right;
        while(root != null && root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node deleteNode(Node root, int val){
        if(root == null) return null;
        if(root.val > val) root.left = deleteNode(root.left , val);
        else if (root.val < val) root.right = deleteNode(root.right , val);
        else{
            if(root.left == null) {
                Node temp= root.right;
                return temp;
            }
            else if(root.right == null){
                Node temp =root.left;
                return temp;
            }
            else{
                Node successor = inOrderSucessor(root);
                root.val = successor.val;
                root.right = deleteNode(root.right,successor.val);
            }
        }
        return root;
    }
}
