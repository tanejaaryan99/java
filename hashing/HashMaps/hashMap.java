package hashing.HashMaps;

import java.util.*;


public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1,"Hello");
        hm.put(2,"there");
        hm.put(3,"mate");
        System.out.println(hm);

        for(Map.Entry<Integer, String> ent : hm.entrySet()){
            System.out.println(ent.getKey() + " " + ent.getValue());
        }

        if(hm.containsKey(1)) System.out.println(hm.get(1));

        hm.remove(1);
        if(hm.containsKey(1)) System.out.println(hm.get(1));
        else System.out.println("Nhi mili bhai");

    }


}
