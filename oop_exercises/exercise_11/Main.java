package oop_exercises.exercise_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Radius: ");
        Scanner data1 = new Scanner(System.in);
        Sphere sphere = new Sphere(data1.nextDouble());

        System.out.printf("Volume: %f", sphere.sphereVolumeto(sphere.radius));
    }
}
