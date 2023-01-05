package HackerBlocks.IncreasingAndDec;

import java.util.Scanner;

public class usingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sol(arr));
    }
    public static boolean sol(int arr[]){
        int n = arr.length;
        int start = 0;
        while(start<n-1){
            if(arr[start]>arr[start+1]){
                start++;
            }
            else{
                break;
            }
        }
        start +=1;
        while(start<n-1){
            if(arr[start]>=arr[start+1]){
                return false;
            }
            start++;
        }
        return true;
    }
}
