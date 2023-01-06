package SirViva;

import java.util.HashMap;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
//        int array[] = {2,2,1,1,0,0,2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int count[] = {0,0,0};
        for(int i = 0;i<array.length;i++){
            if(array[i] == 0){
                count[0]++;
            }
            if(array[i] == 1){
                count[1]++;
            }
            if(array[i] == 2) {
                count[2]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i]+" ");
        }
        System.out.println();
        int i = 0;
        for(int j = 0;j<count[0];j++){
            array[i] = 0;
            i++;
        }
//        i -=1;
        for(int j = 0;j<count[1];j++){
            array[i] = 1;
            i++;
        }
//        i-=1;
        for(int j = 0;j<count[2];j++){
            array[i]=2;
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
        System.out.println();

    }

}
