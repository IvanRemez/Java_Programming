package day10_string;

import java.util.Scanner;
/*
import java.lang.System;
import java.lang.String;
         ^^ both of these are imported implicitly
 */

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        input.close();

        System.out.println("---------------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";
        /*
        Only 2 objects "Cat" and "Dog" are created in the String Pool
        Duplicates of "Cat" (s3 and s4) reference the original "Cat" object
            in String Pool
         */
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println("---------------------------");

        String str1 = new String("Java"); // Creates 2 objects 1. String Pool, 2. in Heap (outside string)
        String str2 = new String("Java"); // same text but different objects

        System.out.println(str1 == str2); // 2 NEW objects so FALSE

        System.out.println("---------------------------");

        String t1 = "Python"; // INSIDE String Pool
        String t2 = new String("Python"); // OUTSIDE String Pool, in Heap
        String t3 = new String("Python"); // adds another "Python" object outside of Pool

        System.out.println(t1 == t2);
        System.out.println(t2 == t3); // both OUTSIDE Pool but 2 separate objects

    }
}
