package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data;

        // byte a = "Java";  error b/c byte ONLY accepts integer values (-128 ~ 127)
        // byte a = 20.5;  byte CANNOT take decimal numbers
        // byte a = 2000; out of byte's range (-128 ~ 127)
        byte a = 20;

        // price of the car is $17,500
        short p = 17500;
        System.out.println("p"); // variable doesn't need quotes
        System.out.println(p);

        // salary is $95,000
        int s = 95000;
        System.out.println(s);

        // int n = 999999999;
        long n = 999999999L; // need to add L after data number to use long

        // gpa is 3.5
        double gpa1 = 3.5; // preferred

        float gpa2 = 3.5F; // cannot assign larger primitive types
        // to the smaller but can assign smaller to larger
        // can assign smaller to larger value by adding F




    }
}
