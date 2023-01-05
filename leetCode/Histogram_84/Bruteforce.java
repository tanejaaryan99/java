package leetCode.Histogram_84;

public class Bruteforce {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            return sol(heights);
        }

        public int sol(int arr[]){
            int ans = Integer.MIN_VALUE;
            for(int i = 0;i<arr.length;i++){
                int lidx = left(arr,i-1,arr[i]);
                int ridx = right(arr,i+1,arr[i]);
                int lg = i-lidx;
                int rg = ridx-i;
                int gap = lg+rg-1;
                ans = Math.max(ans,gap*arr[i]);
            }
            return ans;
        }

        public int left(int arr[] , int idx,int val){
            for(int i = idx;i>=0;i--){
                if(arr[i]<val){
                    return i;
                }
            }

            return -1;
        }
        public int right(int arr[] , int idx,int val){
            for(int i = idx;i<arr.length;i++){
                if(arr[i]<val){
                    return i;
                }
            }

            return arr.length;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
//        arr = [2,1,5,6,2,3];
    }
}
