package HackerBlocks.HelpRamu;

import java.util.Scanner;

public class bruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int cost[] = new int[4];
            for (int i = 0; i < 4; i++) {
                cost[i] = sc.nextInt();
            }
            int autoNos = sc.nextInt();
            int cabNos = sc.nextInt();
            int autos[] = new int[autoNos];
            int cabs[] = new int[cabNos];
            for (int i = 0; i < autoNos; i++) {
                autos[i] = sc.nextInt();
            }
            for (int i = 0; i < cabNos; i++) {
                cabs[i] = sc.nextInt();
            }
            int autoCost = 0;
            for (int i = 0; i < autoNos; i++) {
               System.out.println(autos[i]+"->");
                autoCost += Math.min((autos[i]*cost[0]) , cost[1]);
            }
            System.out.println(autoCost);
            autoCost = Math.min(cabs[2] , autoCost);

            for (int i = 0; i < 4; i++) {
                System.out.print(cost[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < autoNos; i++) {
                System.out.print(autos[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < cabNos; i++) {
                System.out.print(cabs[i]+" ");
            }
            System.out.println();
            System.out.println(autoCost);
        }
    }
}
