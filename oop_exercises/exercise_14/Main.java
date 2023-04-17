package oop_exercises.exercise_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grade[] grades = new Grade[5];
        Scanner data = new Scanner(System.in);
        for (int i = 4; i >= 0; i--) {
            Grade grade = new Grade(data.nextInt());
            grades[i] = grade;
        }
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(grades[i].score);
        }

        System.out.printf("Average: %d", average(grades));
    }

    static int average(Grade[] grades){
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i].score;
        }
        return total / grades.length;
    }
}
