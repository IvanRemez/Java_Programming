package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        // Instantiating:

        int[] numbers = new int[5]; // when elements are NOT KNOWN

        int[] nums = {10, 20, 30, 40, 50}; // when elements are KNOWN (1 - 5)
                                            // Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("---------------------------------------");

        // Element:         1          2           3            4         5          6          7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Index #s:        0          1           2            3         4          5          6

        int n = 1;

        System.out.println(days[n-1]); // index = 0 = Monday
        System.out.println("---------------------------------------");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*
        In Background:

        month = new String[12];
        month[0] = "Jan";
        ...
        month [12] = "Dec";

        ** In this case using the Array Literal {} lets you assign the elements
        without having to write out each variable
         */

        System.out.println("month = " + Arrays.toString(month));
        System.out.println("---------------------------------------");

        // int[] numbers2 = new int[100];
        // even if all elements (1 - 100) are known, Array Literal isn't always
        // the best choice
        // in this case you would need to write out every single number inside {}

        for (int i = month.length - 1; i >= 0; i--) {

            System.out.println(month[i]);
        }


    }
}
