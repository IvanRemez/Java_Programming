package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        char firstChar = str.charAt(0); // 1st character of "Cydeo" = 'C'
        char secondChar = str.charAt(1); // 2nd char
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        /*
        char sixthChar = str.charAt(5);
            error when index number doesn't exist in Heap
        char negChar = str.charAt(-25);
            can never have NEGATIVE index numbers
        */

        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(fourthChar);
        System.out.println(fifthChar);

        System.out.println("---------------------------");

        String sentence = "Java Programming Language";
        int length = sentence.length();
        System.out.println(length); // length is 25 characters

        int lastIndex = length - 1;
        System.out.println(lastIndex);
        System.out.println("---------------------------");

        String s1 = "Wooden Spoon";

        char f = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char l = s1.charAt(lastIndexNum);

        System.out.println(f + " : " + l);
        System.out.println("---------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");
        System.out.println(name1 == name2);
        // same literal (text) but 2 different objects = false
        System.out.println(name1.equals(name2));
        // compares the literals (text) so = true
        System.out.println("---------------------------");

        String r1 = "Java";
        String r2 = "Java";
            // both same object in the Pool

        String r3 = new String("Java");
            // new object outside the Pool

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3); // false

        System.out.println(r1.equals(r3));
            // compares literals (text) so = true
        System.out.println(r2.equals(r3)); // true
        System.out.println("---------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

        input.close();

    }
}
