package Lec1;

import java.util.Scanner;

public class Prime {
    public static void checkPrime(int n){
//        System.out.println(n);
        int flag = 1;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                flag = 0;
            }
        }

        if(flag == 0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }


    public static void main(String[] args) {
//        System.out.print("Hello world!");
//        System.out.println("Hell");
//        java.util.Scanner sc = new Scanner(System.in);  //One way of importing java.util
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(val);
//        checkPrime(val);


    }
}
