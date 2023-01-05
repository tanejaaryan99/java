package LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
//        ll.addFirst(60);
        ll.display();
//        ll.reverse();
//        ll.display();
//        ll.reverseUsingRec();
//        ll.display();
        ll.foldItrative();
        ll.display();
        ll.foldRecursive();
        ll.display();
    }
}
