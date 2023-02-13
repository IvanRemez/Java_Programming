package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // Object is **IMMUTABLE**

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1991, 9, 6);

        System.out.println(birthday);
        System.out.println("-------------------------------------------------------");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birthday.getDayOfWeek()); // Friday baby

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear()); // out of 365
        System.out.println("-------------------------------------------------------");

        today = today.plusYears(1);
        // adds 1 year BUT need to reassign as Date Object is IMMUTABLE**
        System.out.println(today);
        System.out.println("-------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        graduationDate.plusYears(2);

        System.out.println(graduationDate); // 2025 - same

        // need to **reassign**
        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate); // 2027 - updated now

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate); // 7 months added

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate); // 7 weeks added

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate); // 100 days added
        System.out.println("-------------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(1991, 9, 6);

        LocalDate brothersBday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(brothersBday);
        System.out.println("-------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6, 7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);
        System.out.println("-------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12, 31))); // false
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 31))); // true
        System.out.println("-------------------------------------------------------");

        System.out.println(LocalDate.of(2022, 6, 16).isLeapYear());

    }
}
