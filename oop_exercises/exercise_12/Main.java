package oop_exercises.exercise_12;

public class Main {
    public static void main(String[] args) {
        int[] zeroArray = new int[10];
        for (int i = 0; i < 10; i++) {
            zeroArray[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(zeroArray[i]);;
        }

        int[] bonus = new int[15];
        for (int i = 0; i < 15; i++) {
            bonus[i] += i;
        }
        for (int i = 0; i < 10; i++) {
            //System.out.println(bonus[i]);;
        }

        int[] bestScores = new int[5];
        for (int i = 0; i < 5; i++) {
            bestScores[i] += i * 10;
        }
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);;
        }


    }
}
