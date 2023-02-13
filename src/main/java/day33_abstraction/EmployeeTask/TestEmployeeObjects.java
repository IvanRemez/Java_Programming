package day33_abstraction.EmployeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {


        // Employee employee = new Employee("Daniel",54, 'M',"A1","SDET",85000);
        // We cannot create objects from an Abstract Class
        // Object MUST be created from a Concrete Class

        Teacher teacher = new Teacher("James", 45, 'M', "B1",
                "Math Teacher", 75000);

        Developer dev = new Developer("Lucy", 30, 'F', "C1",
                "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1",
                "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1",
                "Manual Tester", 80000);


        System.out.println(teacher);
        System.out.println(dev);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("-----------------------------------------------------------");

        teacher.work();
        dev.work();
        tester.work();
        driver.work();
    }
}
