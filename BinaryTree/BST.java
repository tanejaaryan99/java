package BinaryTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

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

//        //========= Lvl 1 =============
//        Node root = new Node(70);
//        //========= Lvl 2 =============
//        root = insert(root , 50);
//        root = insert(root , 90);
//        //========= Lvl 3 =============
//        root = insert(root , 80);
//        root = insert(root , 30);
//        root = insert(root , 110);
//        root = insert(root , 60);
//        //=============================
//
//        //========= Lvl 1 =============
//        Node root2 = new Node(70);
//        //========= Lvl 2 =============
//        root2 = insertRecursivly(root2 , 50);
//        root2 = insertRecursivly(root2 , 90);
//        //========= Lvl 3 =============
//        root2 = insertRecursivly(root2 , 80);
//        root2 = insertRecursivly(root2 , 30);
//        root2 = insertRecursivly(root2 , 110);
//        root2 = insertRecursivly(root2 , 60);
//
//        preOrder(root);
//        System.out.println();
//        preOrder(root2);
//        System.out.println();
//
//        System.out.println(search(root,80));
//        System.out.println(searchItratively(root,100));
//
//        deleteNode(root , 80);
//        preOrder(root);
//        System.out.println();
//        deleteNode(root2 , 90);
//        preOrder(root2);
//        System.out.println();
//        deleteNode(root2,70);
//        preOrder(root2);
//        System.out.println();



//        //Floor in BST
//        //========lvl1========
//        Node root = new Node(15);
//        //========Level 2=========
//        root = insert(root,5);
//        root = insert(root,20);
//        //========Level 3 =========
//        root = insert(root,9);
//        root = insert(root,17);
//        root = insert(root,25);
//
//        preOrder(root);
//        System.out.println();
//
//        System.out.println(floor(root,20));
//
//        //========lvl1========
//        Node root2 = new Node(5);
//        //========Level 2=========
//        root2 = insert(root2,3);
//        root2 = insert(root2,20);
//        //========Level 3 =========
//        root2 = insert(root2,2);
//        root2 = insert(root2,4);
//        root2 = insert(root2,13);
//        root2 = insert(root2,25);
//
//        preOrder(root2);
//        System.out.println();
//
//        System.out.println(floor(root2,15));
//        System.out.println(ceil(root2,15));


        //===========Kth Smallest==========
        //====== Level 1 ==============
        Node root = new Node(60);

        //=======lvl 2=======
        root = insert(root , 50);
        root = insert(root , 80);
        //==========Lvl 3===========
        root = insert(root , 30);
        root = insert(root , 55);
        root = insert(root , 70);
        root = insert(root , 90);

        //=======LVL 4==============
        root = insert(root , 75);

        List<Integer> li = inOrderUsingList(root);
        System.out.println(li);

        System.out.println(kSmallest(root , 3));
        System.out.println(kLargest(root , 3));

//        kSmallestByPI(root,3);

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

//    static ArrayList<Integer> inOrderUsingList(Node root){
//        return inOrderUsingList(root , new ArrayList<>());
//    }
    private static List<Integer> inOrderUsingList(Node root){
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private static void inorderTraversal(Node node, List<Integer> result) {
        if (node == null) return;
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
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

    public static int floor(Node root , int val){
        if(root.left == null && root.right == null){
            if(root.val <= val) return root.val;
            else return 0;
        }
        if(root.val<val){
            int cv = root.val;
            int rA = floor(root.right,val);
//            if(cv<= val && rA != val){
//                return Math.max(cv,rA);
//            } else if (cv<= val && rA == val) {
//                return cv;
//            }
//            else return rA;
            if(cv<=val){
                return Math.max(cv,rA);
            }
            else return rA;

        }
        else if(root.val > val){
            int cv = root.val;
            int lA = floor(root.left,val);
//            if(cv<=val && lA != val){
//                return Math.max(cv,lA);
//            } else if (cv<=val && lA == val) {
//                return cv;
//            }
//            return lA;
            if(cv<=val){
                return Math.max(cv,lA);
            }
            else return lA;
        }
        else{
            return root.val;
        }

//        return root.val;
    }

    public static int ceil(Node root, int val){
        if(root.left == null && root.right == null){
            if(root.val <= val) return val;
            else return root.val;
        }
        if(root.val<val){
            int cv = root.val;
            int rA = floor(root.right,val);
            if(cv>=val && cv<rA){
                return cv;
            }
            return rA;

        }
        else if(root.val > val){
            int cv = root.val;
            int lA = floor(root.left,val);
//            if(cv<=val){
//                return lA;
//            }
            if(cv>=val && cv < lA){
                return cv;
            }
            return lA;
        }
        else{
            return root.val;
        }
    }

    static int kSmallest(Node root , int k){
        List<Integer>list = inOrderUsingList(root);
        return list.get(k-1);
    }
    static void kSmallestByPI(Node root , int k){
//        int ans = 0;
        if(root == null) return;
        kSmallestByPI(root.left ,k);
        k--;
        if(k==0) System.out.println(root.val);
        else kSmallestByPI(root,k);
//        return ans;
    }


    static int kLargest(Node root , int k){
        List<Integer>list = inOrderUsingList(root);
        k = list.size()-k;
        return list.get(k);
    }
}
