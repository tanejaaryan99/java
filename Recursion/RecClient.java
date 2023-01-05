package Recursion;

import java.util.Scanner;

public class RecClient {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        int i = 0;
//        while(i<n){
//            arr[i] = sc.nextInt();
//            i++;
//        }

        int arr[] = {789,20,30,40,50,78,05,99};
        int arr1[] = {1,3,4,1,1,1,1,1,45,6,1,3};
        recursionArray ar = new recursionArray();
        System.out.println(ar.Max(arr));
//        System.out.println(ar.isPresent(arr , 100));
        ar.isPresent(arr, 78);
        System.out.println(arr1.length);
        System.out.println(ar.lastOccInArr(arr1 , 1));

    }
}
