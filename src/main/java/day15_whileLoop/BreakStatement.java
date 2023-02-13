package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6){    // when i reaches 6, it exits the loop
                break;
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (char i = 'A'; i <= 'Z'; i++){

            System.out.println(i);

            if (i == 'J'){
                System.out.println("Loop is terminated");
                break;
            }
        }
        System.out.println("-----------------------------------");

        for (;;){
            System.out.println("Hello World");
            break;  // terminates infinite loop after first printing
        }
    }
}
