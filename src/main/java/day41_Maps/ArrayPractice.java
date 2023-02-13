package day41_Maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));

        List<Integer>[] arrayOfLists = new List[3];
        // data type = List
            // can only add List objects to this Array

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.toString(arrayOfLists));

        // change 5 to 50

        arrayOfLists[0].set(4, 50);
            // 1st list, set index 4 (5) to 50

        System.out.println(Arrays.toString(arrayOfLists));
        System.out.println("--------------------------------------------");

        Set[] arrayOfSets = new Set[5];
        // data type = Set
            // can only add Set objects to this Array
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSets));

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));

        System.out.println(Arrays.toString(arrayOfSets));


    }
}
