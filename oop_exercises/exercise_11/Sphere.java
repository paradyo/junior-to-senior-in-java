package oop_exercises.exercise_11;

public class Sphere {
    double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    double sphereVolumeto(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}
