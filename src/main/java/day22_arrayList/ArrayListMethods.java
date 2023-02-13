package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // int 10 gets wrapped to Integer object (Autoboxing) and added
        // to the array list
        list.add(20);
        list.add(30);
        list.add(10); // duplicates are accepted

        // list.add(5.5); // mismatched data type

        System.out.println(list);

        list.add(1, 15); // adds new element at index 1

        System.out.println(list);

        list.add(2, 25); // adds 25 at index 2

        System.out.println(list);
        System.out.println("--------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        String lastStudent = studentsList.get(studentsList.size() - 1); // last index #

        System.out.println(firstStudent);
        System.out.println(lastStudent);
        System.out.println("--------------------------------------------");



    }
}
