package day13_customMethods2;

public class ReturnMethodsPractice {

    public static boolean isOdd(int num){
        return (num % 2 != 0) ? true : false;
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int max(int n1, int n2){
        return (n1 > n2) ? n1 : n2;
    }

    public static int min(int n1, int n2){
        // return (n1 < n2) ? n1 : n2;              // Ternary
        if (n1 < n2){
            return n1;                              // If statement
        }else {
            return n2;
        }
    }

    public static void main(String[] args) {

        System.out.println(isOdd(5)); // odd - true

        System.out.println(isEven(5));

        System.out.println(max(6, 5));

        System.out.println(min(100, 50));

    }
}
/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers
 */