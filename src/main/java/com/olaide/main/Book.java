package com.olaide.main;

public class Book {
    private String bookname;
    private String author;
    private Integer numberOfCopies;
    private String isbnNumber;

    public Book() {
    }

    public Book(String bookname, String author, Integer numberOfCopies, String isbnNumber) {
        this.bookname = bookname;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
        this.isbnNumber = isbnNumber;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void borrowBook(){
        if (this.getNumberOfCopies() > 0){
            Integer num_books_rem =  this.getNumberOfCopies() - 1;
            System.out.println(num_books_rem + " copies of the book '" + this.getBookname() + "' remaining");
            this.setNumberOfCopies(num_books_rem);
        }
        else {
            System.out.println("Book is currently unavailable. You can borrow another book.");
        }
    }

    public void returnBook() {
        this.setNumberOfCopies(this.getNumberOfCopies() + 1);
        System.out.println("Thanks for returning the book. The are now " +
                this.getNumberOfCopies() + " copies.");
    }


}
