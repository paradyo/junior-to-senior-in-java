package oop_exercises.exercise_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First: ");
        Scanner data1 = new Scanner(System.in);
        Number num1 = new Number(data1.nextInt());
        System.out.println("Second: ");
        Scanner data2 = new Scanner(System.in);
        Number num2 = new Number(data2.nextInt());
        System.out.printf("Is Multiple? -->> %b",isMutiple(num1, num2));
    }

    static boolean isMutiple(Number num1, Number num2){
        if(num1.num % num2.num == 0){
            return true;
        }
        return false;
    }
}
