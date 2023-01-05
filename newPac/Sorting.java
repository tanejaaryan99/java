package newPac;

import java.util.Scanner;

public class Sorting {
//    public static void bubbleSort(int array[]){
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if(array[i] < array[i+1]){
//
//                }
//            }
//        }
//    }
    public static int[] MergeTheArray(int right[] , int left[]){
        int rt = 0;
        int lt = 0;
        int size = right.length + left.length;
        int idx = 0;
        int res[] = new int[size];
        while(rt < right.length && lt < left.length){
            if(left[lt] < right[rt]){
                res[idx] = left[lt];
                idx++;
                lt++;
            }
            else{
                res[idx] = right[rt];
                idx++;
                rt++;
            }
        }
        while(rt<right.length){
            res[idx] = right[rt];
            rt++;
            idx++;
        }
        while(lt<left.length){
            res[idx] = left[lt];
            lt++;
            idx++;
        }
        return res;
    }
    public static int[] MergeSort(int array[] , int low, int high){
       if(low == high){
            return new int[]{array[low]};
       }

       int mid = (low+high)/2;
       int left[] = MergeSort(array , low, mid);
       int right[] =  MergeSort(array , mid+1, high);
       int res[] = MergeTheArray(right,left);

       return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arr = MergeSort(arr, 0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
