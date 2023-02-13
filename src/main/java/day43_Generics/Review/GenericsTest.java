package day43_Generics.Review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        printInfo(studentList);
        System.out.println("------------------------------------");

        printInfo2(teacherList);
        System.out.println("------------------------------------");

        System.out.println(returnLastItem(teacherList));
        System.out.println("------------------------------------");

        MyUtils<Student> obj1 = new MyUtils<>();

        obj1.printInfo2(studentList);
        System.out.println(obj1.returnLastItem(studentList));
        System.out.println("------------------------------------");

        // obj1.printInfo2(teacherList); // obj1 created using <Student>
                                // CANNOT be used with Teacher objects

        MyUtils<Teacher> obj2 = new MyUtils<>();

        obj2.printInfo2(teacherList);
        System.out.println(obj2.returnLastItem(teacherList));

    }

    // Write method that takes list of students and prints each student + total student count

    public static void printInfo(List<Student> students) {

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Student count = " + students.size());
    }

    // Write method that takes list and prints each item + total item count

    public static <T> void printInfo2(List<T> items) {

        for (T item : items) {
            System.out.println(item);
        }
        System.out.println("Item count: " + items.size());
    }

    // Write a method that takes a list and returns the last item of the list

    public static <T> T returnLastItem(List<T> list) {

        return list.get(list.size() - 1);
    }
}
