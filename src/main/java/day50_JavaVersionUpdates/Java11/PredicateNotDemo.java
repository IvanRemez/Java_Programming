package day50_JavaVersionUpdates.Java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = i -> i % 2 == 0;
        Predicate<Integer> odd = Predicate.not(even);

        List<Integer> evenNums = list.stream()
                .filter(even)
                .collect(Collectors.toList());

        System.out.println(evenNums);

        List<Integer> oddNums = list.stream()
//                .filter(odd)
                .filter(Predicate.not(even))
                .collect(Collectors.toList());

        System.out.println(oddNums);

    }
}