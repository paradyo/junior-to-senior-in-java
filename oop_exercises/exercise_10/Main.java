package oop_exercises.exercise_10;

public class Main {
    public static void main(String[] args) {
        byte startN = 1;
        byte endN = 10;
        for (int i = startN; i <= endN; i++) {
            if(i == 1){
                System.out.print("N 10*N 100*N 1000*N\n");
            }
            System.out.printf("%d ", i);
            for (int j = 1; j <= 3; j*=10) {
                System.out.printf("%d ", j * 10 * i);
                System.out.printf("%d ", j * 100 * i);
                System.out.printf("%d\n", j * 1000 * i);
            }
        }
    }
}
