package day36_Polymorphism2;

import day29_Inheritance.AnimalTask.Animal;
import day29_Inheritance.AnimalTask.Cat;
import day29_Inheritance.AnimalTask.Dog;
import day30_Inheritance2.phoneTask.Nokia;
import day30_Inheritance2.phoneTask.Phone;
import day30_Inheritance2.phoneTask.iPhone;
import day33_abstraction.EmployeeTask.*;
import day35_Polymorphism.TransportationTask.AutoPilot;
import day35_Polymorphism.TransportationTask.Electric;
import day35_Polymorphism.TransportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting
                       // ^^ NOT needed

        System.out.println("-----------------------------------------");


        Animal animal1 = new Dog(); // Up casting --> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ( (Dog)animal1 ).bark(); // Down casting

        // OR

        Dog dog1 = (Dog)animal1; // Down casting
        dog1.bark();             // new variable dog1 can be reused

//        ( (Cat)animal1).scratch(); // ClassCastException
            // animal1 is a new Object of Dog class
            // cannot be converted to Cat
            // there is NO "IS A" relationship b/w Dog and Cat

        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

 //       ((iPhone)phone).faceTime(123456); // ClassCastException
                                    // Nokia CANNOT be converted to iPhone
                                    // No "IS A" relationship

        ((Nokia) phone).selfDefense(); // phone "IS A" Nokia
                                        // CAN call on Nokia class methods

        System.out.println("-------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());


        //    Driver driver = (Driver) employee;
        System.out.println("-------------------------------------------------------------");

        Electric electric = (Electric) new Tesla("Tesla", "Model Y","Blue",2020,55000);
            // UPCASTING - Implicity done
            // Reference type decides what features can be accessed/called
                // Need to Down cast to access Tesla class (Child) features

        ((Tesla)electric).selfDrive(); // DOWN CASTING to access selfDrive() method of Tesla class (Child)
        ((AutoPilot) electric).selfDrive(); // Down casting to AutoPilot interface to access selfDrive()

        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45, 'M', "B1",
                "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1",
                "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1",
                "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1",
                "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();

        // ^^ if method is Overridden in the Child class
            // that is the method that will get executed

        // *** Reference type decides what can be accessed/called ***
        // *** Object type decides which implementation will be executed ***


    }
}
