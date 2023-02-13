package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        // groceriesList[2] = "Oranges"; // CANNOT update with ArrayList directly

        groceriesList.set(2, "Oranges"); // replaces element at index 2

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");
            // adds new element to index 2 and shifts the list increasing its
            // size by 1

        System.out.println(groceriesList);

        groceriesList.remove(0); // removes element at index 0

        System.out.println(groceriesList);

        groceriesList.remove("Paper Towels");
            // removes String object "Paper Towels"

        System.out.println(groceriesList);
        System.out.println("---------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(0); // removes object at index 0
        // removes specified object OR object at specified index #
        boolean r1 = numbers.remove(Integer.valueOf(20));
        //Integer.valueOf() wraps int as an object
        // boolean checks if removal was successful

        System.out.println(numbers);
        System.out.println(r1);
        System.out.println("---------------------------------------");

        numbers.clear(); // clears all elements
        numbers.size(); // 0

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println("---------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl")); // 0
        System.out.println(names.lastIndexOf("Vasyl")); // 1

        System.out.println(names.lastIndexOf("Sumeye")); // 5

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);
        System.out.println("---------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1 == list2);
        // true - 2 variables referencing to the same object (list)

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
            // 2 different objects

        l1.add(10);

        System.out.println(l1);
        System.out.println(l2); // still empty

        System.out.println(l1 == l2); // false

        l2.add(10);
        System.out.println(l1.equals(l2));
        // true - still different objects but contain same elements

        System.out.println("---------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));
        // false - have to have same elements in the SAME ORDER (sort())

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty());
    }
}
