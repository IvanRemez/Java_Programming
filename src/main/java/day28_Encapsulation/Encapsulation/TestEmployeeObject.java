package day28_Encapsulation.Encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {
/*
        Employee e1 = new Employee();
        // e1.salary = -2000;

        e1.setSalary(100000);

        System.out.println(e1.getSalary());

        e1.setName("      ");

        System.out.println(e1.getName());

 */
        Employee e1 = new Employee("John",30,"Java Developer",100000);

        System.out.println(e1);
    }
}
