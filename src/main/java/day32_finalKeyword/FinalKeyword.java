package day32_finalKeyword;

import java.time.LocalDate;

class Student{

    public final void language(){
        System.out.println("Java Programming");
    }
}

public class FinalKeyword extends Student{

    /*
    public void language(){
        System.out.println("Python Programming");
    }
     */     // final method CANNOT be overridden

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

        // gender = 'F'; // new value 'F' is stored into gender variable

        System.out.println(gender);
        System.out.println("--------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);
        System.out.println("--------------------------------------------");

        new Student().language();
        new FinalKeyword().language();

    }
}
