package oop_exercises.exercise_16;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;
    Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    String getNumber(){
        return number;
    }

    void setNumber(String number){
        this.number = number;
    }

    String getDescription(){
        return description;
    }

    void setDescription(String description){
        this.description = description;
    }

    int getQuantity(){
        return quantity;
    }

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }

    double getInvoiceAmount(){
        if(quantity < 0){
            this.quantity = 0;
        }
        if(price < 0){
            this.price = 0.0;
        }
        return quantity * price;
    }
}
