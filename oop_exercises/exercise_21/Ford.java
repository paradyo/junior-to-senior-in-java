package oop_exercises.exercise_21;

public class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    double getSalePrice(){
        //From the sale price computed from Car class, subtract the manufacturer Discount
        return super.getSalePrice() - (super.getSalePrice() * this.manufacturerDiscount / 100);
    }

}
