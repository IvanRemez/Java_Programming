package day50_JavaVersionUpdates.Java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

// Type Inference:

        var str = "Cydeo";      // can use var ONLY for LOCAL Variables
        var num = 5;

        byte x = 1;
        var y = 1;      // int

        var price = 12.50;      // double

        var nums = Arrays.asList(3, 4, 5, 6);

        var sum = 0;
        for (var eachNum : nums) {
            sum += eachNum;
        }

    }
}
