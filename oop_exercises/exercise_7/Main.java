package oop_exercises.exercise_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First: ");
        Scanner data1 = new Scanner(System.in);
        Number num1 = new Number(data1.nextInt());

        System.out.println("Second: ");
        Scanner data2 = new Scanner(System.in);
        Number num2 = new Number(data2.nextInt());

        System.out.println("Third: ");
        Scanner data3 = new Scanner(System.in);
        Number num3 = new Number(data3.nextInt());

        System.out.printf("Sum: %d", sum(num1, num2, num3));
        System.out.printf("\nAverage: %d", average(num1, num2, num3));
        System.out.printf("\nProduct: %d", product(num1, num2, num3));
        System.out.printf("\nSmallest: %d", smallest(num1, num2, num3));
        System.out.printf("\nLargest: %d", largest(num1, num2, num3));


    }
    static int sum(Number num1, Number num2, Number num3){
        return num1.num + num2.num + num3.num;
    }

    static int average(Number num1, Number num2, Number num3){
        return (num1.num + num2.num + num3.num) / 3;
    }

    static int product(Number num1, Number num2, Number num3){
        return num1.num * num2.num * num3.num;
    }

    static int smallest(Number num1, Number num2, Number num3){
        Number smallest = new Number(num1.num);

        if(num2.num < num1.num){
            smallest = num2;
        }
        if(num3.num < num2.num){
            smallest = num3;
        }

        return smallest.num;
    }

    static int largest(Number num1, Number num2, Number num3){
        Number largest = new Number(num1.num);

        if(num2.num > num1.num){
            largest = num2;
        }
        if(num3.num > num2.num){
            largest = num3;
        }

        return largest.num;
    }
}
