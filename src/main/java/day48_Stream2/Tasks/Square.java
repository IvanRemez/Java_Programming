package day48_Stream2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

    public static void main(String[] args) {

        List<Integer> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(squareList);

        List<Integer> result = squareList.stream()
                .map(p -> p * p)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
/*
1. Given a list of numbers how would you return a list of the square of each number?
For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
 */