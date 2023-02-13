package day25_Constructors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.of(2020,11,24,13,0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        System.out.println(now.format(dtf));
    }
}
