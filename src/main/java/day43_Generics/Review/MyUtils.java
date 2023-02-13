package day43_Generics.Review;

import java.util.List;

public class MyUtils <T extends Person> {

    // Write method that takes list and prints each item + total item count

    public void printInfo2(List<T> items) {

        for (T item : items) {
            System.out.println(item);
        }
        System.out.println("Item count: " + items.size());
    }

    // Write a method that takes a list and returns the last item of the list

    public T returnLastItem(List<T> list) {

        return list.get(list.size() - 1);
    }
}
