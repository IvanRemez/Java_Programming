package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------------");

        for (int each: numbers) {

            if (each == 30){      // can use continue OR break in ANY loop
                continue;
            }


            System.out.println(each);
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < 10; i++) {

        }
    }
}
