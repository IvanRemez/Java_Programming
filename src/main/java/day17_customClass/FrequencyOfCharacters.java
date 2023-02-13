package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = ""; // a2b1c3d1
                            // a b c d - chars
                            // 2 1 3 1 - frequencies

        for (int j = 0; j < str.length(); j++) { // checking each char

            char ch = str.charAt(j); // char at j
            int count = 0;          // frequency count

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch){
                    count++;
                }
            }

            if (result.contains("" + ch)){ // if char already included in result
                continue;                  // skip that character
            }

            result += ch + "" + count;
        }
        System.out.println(result);


    }
}
/*
	2. Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */