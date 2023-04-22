package oop_exercises.exercise_18;

public class WrongYearException extends Exception{
    WrongYearException(){
        System.out.println("Year should be less/equals than 2099 and greater/equals than 1980.");
    }
}
