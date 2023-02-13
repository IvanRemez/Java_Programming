package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 20;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven); // 20 % 2 == 0 therefore true

        // boolean isOdd = number % 2 != 0;
        // System.out.println(isOdd); // false

        boolean isOdd = !isEven; // If the number is not even, then it's odd

        System.out.println(number + " is an even number: " + isEven);
        // true
        System.out.println(number + " is an odd number: " + isOdd);
        // false

    }
}

/*
Warmup task:
	1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */