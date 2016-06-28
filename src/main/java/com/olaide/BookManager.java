package com.olaide;

import com.olaide.main.Book;
import com.olaide.main.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookManager {

    private List<Member> members;

    private List<Book> books;

    private Map<Member, Book> request;

    public BookManager(List<Member> members, List<Book> books) {
        this.members = members;
        this.books = books;
        request = new HashMap<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private boolean isbookAvailable(Book book) {
        return books.contains(book);
    }

    private boolean isMemberRegistered(Member member) {
        return members.contains(member);
    }

    public void borrowBook(Member member, Book book){
//        if (isMemberRegistered(member) && isbookAvailable(book)) {
            request.put(member, book);
        //}
    }

    public Map<Member, Book> getRequest() {
        return request;
    }

//    public void borrowBook(){
//        if (this.getNumberOfCopies() > 0){
//            System.out.println("You have been borrowed book with title '" + this.getBookname()+"'. "+
//                    (this.getNumberOfCopies() - 1) + " copies remaining");
//            this.setNumberOfCopies(this.getNumberOfCopies() - 1);
//
//        }
//        else {
//            System.out.println("Book is currently unavailable. You can borrow another book.");
//        }
//    }
//
//    public void returnBook() {
//        this.setNumberOfCopies(this.getNumberOfCopies() + 1);
//        System.out.println("Thanks for returning the book. The are now " +
//                this.getNumberOfCopies() + " copies.");
//    }
}
