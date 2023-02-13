package day11_string2;

import java.util.Scanner;

public class DigitalLetterSpecialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();
        // if only one entry is required you can combine calling the Scanner and the input
        // --> String word = new Scanner(System.in).nextLine();
        //        ^^ this will also remove input function following the first input
        //           so no need for input.close();

        input.close();

        if (word.length() >= 1) { // if the word has at least 1 character

            char firstChar = word.charAt(0); // the 1st character of the word

            //if (firstChar >= 48 && firstChar <= 57){ using ASCII table #s
            if (firstChar >= '0' && firstChar <= '9') { // using literal character
                System.out.println("first character is digit");
            } else if (firstChar >= 'A' && firstChar <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (firstChar >= 'a' && firstChar <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }
        } else {     // if the word is empty
            System.out.println("String is empty");
        }


    }
}
/*
3. Create a class named DigitLetterSpecialChar and write a program that can ask
the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character
	        is uppercase letter"
	        - if the word starts with lowercase letters, print "first character
	        is lowercase letter"
	        - if the word starts with special characters, print "first character
	        is special character"
        	HINT: You need to check the ascii table
 */