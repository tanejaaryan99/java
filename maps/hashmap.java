package maps;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer , Boolean>map = new HashMap();
        map.put(1,true);
        map.put(2,false);
        map.put(3,true);
        map.put(4,true);
        System.out.println(map);
        Boolean val = map.get(true);
        System.out.println(val);
        val = false;
        map.put(10,val);
        System.out.println(map);
//        map.put(10, map.getOrDefault(10,0)+1);
        System.out.println(map);
    }
}
