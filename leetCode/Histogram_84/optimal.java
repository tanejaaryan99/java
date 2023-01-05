package leetCode.Histogram_84;

import java.util.Stack;

public class optimal {
    class Solution{
        public int largestRectangleArea(int[] heights) {
            return sol(heights);
        }
        public int sol(int arr[]){
            int left[] = new int[arr.length];
            int right[] = new int[arr.length];
            Stack<Integer>s = new Stack();
            for(int i = 0;i<arr.length;i++){
                while(!s.isEmpty()){

                }
                s.push(i);

            }
            return 0;
        }
    }
}
