package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("---------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice",
                "Orange", "Strawberry", "Blueberry", "Paper towels"));
        System.out.println(items);

        Collections.sort(items);

        System.out.println(items);
        System.out.println("---------------------------------------");

        Collections.reverse(items);

        System.out.println(items);
        System.out.println("---------------------------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeeList);

        Collections.swap(employeeList, 0, 1);
                                       // 1st and 2nd element swapped
        System.out.println(employeeList);

        Collections.swap(employeeList, 0, employeeList.size() - 1);
                                        // 1st and last element swapped
        System.out.println(employeeList);

    }
}
