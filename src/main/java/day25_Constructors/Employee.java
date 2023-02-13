package day25_Constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hireDate;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, double salary) {
        this(name, jobTitle);
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    } // allows us to set all instance variables of each object as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    } // allows us to print the object when it's passed in the print statement
}
/*
name
age
gender
jobTitle
salary
hireDate
 */

// static modifier - used when all elements are the same - NON instance
// instance used when each object will have it's own attributes - INSTANCE