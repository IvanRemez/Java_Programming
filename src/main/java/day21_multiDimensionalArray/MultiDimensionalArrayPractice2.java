package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {

// index of elements:     0   1   2      0   1   2   3   4     0    1
        int[][] arr2D = {{10, 20, 30,}, {40, 50, 60, 70, 80}, {90, 100}};
// index of 1D array:          0                  1                2

        for (int i = 0; i < arr2D.length; i++) {
            // arr2D length = # of 1D arrays inside = 3

            int[] each1D = arr2D[i]; // can assign variable to each 1D array
            System.out.println(Arrays.toString(each1D));
            // prints each 1D array in a new line

            for (int j = 0; j < each1D.length; j++) {
                // to get each element inside each 1D array

                 int eachElement = each1D[j];

                System.out.println(eachElement); // prints each element
            }
        }
        System.out.println("-----------------------------------");

        // For Each Loop easier way to iterate Arrays if there is no order or
        // element manipulation (ex. reverse) needed:

        for (int[] each1DArray : arr2D) { // iterates each 1D array
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement:each1DArray) {

                System.out.println(eachElement);
            }
        }
        System.out.println("-----------------------------------");

        // shortcut: arr2D.forr (for reverse)
        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.println(arr2D[i][j]);
                // prints all elements in reverse order
            }
        }
        System.out.println("-----------------------------------");

        for (int[] each1DArray : arr2D) {      // shortcut - arr2D.for (for each)

            for (int eachElement : each1DArray) {
                // using For Each loop to iterate each element of the arrays

                System.out.println(eachElement);
            }
        }

    }
}
