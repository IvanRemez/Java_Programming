package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number > 0, // if # is > 0 = Positive
                isNegative = number < 0, // if # is < 0 = Negative
                isZero = number == 0; // if # = 0 then it's 0
        // boolean isZero = !isPositive && !isNegative;
        // if # is NOT Positive AND it's NOT Negative, then it's 0

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}

/*
	2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */