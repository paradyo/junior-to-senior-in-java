package oop_exercises.exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner data1 = new Scanner(System.in);
        Number num1 = new Number(data1.nextInt());
        System.out.println("Second Number: ");
        Scanner data2 = new Scanner(System.in);
        Number num2 = new Number(data2.nextInt());



        System.out.printf("Sum: %d", sum(num1, num2));
        System.out.printf("\nProduct: %d", product(num1, num2));
        System.out.printf("\nDiff: %d", difference(num1, num2));
        System.out.printf("\nDivision: %d", divison(num1, num2));
    }

    static int sum(Number num1, Number num2){
        return num1.num + num2.num;
    }

    static int product(Number num1, Number num2){
        return num1.num * num2.num;
    }

    static int difference(Number num1, Number num2){
        return num1.num - num2.num;
    }

    static int divison(Number num1, Number num2) throws ArithmeticException{
        try {
            return num1.num / num2.num;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}
