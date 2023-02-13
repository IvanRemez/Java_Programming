package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

    /*    for (int i = 5; i <= 10; i--){
            // (i--) is pointless here because i will keep going down into
            // the negative and, therefore, condition will never be false

            System.out.println("Hello Cydeo"); // will print infinitely

        }

     */
        for (int i = 10; i >= 5; i--) {
            System.out.println("Hello Cydeo" + i);
        }

        System.out.println("-----------------------------------");

        // sum of all numbers 1 ~ 100

        int sum = 0;

        for (int n = 1; n <= 100; n++) {
            sum += n;
        }

        System.out.println(sum);
        System.out.println("-----------------------------------");

        // print all the letters A - Z

        for (char l = 'A'; l <= 'Z'; l++) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------");

        // print all letters Z - A

        for (char l = 'Z'; l >= 'A'; l--) {
            System.out.print(l + " ");
        }

    }
}
