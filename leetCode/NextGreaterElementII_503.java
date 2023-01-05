package leetCode;

import java.util.Scanner;

public class NextGreaterElementII_503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    flag = true;
                    arr[i] = arr[j];
                    break;
                }
            }
            if(flag==false){
                arr[i] = -1;
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
        for (int val:arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
