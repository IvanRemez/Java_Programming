package day48_Stream2.Tasks.StateTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class State {

    private String state;
       private List<String> cities = new ArrayList<>();

       public void addCity(String city){
           cities.add(city);
       }

       public List<String> getCities(){
           return this.cities;
       }

}
/*
Suppose we have a State class that contains list of cities.
Create a list of States and print all the cities.

   public class State {
       private List<String> cities = new ArrayList<>();
       public void addCity(String city){
           cities.add(city);
       }
       public List<String> getCities(){
           return this.cities;
       }
}
 */