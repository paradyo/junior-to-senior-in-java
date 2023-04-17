package oop_exercises.exercise_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte counter = 10;
        int number;
        int largest;
        int[] inputs = new int[counter];
        for (int i = 0; i < counter; i++) {
            System.out.printf("Enter %d. Number: ", i+1);
            Scanner data = new Scanner(System.in);
            number = data.nextInt();
            inputs[i] = number;
        }
        largest = inputs[0];
        for (int i = 0; i < counter; i++) {
            if(inputs[i] > largest){
                largest = inputs[i];
            }
        }
        System.out.printf("Largest number is: %d",largest);
    }
}
