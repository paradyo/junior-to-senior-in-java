package oop_exercises.exercise_19;

public class SavingsAccount {
    static int annualInterestRate;
    private int savingsBalance;

    int calculateMonthlyInterest(){
        return ((this.savingsBalance * (annualInterestRate)) / 12)/100;
    }

    void setSavingsBalance(int newBalance) {
        this.savingsBalance = newBalance;
    }

    void modifyInterestRate(int interestRate){
        annualInterestRate = interestRate;
    }

    int getSavingsBalance() {
        return this.savingsBalance;
    }

    static int getAnnualInterestRate() {
        return annualInterestRate;
    }
}
