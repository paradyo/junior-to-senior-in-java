package oop_exercises.exercise_21;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice(){
        //If weight>2000, 10%discount.
        //Otherwise, 20%discount.
        if(this.weight > 2000){
            return super.getRegularPrice() * 0.9;
        }
        else{
            return super.getRegularPrice() * 0.8;
        }
    }
}
