package leetCode.BookAllocationProb;


public class optimal {
    public static boolean isPossible(int arr[],int mid,int nos) {

        int count=1;
        int sum=0;

        for(int i=0;i<arr.length;i++) {
            if(sum+arr[i]<=mid && arr[i]<= mid) {
                sum+=arr[i];
            }
            else {
                count++;
                sum=arr[i];
                if(count>nos|| arr[i]>mid) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]){

        int arr[]= {12,34,67,90};
        int noofStudent=2;
        int low=0;
        int val=0;

        for(int i=0;i<arr.length;i++) {
            val+=arr[i];
        }
        int high=val;
        int ans=-1;

        while(low<=high) {
            int mid=low+(high-low)/2;
            if(isPossible(arr,mid,noofStudent)) {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.print(ans);
    }
}
