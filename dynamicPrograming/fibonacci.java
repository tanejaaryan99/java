package dynamicPrograming;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(byRecursion(n));
        System.out.println(byTopDown(0,n , new int[n]));
        System.out.println(byBottomUp(n));
    }

    public static int byRecursion(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return byRecursion(n - 1) + byRecursion(n - 2);
    }

    public static int byTopDown(int str ,int n , int arr[]) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(arr[str] != 0) return arr[str];
        int k = byTopDown(str+1 ,n - 1 , arr) + byTopDown(str+2 ,n - 2 ,arr);
        arr[str] =  k;
        return k;
    }

    public static int byBottomUp(int n) {
        int t1 = 0;
        int t2 = 1;
        int k = 0;
        for(int i = 2; i <= n; i++) {
            k = t1+t2;
            t1 = t2;
            t2 = k;
        }
        return k;
    }
}
