package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // checking if each char (j) is unique
            int frequency = 0; // reset to 0 for each char prior to checking

            for (int i = 0; i < str.length(); i++) { // check each char (ch) in str
                                    // to see how many times it has appeared in str

                if (str.charAt(i) == ch){ // if ch has appeared in str
                    frequency++;          // increase frequency by 1
                }
            }

            if (frequency == 1){ // if frequency == 1, the ch is unique
                unique += ch;
            }
        }
        System.out.println(unique);

        //***UNIVERSAL APPROACH TO FINDING UNIQUES***

    }
}
/*
***INTERVIEW Q***
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */