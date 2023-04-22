package oop_exercises.exercise_19;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        SavingsAccount.annualInterestRate = 4;
        int newInterest1 = saver1.calculateMonthlyInterest();
        saver1.setSavingsBalance(saver1.getSavingsBalance() + newInterest1);
        System.out.println("saver1Bal: " + saver1.getSavingsBalance());
        int newInterest2 = saver2.calculateMonthlyInterest();
        saver2.setSavingsBalance(saver2.getSavingsBalance() + newInterest2);
        System.out.println("saver2Bal: " + saver2.getSavingsBalance());

        SavingsAccount.annualInterestRate = 5;
        newInterest1 = saver1.calculateMonthlyInterest();
        saver1.setSavingsBalance(saver1.getSavingsBalance() + newInterest1);
        System.out.println("saver1Bal: " + saver1.getSavingsBalance());
        newInterest2 = saver2.calculateMonthlyInterest();
        saver2.setSavingsBalance(saver2.getSavingsBalance() + newInterest2);
        System.out.println("saver2Bal: " + saver2.getSavingsBalance());


    }
}
