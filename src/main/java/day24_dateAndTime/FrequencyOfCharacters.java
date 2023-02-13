package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = ""; // Return frequency: a3b4c5

        // to use Collections.frequency() need to convert string to array
        for (String each : str.split("")){

            // Arrays.asList used to convert array to Collection type
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)){
                result += each + frequency;
            }
        }
        System.out.println(result);

    }
}
