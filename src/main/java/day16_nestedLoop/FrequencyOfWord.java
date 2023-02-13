package day16_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst("Java", "");
                // remove "Java" each time and reassign new string
            // while loop will stop once all "Java"s are gone from the sentence
            /*
            "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
             */
        }

        System.out.println("count = " + count);
        System.out.println("--------------------------------------");

        String sentence2 = "java JAVA jAvA JAva";
        String word2 = "Java";

        sentence2 = sentence2.toLowerCase();
        word2 = word2.toLowerCase();

        int count2 = 0;

        while (sentence2.contains(word2)) {
            count2++;
            sentence2 = sentence2.replaceFirst("java", "");
        }

        System.out.println("count2 = " + count2);

    }
}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"
		    output:
		        4

 */