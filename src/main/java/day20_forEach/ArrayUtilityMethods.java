package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        //toString method converting Array to a String
        String result = Arrays.toString(score);

        System.out.println(result);
        System.out.println("---------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);
        // elements AND order MUST be the same

        System.out.println(r1); // true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2); // order NOT the same = false

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2));
        System.out.println("---------------------------------");

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // sorts elements in ASCENDING order

        //Sort Method NOT allowed in INTERVIEWS**
        //will be asked to use a LOOP to sort - to see your logic

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        System.out.println("---------------------------------");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2); // {A, B, C}

        System.out.println(Arrays.equals(b1, b2)); // sorted = true
        System.out.println("---------------------------------");

        String[] students = {"Yaxier", "Madivar", "Ali", "Abidullah",
                "Alena"};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
        System.out.println("---------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.copyOf(array, 4);
        // 1st 4 elements copied

        System.out.println(Arrays.toString(array2));
        System.out.println("---------------------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        System.out.println(Arrays.toString(n3));

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {

            // i used for remaining elements in n3,
            //      j used for copying n2 to these remaining spots
            // as i iterates through n2, it's values are assigned to j,
            // which then adds them to the remaining spots in n3

            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));
        System.out.println("---------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index:     0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 20);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 4);
            // excludes ending index (same as substring method)

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
                                // copies from index 2 to the end
                    // ending index excluded which is why we use .length

        System.out.println(Arrays.toString(result3));



    }
}
