package oop_exercises.exercise_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data1 = new Scanner(System.in);
        Text text = new Text(data1.next());
        System.out.println(text.upperLowerInARow());
    }
}
