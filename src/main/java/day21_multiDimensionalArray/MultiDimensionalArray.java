package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2}, {3, 4, 5}};
        int[][] arr2D2 = {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        int[][] arr2D3 = {{15, 16, 17, 18}};

        //  2D array index:   0         1              0           1           2                0
        // element index:    0  1    0  1  2      0  1  2  3    0   1     0   1   2       0   1   2   3
        int[][][] arr3D = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};
        //  3D array index:         0                              1                            2


        // indexes of arr3D:
        // [index of 2D array][index of 1D array][index of elements]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1])); // 2D array at index 1

        System.out.println(Arrays.toString(arr3D[0][1]));
                                    // 1D array at index 1, inside 2D array at index 0

        System.out.println(Arrays.toString(arr3D[1][0]));
                                    // 1D array at index 0, inside 2D array at index 1

        System.out.println(arr3D[1][2][2]); // 14
        // element (14) at index 2, inside 1D array at index 2, inside 2D array at index 1

        System.out.println(arr3D[2][0][2]); // 17
        // element (17) at index 2, inside 1D array at index 0, inside 2D array at index 2

        System.out.println("-----------------------------------");

        for (int i = 0; i < arr3D.length; i++) { // arr3D.fori
            // i: index # of each 2D array

            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // each2DArray.fori
                // j: index # of each 1D array

                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // each1DArray.fori
                    // k: index # of each element inside 1D array

                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }
            }
        }
    }
}
