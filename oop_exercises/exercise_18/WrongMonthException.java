package oop_exercises.exercise_18;

public class WrongMonthException extends Exception{
    WrongMonthException(){
        System.out.println("Month should be less/equals than 12 and greater/equals than 1.");
    }
}
