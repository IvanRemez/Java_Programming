package day14_forLoop;

public class OverLoadingMainMethod {

    public static void main(String[] args) {

        System.out.println("A");   // Java only runs the original main method

       /* main(25);
        main(2.05);
        main(true);

        */
    }

    public static void main(int[] args) {

        System.out.println("B");   // Java will not run these
    }

    public static void main(double[] args) {

        System.out.println("C");
    }

    public static void main(boolean[] args) {

        System.out.println("D");
    }

}
