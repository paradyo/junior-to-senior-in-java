package oop_exercises.exercise_3;

public class Celsius extends Temperature {
    @Override
    float getValue() {
        return super.temperature;
    }

    float convertToFahrenheit(Fahrenheit fahrenheit){
        return (5/9f) * (fahrenheit.temperature - 32);
    }

}
