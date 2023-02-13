package day40_Collections2;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);

        System.out.println(((ArrayList) collection).get(2));
        // Down casted to ArrayList in order to use its get() method

        // System.out.println(((Stack)collection).pop());
        // ClassCastException b/c Stack does NOT have IS A relation with ArrayList

        System.out.println("------------------------------------------------");

        Collection<Integer> collection1 = new HashSet<>();

        collection1.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection1); // HashSet removes duplicates, random order

        // System.out.println(((ArrayList)collection1).get(4));
        // ClassCastException b/c HashSet does NOT have IS A relation with ArrayList

        System.out.println(new ArrayList<>(collection1).get(4));
        // OR
        List<Integer> l = new ArrayList<>(collection1); // if need to reuse

        // new ArrayList created using collection1 as the object -> can use get() method


    }
}
