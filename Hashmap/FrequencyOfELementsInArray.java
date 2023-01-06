package Hashmap;
import java.util.HashMap;

public class FrequencyOfELementsInArray {
    public static void main(String[] args) {
//        HashMap<Integer,Integer>map = new HashMap(); //hashmaps only use those keywords that has class
        //Array to map == [1,8,7,3,4,3,2]
        int []arr = {1,2,3,2,1,2,3,4,5};
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int of = map.get(arr[i]);
                map.put(arr[i],of+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

    }
}
