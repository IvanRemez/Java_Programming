package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = ""; // "abc"

        for (int i = 0; i < str.length(); i++) { // i: index # of str

            char each = str.charAt(i);  // each character of the String str

            if (!result.contains("" + each)){  // "" + -> concat each char as String
                result += each; // if String result DOES NOT contain the char,
                                // we will add the char to the string result
            }
        }

        System.out.println(result);     // "abc"
    }
}
 /*

3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */