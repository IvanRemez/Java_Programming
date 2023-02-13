package day12_customMethods;

public class CustomMethodsPractice {

    public static void eligible(int age) {
        // custom method for alcohol eligibility

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }

    public static void oddEvenZero(int num) {
        // method for odd, even, or zero

        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void maxNum(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        } else {
            System.out.println("Equal");
        }
                // custom method for maximum number between 2 numbers (or equal)
    }

     public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

         System.out.println(initial);

    }

    public static void main(String[] args) {

        eligible(21);

        oddEvenZero(5);

        maxNum(10, 5);
        maxNum(11, 11);
        maxNum(-200, -20);

        initials("Ivan", "Remez");
        initials("John", "Adams");

    }
}
