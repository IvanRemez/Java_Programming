package day48_Stream2.Tasks.StateTask;

import java.util.List;

public class TestState {

    public static void main(String[] args) {

        StateData.getStateList().stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
