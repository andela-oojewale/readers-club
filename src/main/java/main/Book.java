package main;

public class Book {
    private String Bookname;
    private String Author;
    private String NumberOfCopies;
    private String IsbnNumber;

    public Book() {
    }

    public Book(String bookname, String author, String numberOfCopies, String isbnNumber) {
        Bookname = bookname;
        Author = author;
        NumberOfCopies = numberOfCopies;
        IsbnNumber = isbnNumber;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getNumberOfCopies() {
        return NumberOfCopies;
    }

    public void setNumberOfCopies(String numberOfCopies) {
        NumberOfCopies = numberOfCopies;
    }

    public String getIsbnNumber() {
        return IsbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        IsbnNumber = isbnNumber;
    }
}
