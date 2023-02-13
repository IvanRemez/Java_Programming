package day47_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        list.forEach(System.out::println);  // using forEach (Consumer Interface)
                                            // AND Method Reference to println()
                                            // to print each element

// Intermediate Operations:

    // Filter:  .filter(predicate)

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

    // Distinct:    .distinct()

        Stream<Integer> str = list.stream()         // Alternative solution - str
                .filter(i -> i % 2 == 0)
                .distinct();                    // Stream still open

        str.forEach(System.out::println);       // Stream closed
        System.out.println("----------------------------------------");

    // Limit:   .limit(n)       Truncating Stream

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)               //
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

    // Skip:    .skip(n)        Skipping Elements

        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)                    // skips n # of elements
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

    // Map:    .map(predicate)        Mapping Elements unto others

        list.stream()
                .map(num -> num * 2)           // multiplies each element by 2
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

    }
}
