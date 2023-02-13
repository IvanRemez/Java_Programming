package day07_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;
        String result = "Your grade is: ";

        if (score >= 90) { // false = score < 90
            result += "A";
        } else if (score >= 80) { //&& score < 90 no need to add because the previous condition already negates this
            result += "B";
        } else if (score >= 70) {
            result += "C";
        } else if (score >= 60) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);

    }
}

/*
 An integer variable named score is declared and given,
 Write a program that can print the grade of the student
	Ex:
		score = 95
	     output:
		    Your grade is A
	 Note: Assume that the given score is between 0 ~ 100
 */