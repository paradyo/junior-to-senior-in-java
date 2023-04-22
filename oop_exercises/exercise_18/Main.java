package oop_exercises.exercise_18;

public class Main {
    public static void main(String[] args) throws WrongMonthException, WrongDayException, WrongYearException {
        Date myDate = new Date(25, 2, 1970);
        myDate.displayDate();
    }
}
