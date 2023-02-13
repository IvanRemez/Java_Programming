package day28_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    public String getName() {
        if (name == null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Name cannot be null, empty, or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Gender can only be 'M' or 'F' ");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        if (DOB.isAfter(LocalDate.now())){
            System.err.println("Date cannot be after today's date");
            System.exit(1);
        }
        this.DOB = DOB;
    }

    public Person(String name, int age, char gender, LocalDate DOB) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDOB(DOB);
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", DOB=" + getDOB() +
                '}';
    }
}
/*
Variables:
    name, age, gender, DOB

    name:
        Write - cannot be null, empty, or blank
        Read - if name is null, return "Unknown"

    age:
        Write - age cannot be less than 0 or greater than 120

    gender:
        Write - gender can only be 'M' or 'F'

    DOB:
        Write - cannot be after today's date

Add a constructor to set all the fields

Add toString()

 */