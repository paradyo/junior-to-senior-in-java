package oop_exercises.exercise_17;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary < 0 ? 0 : salary;
    }
    String getFirstName(){
        return firstName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    double getSalary(){
        return salary;
    }

    void setSalary(double salary){
        this.salary = salary < 0 ? 0 : salary;
    }
}
