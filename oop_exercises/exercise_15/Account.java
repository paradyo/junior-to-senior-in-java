package oop_exercises.exercise_15;

public class Account {
    private double balance;
    public Account(double initialBalance) {
        if (initialBalance > 0.0) balance=initialBalance;
    }

    public void credit(double amount){
        balance=balance+amount;
    }

    public boolean debit(double amount){
        if(balance-amount >= 0){
            balance=balance-amount;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }
}
