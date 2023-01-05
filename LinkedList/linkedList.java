package LinkedList;

import java.util.Stack;

public class linkedList {
        class Node {
            int val;
            Node next;
        }

        private Node head;
        private Node tail;
        int size = 0;


    public int sizes(){
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
        void addFirst(int val){
            Node nn = new Node();
            nn.val = val;
            if(head == null && tail == null){
                head = nn;
                tail = nn;
            }
            else {
                nn.next = head;
                head = nn;
            }
            size++;

        }

        void addLast(int val){
            Node nn = new Node();
            nn.val = val;
            if(head == null && tail == null){
                head = nn;
                tail = nn;
            }
            else{
                tail.next = nn;
                tail = nn;
            }
            size++;
        }
        void getAt(int index){
            int a = 0;
            Node temp = head;
            while(temp != null){

            }
        }

        void insertAtK(int index){
            Node temp = head;


        }

        void popFirst(){
            Node temp = head;
            head = head.next;
//        delete head;
            size--;
        }
        void popLast(){
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }


        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
            System.out.println("size = " + size);
        }

        public void reverse() {
            Node temp = head;
            Stack<Node> s = new Stack();
            while (temp != null) {
                s.push(temp);
                temp = temp.next;
            }
            temp = head;
            while (!s.isEmpty()) {
                Node rem = s.pop();
                int val = temp.val;
                temp.val = rem.val;
                rem.val = val;
                temp = temp.next;
                if (temp.next == rem || temp == rem) {
                    break;
                }
            }
        }
        public void reverseUsingRec(){
            reverseUsingRec(head,head,0);
        }
        private Node reverseUsingRec(Node root, Node head , int cnt){
            if(root == null){
                return head;
            }
            Node rem = reverseUsingRec(root.next , head , cnt+1);
            if(cnt>sizes()/2){
                int temp = rem.val;
                rem.val = root.val;
                root.val = temp;
            }
            return rem.next;
        }
        public void foldRecursive(){
            foldRecursive(head, head,0);
        }
        private Node foldRecursive(Node root, Node head, int cnt){
            if(root == null){
                return head;
            }
            Node res = foldRecursive(root.next,head,cnt+1);
            if(cnt > sizes()/2){
                Node temp = res.next;
                root.next = root;
                return temp;
            }
            if(cnt == sizes()/2){
                root.next = null;
                return null;
            }
            return root;
        }
        public void foldItrative(){
            Stack<Node> s = new Stack();
            Node temp = head;
            while(temp != null){
                s.push(temp);
                temp = temp.next;
            }
            temp = head;
            int size = sizes();
            int cnt = size-1;
            while(temp != null){
                Node res = s.pop();
                Node next = temp.next;
                if(cnt>size/2){
                    temp.next = res;
                    res.next = next;
                }
                if(cnt==size/2){
                    res.next = null;
                    break;
                }
                temp = next;
                cnt--;

            }
        }


}
