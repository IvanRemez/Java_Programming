package day50_JavaVersionUpdates.Java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date) {

        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date) {

        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

// private validate() method lets you reuse this code in other methods inside
// your Interface -> less code to write
    private void validate(LocalDate date) {
        if (date.isBefore(LocalDate.of(2001, 1, 1))) {
            throw new IllegalArgumentException();
        }
    }
}
