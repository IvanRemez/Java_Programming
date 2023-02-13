package day48_Stream2.Tasks;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        Stream.iterate(new Integer[]{0, 1}, t -> new Integer[]{t[1], t[0] + t[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");

// Fibonacci Tuples:

        Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
                .limit(20)
                .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));
    }
}
/*
The Fibonacci series is famous as a classic programming exercise.
The numbers in the following sequence are part of the Fibonacci series.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.... The first two numbers of the series are 0 and 1,
and each subsequent number is the sum of the previous two.

• The series of Fibonacci tuples is similar; you have sequence of a number and its
successor in the series : (0,1),(1,1),(1,2),(2,3),(3,5)...

• You task is to generate the first 20 elements of the series of Fibonacci tuples
using iterate method.

Stream.iterate(new int[]{0,1},???) .limit(20)
.forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));
 */