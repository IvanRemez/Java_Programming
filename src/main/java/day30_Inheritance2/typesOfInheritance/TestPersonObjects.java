package day30_Inheritance2.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student s1 = new Student("Lucy",'F', LocalDate.of(
                1990,5,16), 'A', "A01");

        President p1 = new President("Daniel",'M',LocalDate.of(1980,
                12,1), LocalDate.of(2020,1,1));

        Teacher t1 = new Teacher("Emily",'F',LocalDate.of(1985,
                11,1), "Math Teacher","C1",95000);

        System.out.println(s1);
        System.out.println(t1);
        System.out.println(p1);

        s1.study();
        t1.teach();
        p1.lie();
        System.out.println("--------------------------------");


    }
}
