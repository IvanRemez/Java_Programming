package day11_string2;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first sentence: ");
        String in1 = input.nextLine();

        System.out.println("Enter second sentence: ");
        String in2 = input.nextLine();

        //int length = in1.length(),
                //in2.length() = in2.length();

        if (in1.length() > in2.length()){
            System.out.println(in1);
        } else if (in2.length() > in1.length()) {
            System.out.println(in2);
        }else {
            System.out.println("Equal");
        }


        input.close();
    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			        if both have the same number of characters then print "Equal"
 */