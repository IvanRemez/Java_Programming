package day28_Encapsulation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student();

        // s1.age = -200; // cannot modify once instance variable set to private
        // System.out.println(s1.age);

        s1.setAge(28);

        System.out.println(s1.getAge());

        s1.setName("Aaron");
        System.out.println(s1.getName());

        System.out.println("Builder Completed");

    }
}
