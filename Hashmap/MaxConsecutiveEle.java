package Hashmap;

import java.util.*;

public class MaxConsecutiveEle {
    public static void main(String[] args) {
        int arr[] = {1,8,7,3,4,5,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< arr.length;i++){
            map.put(arr[i],1);
        }
//        Set<Integer>keys = map.keySet();
        int ans = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int val:map.keySet()){
            if(set.contains(val)) continue;
            else{
                set.add(val);
                int cnt = 1;
                while(map.containsKey(val+1)){
                    set.add(val);
                    cnt++;
                    val++;
                }
                ans=Math.max(cnt,ans);
            }
        }
    }
}
