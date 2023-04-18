package oop_exercises.exercise_17;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emre = new Employee(
                "Emre",
                "Ozkan",
                10000
        );
        Employee can = new Employee(
                "Can",
                "Ozkan",
                20000
        );

        System.out.printf("Props1: %s %s - %.1f\n", emre.getFirstName(), emre.getLastName(), emre.getSalary());
        System.out.printf("Props2: %s %s - %.1f\n", can.getFirstName(), can.getLastName(), can.getSalary());

        emre.setSalary(emre.getSalary() * 1.10);
        can.setSalary(can.getSalary() * 1.10);

        System.out.printf("Props1: %s %s - %.1f\n", emre.getFirstName(), emre.getLastName(), emre.getSalary());
        System.out.printf("Props2: %s %s - %.1f", can.getFirstName(), can.getLastName(), can.getSalary());

    }
}
