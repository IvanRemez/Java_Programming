package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};

        // Index #s:           0                1                 2        3
        int[][] arr2D = {{10, 20, 30,}, {40, 50, 60, 70, 80}, {90, 100}, arr4};
        // can input either the actual elements ^^ or array variable name ^^
        // 2D array index # is 0 - 3. (each 1D array has an index #)

        System.out.println(arr2D.length);
        System.out.println("-----------------------------------");

        System.out.println(Arrays.toString(arr2D[1])); // prints array at index 1
        System.out.println(Arrays.toString(arr2D[3]));
        System.out.println("-----------------------------------");

        System.out.println(arr2D[2][0]); // prints element 0 (90) inside array 2
        System.out.println(arr2D[1][2]); // element 2 (60) inside array 1

    }
}
