package day42_Maps2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        Map<String, String> employees = new TreeMap<>();

        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map == employees); // false - 2 different objects

        System.out.println(map.equals(employees)); // true - same pairs
            // default equals() method considers ORDER as well
            // because both were put into TreeMap, order is preserved
    }
}
