package day14_forLoop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";
        //            0123
        // reverse string = "avaJ"

        String reverse = ""; // "avaJ"

        /*for (int i = 3; i >= 0; i--) {
            // only works when you know the String length

            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("-----------------------------------");

         */

        for (int i = str.length() - 1; i >= 0; i--) {
            // this works for any length of String

            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("-----------------------------------");

        String name = "Ermek Keneshbekovich Apazov";

        String result = reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
