package day13_customMethods2;

public class ReturnMethodIntro {

    /*
    public static void sum(int n1, int n2){


        int result;
        result = n1 + n2;
    }
     */

    public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static int square(int num){           // Squared int Return Method
        int square = num * num;
        return square;
    }

    public static int cube(int num){             // Cubed int Return Method
        int cube = num * num * num;  // can also use square(num);
        return cube;
    }

    public static void main(String[] args) {

        // int total = sum(20, 40); // sum is a void method - does NOT return any data

        int total = addition(10, 20); // can store the returned data into a variable (total)

        int t = square(10);
        System.out.println(t);
        System.out.println(square(10)); // can use directly in the print statement

        System.out.println(cube(5));
    }
}
