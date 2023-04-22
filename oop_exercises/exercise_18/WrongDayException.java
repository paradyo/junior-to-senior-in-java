package oop_exercises.exercise_18;

public class WrongDayException extends Exception{
    WrongDayException(int month){
        if(month == 2){
            System.out.println("Day should be less/equals than 28 and greater/equals than 1.");
        }
        else{
            System.out.println("Day should be less/equals than 31 and greater/equals than 1.");
        }
    }
}
