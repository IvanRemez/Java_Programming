package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // assume that 1st element is the max # - 100

        for (int i = 1; i < numbers.length; i++) { // i =  1, 2, 3, 4, 5

            if (numbers[i] > max) { // compares each element of Array with current max #
                max = numbers[i]; // if current element is larger than max - reassign new max
            }
        }

        System.out.println("max = " + max);
    }
}
