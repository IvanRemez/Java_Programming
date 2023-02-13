package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        // copies original array and adds an extra space to contain the new element

        new_array[new_array.length - 1] = element;
        // assigns element to the last element space in new_array

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers, 50);
        // uses custom addElement method to add extra element to the array

        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------");

        double[] nums = {1.2, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);
        nums = ArraysUtility.addElement(nums, 6.5);
        nums = ArraysUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------");

        String[] names = {"Yasin", "Sumeye", "Ermek"};

        names = ArraysUtility.addElement(names, "Umran");
        names = ArraysUtility.addElement(names, "Ivan");
        names = ArraysUtility.addElement(names, "Muhtar");


        System.out.println(Arrays.toString(names));


    }
}
