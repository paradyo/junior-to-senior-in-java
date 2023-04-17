package oop_exercises.exercise_13;

public class Text {
    String input;
    Text(String input){
        this.input = input;
    }
    String upperLowerInARow(){
        return this.input.toUpperCase() + this.input.toLowerCase();
    }
}
