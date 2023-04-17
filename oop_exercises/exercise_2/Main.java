package oop_exercises.exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner data1 = new Scanner(System.in);
        Number num1 = new Number();
        num1.num = data1.nextInt();
        System.out.println("Second Number: ");
        Scanner data2 = new Scanner(System.in);
        Number num2 = new Number();
        num2.num = data2.nextInt();
        System.out.println("Third Number: ");
        Scanner data3 = new Scanner(System.in);
        Number num3 = new Number();
        num3.num = data3.nextInt();

        System.out.println(productOfIntegers(num1, num2, num3));

    }
    static int productOfIntegers(Number num1, Number num2, Number num3){
        return num1.num * num2.num * num3.num;
    }
}
