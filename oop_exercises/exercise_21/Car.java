package oop_exercises.exercise_21;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public String getColor() {
        return color;
    }

    double getSalePrice(){
        return regularPrice;
    };
}
