package oop_exercises.exercise_21;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    double getSalePrice(){
        //If length>20 feet, 5%discount,
        // Otherwise, 10%discount
        if(this.length > 20){
            return super.getSalePrice() * 0.95;
        }
        else{
            return super.getSalePrice() * 0.9;
        }
    }
}
