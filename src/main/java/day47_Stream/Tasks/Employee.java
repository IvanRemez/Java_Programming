package day47_Stream.Tasks;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName, empEmail;
    private List<String> empPhoneNumbers;

}
