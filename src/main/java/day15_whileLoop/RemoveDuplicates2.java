package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // str.length() = length - 1 = last index #

            if (result.contains("" + str.charAt(i))) { // if char is already
                                            // contained in the new string, skip it
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result); // result = "xyz"

    }
}
/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */