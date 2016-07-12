package com.olaide;

import com.olaide.main.Book;
import com.olaide.main.Member;
import com.olaide.members.MembersQueue;
import com.olaide.members.Staff;
import com.olaide.members.Student;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static List<Member> members = new ArrayList<>();

    private static List<Book> books = new ArrayList<>();

    private static MembersQueue membersQueue = new MembersQueue();

   static BookManager manager;

    public static void main(String[] args) {
        createBooks();
        createMembers();
        
        manager = new BookManager(members, books);

        for (int i = 0; i < members.size(); i++) {
            borrowFromLib(members.get(i), books.get(0));
        }

        while (!membersQueue.getMemberQueue().isEmpty()) {
            String msg;
            Member currentBorrower = membersQueue.removeMember();
            Book bookToBorrow =  getRequestedBook(currentBorrower);
            if (bookToBorrow.getNumberOfCopies() > 0) {
                bookToBorrow.borrowBook();
                msg = currentBorrower.getFullname() + " borrowed the book: " +
                        bookToBorrow.getBookname() + ". " + bookToBorrow.getNumberOfCopies() +
                        " copies remaining.";
            }
            else {
                msg = "Hey " + currentBorrower.getFullname() + "! The book: '" +
                        bookToBorrow.getBookname() + "' is unavailable @tm. You could borrow another book.";
            }
            System.out.println(msg);
        }

    }

    public static void createMembers() {
        Member olaide = new Staff();
        olaide.setFullname("Olaide");
        olaide.setDateOfReg(new DateTime("2016-06-21T22:23:23.605+01:00"));
        Member oscar = new Staff();
        oscar.setFullname("Oscar");
        oscar.setDateOfReg(new DateTime("2016-07-21T22:23:23.605+01:00"));
        Member tipsy = new Student();
        tipsy.setFullname("Tipsy");
        tipsy.setDateOfReg(new DateTime("2016-07-21T22:23:23.605+01:00"));
        Member adeybee = new Student();
        adeybee.setFullname("Adeybee");
        adeybee.setDateOfReg(new DateTime("2016-06-21T22:23:23.605+01:00"));
        members.add(olaide);
        members.add(oscar);
        members.add(tipsy);
        members.add(adeybee);
    }


    public static void createBooks() {
        Book firstBook = new Book("Rich dad poor dad", "Robert Kiyosaki", 2, "ISBN001");
        Book secondBook = new Book("Beyond the upper room", "Kenneth Hagin", 1, "ISBN002");
        Book thirdBook = new Book("Walking in the miraculous", "David Oyedepo", 1, "ISBN003");
        Book fourthBook = new Book("21 laws of leadership", "John Maxwell", 3, "ISBN004");
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);
    }

    public static void borrowFromLib(Member member, Book book) {
        manager.borrowBook(member, book);
        membersQueue.addMember(member);
    }
    
    public static Book getRequestedBook(Member member){
        return manager.getRequest().get(member);
    }
}
