package oop_exercises.exercise_20;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[30];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book(
                    "Name "+ i,
                    i,
                    "Author Name " + i,
                    "Publisher" + i);
            books[i] = book;
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookInfo());
        }
    }
}
