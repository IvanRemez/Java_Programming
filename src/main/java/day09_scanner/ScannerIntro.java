package day09_scanner;

import java.util.Scanner; // added automatically

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* once you type Scanner and hit Return the util will be automatically
        imported and code added at the top ^^^
         */

        System.out.println("Enter a number: ");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        long num4 = input.nextLong();

        input.close(); // Scanner is closed, cannot read user inputs again

        /*
        System.out.println("Enter your fifth number: ");
        int num5 = input.nextInt();

        Scanner is closed at line 30; therefore, cannot read any more inputs
         */


        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);


    }

}