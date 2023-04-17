package oop_exercises.exercise_3;

public class Main {
    public static void main(String[] args) {
        Celsius celcius = new Celsius();
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.temperature = 72;

        celcius.temperature = celcius.convertToFahrenheit(fahrenheit);
        System.out.println(celcius.getValue());
    }
}
