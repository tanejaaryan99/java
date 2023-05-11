package hashing.HashMaps;

public class countFrequency {
    public static void main(String[] args) {
        int arr[] = {5,8,5,7,8,10};
        countFreq(arr);
    }

    //Naive approach
    static void countFreq(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            boolean flag = false;
            int cnt = 0;
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }

            if(flag == true) continue;

            for(int j = 0;j<=i;j++){
                if(arr[i] == arr[j]) cnt++;

            }
            System.out.println(arr[i] + " : " + cnt);
        }

    }
}
