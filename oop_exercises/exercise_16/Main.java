package oop_exercises.exercise_16;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(
                "id123123",
                "This is good item.",
                1,
                -1.0);
        invoice.setPrice(10);
        System.out.println(invoice.getInvoiceAmount());
    }
}
