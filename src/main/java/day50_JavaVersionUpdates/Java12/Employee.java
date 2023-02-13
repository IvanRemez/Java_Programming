package day50_JavaVersionUpdates.Java12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class Employee {
    
    private int id;
    private String name;
    private int salary;
}