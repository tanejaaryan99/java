package Arrays;
import java.util.Scanner;
public class introToArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;

//        for (int i = 0; i < 10; i++) {
//            sum+=i;
//            arr[i] = sum;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }

        //taking user input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr);

    }

}
