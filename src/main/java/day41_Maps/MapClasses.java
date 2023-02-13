package day41_Maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
            // random order, accepts 1 null key & null values

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
            // insertion order, accepts 1 null key & null values

        Map<String, Integer> treeMap = new TreeMap<>();
            // sorted (ascending) order, NO null key BUT accepts null values

        Map<String, Integer> hashtable = new Hashtable<>();
            // random order, NO null key OR values, Synchronized

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000); // NO duplicates - it would update salary
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000); // only 1 null key accepted

        System.out.println("hashMap = " + hashMap);

        System.out.println("--------------------------------------------------------------------");

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("--------------------------------------------------------------------");

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);  // Value CAN be null in treeMap
        treeMap.put("Breanna", null);
        // treeMap.put(null, 120000); // Key CANNOT be null in treeMap
        //   treeMap.put(null, 110000);
        //   treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("--------------------------------------------------------------------");

        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); Value in Hashtable can not be null
        // hashtable.put("Breanna", null); Value in Hashtable can not be null
        // hashtable.put(null, 120000); Key in Hashtable can not be null
        // hashtable.put(null, 110000); Key in Hashtable can not be null

        try{
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashtable = " + hashtable);

    }
}
/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */