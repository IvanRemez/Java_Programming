package day43_Generics.Review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor    // used to assign FINAL fields
@Data
public class Student extends Person{

    private String name;
    private final int id;


}
