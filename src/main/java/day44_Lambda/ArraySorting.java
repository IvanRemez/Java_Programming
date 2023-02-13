package day44_Lambda;

import java.util.Queue;
import java.util.function.Predicate;

public class ArraySorting {

    // QuickSort, BubbleSort, etc.

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        //OR:

        as.sort(() -> System.out.println("Quick Sorting"));

        // With Java 8 - you have access to multiple ready functional interfaces


    }

    public void sort(Sorting sorting){
        sorting.sort();
    }
}
