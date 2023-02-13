package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Ivan", 'M', LocalDate.of(1991, 9, 6));
        people[2].setInfo("Barbara", 'F', LocalDate.of(1970, 3, 6));
        people[3].setInfo("John", 'M', LocalDate.of(1960, 1, 9));
        people[4].setInfo("Amy", 'F', LocalDate.of(1999, 3, 3));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        for (Person person : studentsList) {

            System.out.print("Name: " + person.name + "\t");
            System.out.println("Birthday: " + person.birthday);
        }
        System.out.println("-------------------------------------------------------");


        studentsList.removeIf(p -> p.age > 55);

        System.out.println(studentsList);


        // print name and birthday of each person object
        // remove all people whose age is > 55

    }
}
