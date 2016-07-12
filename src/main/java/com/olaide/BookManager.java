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

    private boolean isbookAvailable(Book book) {
        return books.contains(book);
    }

    private boolean isMemberRegistered(Member member) {
        return members.contains(member);
    }

    public void borrowBook(Member member, Book book){
        if (isMemberRegistered(member) && isbookAvailable(book)) {
            request.put(member, book);
        }
    }

    public Map<Member, Book> getRequest() {
        return request;
    }

//    public void borrowBook(){
//        this.setNumberOfCopies(this.getNumberOfCopies() - 1);
//    }
//
//    public void returnBook() {
//        this.setNumberOfCopies(this.getNumberOfCopies() + 1);
//        System.out.println("Thanks for returning the book. The are now " +
//                this.getNumberOfCopies() + " copies.");
//    }


}
