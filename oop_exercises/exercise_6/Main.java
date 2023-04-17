package oop_exercises.exercise_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner data1 = new Scanner(System.in);
        Number num1 = new Number(data1.nextInt());
        System.out.println("Second Number: ");
        Scanner data2 = new Scanner(System.in);
        Number num2 = new Number(data2.nextInt());

        System.out.println(largerOrEqual(num1, num2));
    }

    static String largerOrEqual(Number num1, Number num2){
        if(num1.num > num2.num){
            return num1.num + " is larger.";
        }
        else if(num1.num == num2.num){
            return "The numbers are equal.";
        }else{
            return "Default statement.";
        }
    }
}
