package day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;
        // 3 variables referencing to the original object arr1

        arr1[0] = 1000; // element at index 0 is updated for all variables
                        // referencing the original arr1 variable
        arr2[2] = 3000; // also updated for all 3

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        String[] a1 = {"Umran", "Mehmet"}; // eligible for GC

        a1 = new String[]{"James", "Daniel"}; // new elements overwrite the old ones

        // variables CANNOT reference to multiple objects - new names are a new object
        // BUT
        // one object can have multiple reference variables
            // modifying object for one variable modifies it for the rest

        System.out.println(Arrays.toString(a1));

    }
}
