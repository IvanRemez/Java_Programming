package day07_IfStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 2; // 1 ~ 18
        String result = "";

        if (gradeLevel <= 5) { // gradeLevel >= 1 && no need to add because precondition (1~18) is already given
            result = result + "Elementary school";
        } else if (gradeLevel <= 8) { // false: gradeLevel > 8
            result = "Middle school";
        } else if (gradeLevel <= 12) { // false: gradeLevel > 12
            result = "High school";
        } else if (gradeLevel <= 16) { // false: gradeLevel > 16
            result = "College";
        } else if (gradeLevel <= 18) { // false: gradeLevel > 18
            result = "Grad school";
        }
        System.out.println(result);

    }
}

/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given,
Write a program to determine and print which school type someone is in.
	Ex:
		gradeLevel = 2
	     output:
		Elementary School
    The grade level and types are:
	1 ~ 5: Elementary school
	6 ~ 8: Middle school
	9 ~ 12: High school
	13 ~ 16: College
	17 ~ 18: Grad School
      Note: Assume that the given number is between 1 ~ 18
 */