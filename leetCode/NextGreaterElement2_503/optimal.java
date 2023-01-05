package leetCode.NextGreaterElement2_503;

import java.util.Scanner;
import java.util.Stack;

public class optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer>s = new Stack();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]>arr[s.peek()]){
                int indx = s.pop();
                arr[indx] = arr[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int idx = s.pop();
            arr[idx] = -1;
        }
        for (int val:arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
