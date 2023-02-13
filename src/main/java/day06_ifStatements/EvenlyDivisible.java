package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;
        boolean evenlyDivisibleBy2 = number % 2 == 0;
        // if the remainder of the number divided by 2 is equal to zero, then it's evenly divisible by 2
        boolean evenlyDivisibleBy3 = number % 3 == 0;
        // if the remainder of the number divided by 3 is equal to zero, then it's evenly divisible by 3
        boolean evenlyDivisibleBy5 = number % 5 == 0;
        // if the remainder of the number divided by 5 is equal to zero, then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + evenlyDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + evenlyDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + evenlyDivisibleBy5);



    }
}

/*
    3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */