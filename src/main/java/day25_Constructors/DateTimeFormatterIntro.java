package day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE MMMM/dd/y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df)); // July-01-22 : "MMMM-dd-yy"
        System.out.println("------------------------------------------------");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
                                                        // "HH:mm" is default

        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf));
        System.out.println("------------------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));



    }
}
