package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); // "321"
            // Concatenation NOT Addition due to String inclusion

        System.out.println(7 + "1"); // "71"
        System.out.println("13" + "2"); // "132"
            // still Concatenation
        System.out.println("------------------------------------");

        System.out.println(12 + 2.5); // 14.5
            // Addition - only happens when there are numbers on both sides
        System.out.println("------------------------------------");

        System.out.println("The value is " + true);

    }
}
