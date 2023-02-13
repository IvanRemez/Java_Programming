package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255); // 255 forced into index 3

        // numbers.add(300, 2000); // out of bounds - CANNOT skip index #s in ArrayList

        System.out.println(numbers); // [100, 200, 300, 255, 400, 500]
        System.out.println("--------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {

            int each = numbers.get(i); // gets each element when iterating and assigns to each
            System.out.println(each);
        }
        System.out.println("--------------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {

            System.out.println(numbers.get(i));
        }
        System.out.println("--------------------------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }

    }
}
