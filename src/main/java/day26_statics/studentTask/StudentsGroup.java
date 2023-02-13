package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // StudentGroup HAS a Student
                // HAS relationship - one class's instance is being used in another class's instance

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { // creates the StudentGroup object by setting
                                                            // the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>(); // size: 0
    }

    public void addStudent(Student student){ // takes one student object and adds it to the students ArrayList
        students.add(student);
    } // can add student by passing student OBJECT                              // OR

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } // overloaded addStudent method adds array of students into the students ArrayList
    // each student will be added one by one into the ArrayList
    // BENEFIT: after adding the first student you can specify an Array of the remaining students to be added


    // by passing student name, age, gender, and id
    public void addStudent(String name, int age, char gender, String id){
        // Student student = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id));
    } // takes student's name, age, gender, id and creates student object using this info
            // then adds the student object to the students ArrayList

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    } // takes the specified id and removes student object with matching id

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup

	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList
	                removeStudent(id): removes the student with the specified id from the students arraylist
	                toString(): displays the groupName, groupId and total number of students when a
	                group object is passed in the print statement

 */