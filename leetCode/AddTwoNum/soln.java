package leetCode.AddTwoNum;

public class soln {
//     Definition for singly-linked list.
     public class ListNode {
         ListNode next;
         int val;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
        ListNode head = null;
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return sol(l1,l2);
        }

        public ListNode sol(ListNode l1 , ListNode l2){
            int num1 = 1;
            int num2 = 1;
            ListNode temp = l1;
            while(temp != null){
                num1 = num1*10 + temp.val;
                temp = temp.next;
            }
            temp = l2;
            while(temp != null){
                num2 = num2*10 + temp.val;
                temp = temp.next;
            }

            int ans = num1+num2;
            while(ans != 0){
                ListNode head = addfirst(ans%10);
                ans = ans/10;
            }
            return head;
        }
        public ListNode addfirst(int data){
            if(head == null){
                ListNode n = new ListNode();
                n.val = data;
                head= n;
            }
            else{
                ListNode n = new ListNode();
                n.val = data;
                n.next = head;
                head = n;
            }

            return head;
        }
    }
