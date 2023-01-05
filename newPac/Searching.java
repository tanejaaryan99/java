package newPac;

public class Searching {
    public static int LinearSearch(int[]array, int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int array[], int element){
        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid] == element){
                return mid;
            }
            else if(array[mid]>element){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,6,7,8};
        System.out.println(LinearSearch(arr,6));

        int narr[] = {1,2,3,4,6};
        System.out.println(BinarySearch(narr, 99));

    }
}
