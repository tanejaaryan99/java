package dynamicPrograming;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(byRecursion(n));
        System.out.println(byTopDown(0,n , new long[n]));
//        System.out.println(byBottomUp(n));
    }

    public static long byRecursion(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return (long)byRecursion(n - 1) + (long)byRecursion(n - 2);
    }

    public static long byTopDown(int str ,int n , long arr[]) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(arr[str] != 0) return arr[str];
        long k = byTopDown(str+1 ,n - 1 , arr) + byTopDown(str+2 ,n - 2 ,arr);
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
