package day30_Inheritance2.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle, employeeID;
    private double salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle,
                    String employeeID, double salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

}
