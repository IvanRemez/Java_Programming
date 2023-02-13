package day22_arrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "Java";


        int a1 = 10;
        Integer a2 = 10; // wraps 10 prim into an object (wrapper class)

        System.out.println("--------------------------------------------");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;
        // no errors due to implicit casting

        Integer b2 = b1; // Autoboxing - b1 int is wrapped into an object of Integer class
        /*
        Long b3 = b1;
        Double b4 = b1;
        compile errors because when converting the Wrapper class MUST match the prim class
         */

        char ch = 'A';
        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;
        Double d2 = d1; // Autoboxing
        System.out.println("--------------------------------------------");

        Integer n1 = 20;

        int n2 = n1; // Unboxing

        // long n3 = n1;
        // double n4 = n1;
        // implicitly casts to the new prim class so no errors but NOT best practice

        Character e1 = 'Z';

        char e2 = e1; // Unboxing

        // int e3 = e1; // works but will convert Z to it's number value
        // long e4 = e1;

    }
}
