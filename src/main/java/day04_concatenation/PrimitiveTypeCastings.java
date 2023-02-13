package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // -------Implicit Casting----------

        byte a = 15;
        short b = a;
        // short b = (short)a; < what's happening in the background

        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000L;
        // automatically assigned to int
        // need to add L at the end of data to assign it to long

        // -------Explicit Casting----------

        int x = 100;
        byte y = (byte)x;

        float z = 20.8F;
        short q = (short)z; // z = 20.8

        System.out.println(q); // short will only give you the integer and drop the decimal

        double n1 = 2.5;
        byte n2 = (byte) n1; // n1 = 2.5;
        System.out.println(n2);
        System.out.println("-----------------------------------");

        int num = 500;
        byte result = (byte) num; // explicit casting
        System.out.println(result); // byte cannot have 500

        int r = 50000;
        short t = (short) r; // cast to short but short cannot contain such large data
        System.out.println(t);

        double u = 3000.5;
        int p = (int) u; // explicit casting
        System.out.println(p);

        int o = 100;
        double d1 = o; // implicit casting - smaller to larger
        System.out.println(d1);

    }
}
