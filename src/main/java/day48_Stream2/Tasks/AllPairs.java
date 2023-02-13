package day48_Stream2.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllPairs {

    public static void main(String[] args) {

        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);

        List<List<Integer>> pairs = num1.stream()
                .flatMap(i -> num2.stream()
                        .map(j -> Arrays.asList(i,j)))
                .collect(Collectors.toList());
        System.out.println(pairs);

        System.out.println("-------------------------------------------------------");

        List<int[]> pair = num1.stream()
                .flatMap(i -> num2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        pair.forEach(i -> {
            System.out.println(Arrays.toString(i));
        });

    }
}
/*
2. Given two lists of numbers, how would you return all pairs of numbers?
For example, given a list [1,2,3] and a list [3,4] you should return
[(1,3),(1,4),(2,3), (2,4),(3,3),(3,4)]

• List<Integer> numbers1 = Arrays.asList(1,2,3); •
List<Integer> numbers2 = Arrays.asList(3,4); •
List<int[]> pairs = ?????
 */