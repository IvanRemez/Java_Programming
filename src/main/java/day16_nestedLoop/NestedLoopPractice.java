package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";

        // print characters which appear 2 times in the string (frequency)

        String result = ""; // "bdf"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // each char of the string

                if (str.charAt(i) == ch) {
                    count++;

                // Inner (Nested) Loop - compares ch to each character of the string
                    // then increases count by 1 for each match
                }
            }
            if (count == 2 && !result.contains("" + ch)) {
                result += ch;
            }
        }

        System.out.println(result);
        System.out.println("--------------------------------------");

        // Task 2: frequencyOfChars - "AAABBCCCCDDDDD"
            // output: A3B2C4D5

        String str2 = "AAABBCCCCDDDDD";

        String result2 = ""; // a3b2c4d5
        // a b c d - chars
        // 2 1 3 1 - frequencies

        for (int j = 0; j < str2.length(); j++) { // checking each char

            char ch2 = str2.charAt(j); // char at j
            int count2 = 0;          // frequency count

            for (int i = 0; i < str2.length(); i++) {

                if (str2.charAt(i) == ch2){
                    count2++;
                }
            }

            if (result2.contains("" + ch2)){ // if char already included in result
                continue;                  // skip that character
            }

            result2 += ch2 + "" + count2;
        }
        System.out.println(result2);



    }
}
