package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names);

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)){
                continue; // if list already contains element, skip iteration
            }
            nonDup.add(each);
        }

        names = nonDup; // reassignment makes original arrayList eligible for GC

        System.out.println(names);
    }
}
