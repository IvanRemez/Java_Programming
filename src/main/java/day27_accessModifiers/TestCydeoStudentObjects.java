package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);
        // ^^ Static Variable initialized by Static Block

        CydeoStudent s1 = new CydeoStudent("Ekaterina",29,'F');
        CydeoStudent s2 = new CydeoStudent("Alena",28,'F');

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.schoolName); // Cydeo School for both
        System.out.println(s2.schoolName);

        System.out.println(s1.secretCode); // Wooden Spoon for both
        System.out.println(s2.secretCode);

        // ^^ NOT best practice to call Statics through Objects



    }

}
