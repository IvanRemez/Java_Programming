package day19_array;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int min = numbers[0]; // assume that 1st element is the min # - 100

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min){ // compare each element of Array with current min #
                min = numbers[i]; // if current element is smaller than min - reassign new min
            }
        }

        System.out.println("min = " + min);
    }
}
