package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        str = str.trim(); // removes spaces on both ends of string

        System.out.println(str);

        String[] words = str.split(" ");
        // creates Array splitting String at each empty space

        System.out.println(Arrays.toString(words));

        str = "";

        for (String each: words) {
            // For Each loop allows us to check each element of Array individually

            if (!each.isBlank()){
                str += each + " ";
            }
        }
        str = str.trim(); // removes last space added by the ^^ concatenation

        System.out.println(str);
    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "
        	Output:
        		Hello world I love Java
 */
