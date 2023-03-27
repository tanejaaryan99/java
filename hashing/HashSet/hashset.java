package hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("aryan");
        hs.add("is");
        hs.add("great");
        hs.add("est");

        hs.remove("est");
        System.out.println(hs);

        System.out.println(hs.size());
//        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("Aryan"));


        for(String s : hs){
            System.out.println(s + " ");
        }

        System.out.println("");


        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " % ");
        }

        System.out.println("\n" + hs.isEmpty());

        hs.clear();

        while(it.hasNext()){
            System.out.println(it.next() + " x");
        }
    }
}
