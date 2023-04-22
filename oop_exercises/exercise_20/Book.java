package oop_exercises.exercise_20;

public class Book {
    private String book_name;
    private int ISBN;
    private String author_name;
    private String publisher;

    public Book(String book_name, int ISBN, String author_name, String publisher) {
        this.book_name = book_name;
        this.ISBN = ISBN;
        this.author_name = author_name;
        this.publisher = publisher;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public StringBuilder getBookInfo(){
        StringBuilder book_description = new StringBuilder();
        book_description.append("Name: ");
        book_description.append(this.book_name);
        book_description.append(" ");
        book_description.append("ISBN: ");
        book_description.append(this.ISBN);
        book_description.append(" ");
        book_description.append("Author: ");
        book_description.append(this.author_name);
        book_description.append(" ");
        book_description.append("Publisher: ");
        book_description.append(this.publisher);
        return book_description;
    };

}
