package oop_exercises.exercise_21;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedanCar = new Sedan(200, 145.0, "red", 15);

        Ford ford1 = new Ford(150, 100.0, "white", 2015, 4);
        Ford ford2 = new Ford(175, 110.0, "black", 2016, 6);

        Car car = new Car(60, 225.0, "blue");

        System.out.println(sedanCar.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car.getSalePrice());

    }
}
