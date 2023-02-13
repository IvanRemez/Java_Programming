package day50_JavaVersionUpdates.Java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {


    public static void main(String[] args) {

        var result =
                Stream.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
                        .collect(Collectors.teeing(
                                // 1st collector, we select only who confirmed the participation:
                                Collectors.filtering(Guest::isParticipating,
                                        // we want to collect 1st name in list ONLY:
                                        Collectors.mapping(Guest::getName, Collectors.toList())),
                                // 2nd collector, we want the total # of participants:
                                Collectors.summingInt(Guest::getParticipantsNumber),
                                // we merge the collectors into a new Object
                                // the values are implicitly passed
                                EventParticipation::new
                        ));

        System.out.println(result);

    }
}