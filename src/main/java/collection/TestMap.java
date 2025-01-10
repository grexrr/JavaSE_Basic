package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestMap {
    public static void main(String[] args) {
        /*
        1. HashMap
            - orderless (LinkedHashMap is ordered)
            - methods are synchronized
            - not thread safely
            - use iterator
            - allows null for key or value
            - higher performance
        */
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("one", 1);
        hashmap.put("two", 2);
        hashmap.put("three", 3);
        hashmap.put(null, null); // hashmap allows null for key or value
        System.out.println("HashMap");
        System.out.println(hashmap);

        /*
        2. HashTable
            - orderless (according to its hash value)
            - key methods are synchronized
            - thread safely
            - use enumerator
            - null not allowed
            - slower performance
        */

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("one", 1);
        hashtable.put("two", 2);
        hashtable.put("three", 3);
        // hashtable.put(null, null); // NullPointerException
        System.out.println("\nHashTable");
        System.out.println(hashtable);
    }
}
