package day16_nestedLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "cccccaabbbcccc"; // count = 9
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index #s of str

            if (str.charAt(i) == ch){ // if the char of the string is equal to given
                // char, it means the char has appeared in string
                count++; // count increased by 1 each time char appears
            }
        }

        System.out.println("count = " + count);

    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter
a string and a char, the returns the frequency of the char from the given string

            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */