package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // PRE increment/decrement
        // Change AND KEEP new value in the memory IMMEDIATELY

        int x = 10;
        System.out.println(++x); //11
        System.out.println(x); // still gives you 11

        int y = 100;
        System.out.println(--y); // 99
        System.out.println(y); // new value in memory
        System.out.println("------------------------------------");

        // POST increment/decrement
        // old value used first before changing

        int a = 50;
        System.out.println(a++); // still 50
        System.out.println(a); // changed to 51
        int b = 50;
        System.out.println(b--); // still 50
        System.out.println(b); // changed to 49
        System.out.println("------------------------------------");

        int n = 30;
        int m = n++; // m = 30, n = 31
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; // q = 60, z = 59
        System.out.println("z = " + z);
        System.out.println("q = " + q);

    }
}
