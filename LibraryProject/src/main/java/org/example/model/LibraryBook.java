package org.example.model;

public class LibraryBook {
    private String bookTitle;
    private String bookAuthor;
    private int id;
    private boolean available;
    private int numberOfCopies;


    public LibraryBook(String bookTitle, String bookAuthor, int numberOfCopies, int id, boolean available) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.numberOfCopies = numberOfCopies;
        this.id = id;
        this.available = available;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getId() {
        return id;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }


    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
