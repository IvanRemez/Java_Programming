package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate birthday;

    public void setInfo(String name, char gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.age = LocalDate.now().getYear() - birthday.getYear();
        //^^ this. needed to assign local variable (NOT recall class variable)
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
