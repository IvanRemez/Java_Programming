package day50_JavaVersionUpdates.Java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(2, 4, 6, 8);

        List<Integer> unmodifiableList = List.of(2, 4, 6, 8);
        List<Integer> unmodfiableList2 = List.copyOf(numList);
    }
}
