package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        // ** Constructor gets EXECUTED separately for EACH OBJECT **

        Student[] students = {student2, student3, student4, student5};

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        group1.addStudent(student1); // student object method used for adding 1 student

        group1.addStudent(students); // student ArrayList method used to add remaining students

        group1.addStudent("Khashayar",34,'M',"F35");
        // student method with specified name, age, gender, and id used to add another student
        // this method first creates student object using the specified parameters and then adds it into
            // the students ArrayList

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }
        System.out.println("-----------------------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles", 2);

        StudentsGroup group3 = new StudentsGroup("Java Turtles", 3);

        StudentsGroup group4 = new StudentsGroup("Java Turtles", 4);

        StudentsGroup[] groups = {group1, group2, group3, group4};

        // ^^ add students to each group and then add all the groups to the Group Array (Multi D Array)
    }

}
/*
3. Create a class named TestObjects

	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */