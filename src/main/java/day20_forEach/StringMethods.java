package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School"; // [C, y, d, e, o,  , S, c, h, o, o, l]

        char[] ch = str.replace(" ", "").toCharArray();
                       // ^^ gets rid of the empty space

        System.out.println(Arrays.toString(ch));
        System.out.println("-------------------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" ");
                            // ^^ splits string into single word elements using space indicator
                    // you can split a string any way you want

        System.out.println(Arrays.toString(words));
        System.out.println("-------------------------------------------");

        String sentence = "I love Java";

        sentence.split(" "); // [I, love, Java]

        // reverse to -> "Java love I"

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr)); // [Java, love, I]

        String reversedSentence = ""; // "Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence);
    }
}
