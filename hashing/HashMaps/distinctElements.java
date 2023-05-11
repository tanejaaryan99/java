package hashing.HashMaps;

import java.util.*;

public class distinctElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5};
        System.out.println(count(arr,5));
        System.out.println(cnt(arr));
    }

    public static int count(int []arr, int size){
        HashMap<Integer, Integer> m = new HashMap<>();
        int count = 0;
        for(int i = 0;i<size ; i++){
            if(!m.containsKey(arr[i])) {
                m.put(arr[i], 1);
                count++;
            }
        }

        return count;
    }

    public static int cnt(int []arr){
        Integer[] array = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.valueOf(i);
        }
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(array));
        Set<Integer> s = new HashSet<Integer>(al);
        return s.size();
    }
}
