package oracle_java_se8_practices.nested_class_inheritance.example_5;

public class Employee {
    private String name;
    private int age;
    private int salary;
    public Employee(String name, int age){

    }
    public Employee(String name, int age, int salary){
        //printDetails(); //Error this() line must be first line in ctor.
        this(name, age);
    }
    public void printDetails(){
        System.out.println(name + ":" + age + ":" + salary);
    }
}
