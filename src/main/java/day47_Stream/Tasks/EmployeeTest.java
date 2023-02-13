package day47_Stream.Tasks;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {

// Print all emails:

        EmployeeData.readAll()
//                .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)         // Method Reference
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

// Print all phone numbers:

        EmployeeData.readAll()
//                .map(Employee::getEmpPhoneNumbers)        // returns Stream of phone #s
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                // ^^ accepts Stream of Stream (Stream<Stream<T>>) - returns Stream
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

// Print all phone numbers with Double Colon:

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)  // returns List
                .flatMap(List::stream)      // Method Reference to List - returns Stream
                .forEach(System.out::println);

    }
}
