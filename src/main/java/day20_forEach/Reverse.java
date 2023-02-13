package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            // original (array) is iterated in reverse and elements assigned to new array (reverse)
            // as i goes down to index 0, j starts at index 0 and goes up
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));
        System.out.println("-------------------------------------------");

        int[] nums = {100, 200, 300, 400, 500};

        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------------------------------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));
    }
}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};
	        output:
	            reversedArray = {5,4,3,2,1};
 */