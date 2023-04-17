package oop_exercises.exercise_4;

public class Main {
    public static void main(String[] args) {
        Number num1 = new Number(1);
        Number num2 = new Number(2);
        Number num3 = new Number(3);
        Number num4 = new Number(4);
        System.out.println(num1.getNum() + " " + num2.getNum() + " " + num3.getNum() + " " + num4.getNum() + " ");
        System.out.print(num1.getNum() + " ");
        System.out.print(num2.getNum() + " ");
        System.out.print(num3.getNum() + " ");
        System.out.print(num4.getNum() + " \n");
        System.out.printf("%d %d %d %d",num1.getNum(),num2.getNum(),num3.getNum(),num4.getNum());
    }
}
