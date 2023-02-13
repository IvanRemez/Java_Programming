package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "John", "Gabriel"}; // 4 names
        String[] group2 = {"Ariel", "Jess", "Kate"}; // 3 names
        String[] group3 = {"Amy", "Andrew", "John", "Chad", "Mike"}; // 5 names
        String[] group4 = {"Katya", "Ivan"}; // 2 names

        String[][] groups = {group1, group2, group3, group4};
        // index #s:            0       1       2       3

        // For Each Loop
        for (String[] eachGroup : groups) { // gets each group (1D array)

            System.out.println(Arrays.toString(eachGroup));
            for (String eachName : eachGroup) {
                // gets each element (name) within each group (1D array)

                System.out.println(eachName);
            }
        }
        System.out.println("-----------------------------------");

        // For Loop
        for (int i = 0; i < groups.length; i++) { // i = each group

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) { // j = each name

                String eachName = eachGroup[j];
                System.out.println(eachName);
            }
        }
        System.out.println("-----------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            // reverse order of the groups (3 -> 0)

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) { // for Each in order

                System.out.println(eachStudent);
            }
        }
        System.out.println("-----------------------------------");

        System.out.println(Arrays.toString(groups));
        // toString() method ONLY for 1D arrays

        System.out.println(Arrays.deepToString(groups));
        // deepToString() method used for 2D arrays
    }
}
