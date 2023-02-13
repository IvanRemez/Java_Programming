package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 4){    // continue -> skips 4 and continues loop
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        for (int i = 10; i <= 20; i++) {

            if (i % 2 == 0){    // if i is EVEN, skip to next i
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        for (char i = 'A'; i <= 'G'; i++){

            if (i == 'B' || i == 'E') {  // if i = 'B' or 'E', skip to next i
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------------");

        // find the sum of all EVEN numbers between 50 - 100

        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 50, 52, 54, 56 ....... 100

        for (int i = 50; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 50;

        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0){    // if i is ODD
                continue;    // skip it
            }
            sum += i;       // sum of all EVEN numbers between 50 - 100
        }
        System.out.println(sum);
    }
}
