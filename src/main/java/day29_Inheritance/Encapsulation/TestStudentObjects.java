package day29_Inheritance.Encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student s1 = new Student("Hamza",26,'M','A',"MIT");

        System.out.println(s1);

        s1.setSchoolName("Harvard");
        s1.setGrade('B');

        System.out.println(s1);

    }
}
