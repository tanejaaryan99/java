package Arrays;

public class MaxCirSubArr {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-2};
        int maxSubArraySum = kadanesAlgo(arr);
        int maxCirSum = arraySum(arr) - revKadanesAlgo(arr);
        int ans = maxSubArraySum>maxCirSum ? maxSubArraySum:maxCirSum;
        System.out.println(ans);
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
