package oop_exercises.exercise_15;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(50);
        account.credit(10);
        System.out.println(account.getBalance());
        account.debit(30);
        System.out.println(account.getBalance());
        if(account.debit(65)){
            System.out.println(account.getBalance());
        }
        else{
            System.out.println("Debit amount exceeded account balance.");
        }


    }
}
