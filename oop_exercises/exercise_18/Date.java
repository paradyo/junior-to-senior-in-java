package oop_exercises.exercise_18;

public class Date {
    private int month;
    private int year;
    private int day;
    Date(int day, int month, int year) throws WrongDayException, WrongMonthException, WrongYearException{
        if(month <= 12 && month >= 1){
            this.month = month;
        }else{
            throw new WrongMonthException();
        }
        if(month == 2){
            if(day <= 28 && day >= 1){
                this.day = day;
            }else{
                throw new WrongDayException(month);
            }
        }
        else{
            if(day <= 31 && day >= 1){
                this.day = day;
            }else{
                throw new WrongDayException(month);
            }
        }
        if(year >= 1980 && year <= 2099){
            this.year = year;
        }else{
            throw new WrongYearException();
        }
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void setDay(int day) throws WrongDayException{
        if(this.month == 2){
            if(day <= 28 && day >= 1){
                this.day = day;
            }else{
                throw new WrongDayException(this.month);
            }
        }
        else{
            if(day <= 31 && day >= 1){
                this.day = day;
            }else{
                throw new WrongDayException(this.month);
            }
        }
    }

    void setMonth(int month) throws WrongMonthException{
        if(month <= 12 && month >= 1){
            this.month = month;
        }else{
            throw new WrongMonthException();
        }
    }

    void setYear(int year) throws WrongYearException{
        if(year >= 1980 && year <= 2099){
            this.year = year;
        }else{
            throw new WrongYearException();
        }
    }

    void displayDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

}
