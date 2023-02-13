package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        // age of student is 28
        // salary is $10,000

        int age = 28;
        int salary = 10000;
        System.out.println(age);
        System.out.println(salary);

        // int age = 32; CANNOT reuse variable names

        int phoneNumber = 123456; // camel case

        double salaryBeforeTax = 100000.5;
        double salary_after_tax = 80000.5; // underscore
        System.out.println("------------------------------------");

        int number1 = 10; // CANNOT start variable name with digits
        int number2 = 20;
        int number3 = 30;

        // int abstract = 5.5; // cannot be Java reserved words

        System.out.println("------------------------------------");

        // gender is male
        String gender = "male";
        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);

    }
}
