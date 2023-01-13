package leetCode;

import java.util.Scanner;
import java.util.*;

public class LinkList {
    public static Node head = null;
    static Scanner scan = null;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        LinkList l1 = new LinkList();
        System.out.println("Enter the length of the link list: ");
        int length = scan.nextInt();
        l1.insertNode(length);
        l1.printLL();
        l1.reverseLL(head);
        l1.printLL();
    }


    public void insertNode(int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.print("Enter the data: ");
            int data = scan.nextInt();
            Node temp = new Node(data);
            if(head == null) head = new Node(data);
            else{
                Node temp2 = head;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }
                temp2.next = temp;
            }
        }
    }

    public void printLL() {
        Node temp = head;
        System.out.print("The Link list is : ");
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public Node reverseLL(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = next;
            head = prev;
        }

        return prev;
    }

    static class Node {
        int data;
        Node next;

        Node(int num) {
            this.data = num;
            this.next = null;
        }


    }

}