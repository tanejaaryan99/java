package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArray(arr));
        System.out.println(kadanesAlgo(arr));
    }
    public static int maxSubArray(int arr[]) {
//        System.out.println("Hello");
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int kadanesAlgo(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = sum>max ? sum : max;
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

    public static int revKadanesAlgo(int arr[]){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            min = sum<min ? sum : min;
            if(sum>=0){
                sum = 0;
            }
        }
        return min;
    }

    public static int arraySum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
