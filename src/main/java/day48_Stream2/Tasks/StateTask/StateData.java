package day48_Stream2.Tasks.StateTask;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class StateData {

    private final static Faker FAKER = new Faker();

    public static List<State> getStateList() {

        List<State> stateList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            State state = new State();
            for (int j = 0; j < 5; j++) {

                state.addCity(FAKER.address().city());
            }
            stateList.add(state);
        }
        return stateList;
    }
}
