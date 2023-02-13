package day18_garbageCollection;

import day17_customClass.Employee;

class Car{
                        // Defaults:
    public String brand; // null
    public String model; // null
    public String color; // null
    public int year;     // 0


}

public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100;    // stored in Stack

        Car car1 = new Car();
        //  ^Stack    ^Heap

        System.out.println("------------------------------------");

        Employee employee1 = new Employee();    // 1 object in Heap
        Employee employee2 = employee1;         // 2 reference variables in Stack

        employee1.setInfo("Rehane", 30, 'F', "Java Developer", 95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2); // both referencing to the same object

        System.out.println("------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;     // all 3 referencing to the same Object
                                    // 3 doors to the same room


    }

    public static void method1(){

        int b = 200;    // stored in Stack

    }

    public static void method2(){

        String c = "Hello World";
        //     ^Stack      ^Heap (String Pool)

        String d = new String ("Hello World");
        //     ^Stack      ^Heap (Outside String Pool)

    }
}
