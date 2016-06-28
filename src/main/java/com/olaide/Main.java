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
        
        borrowFromLib(members.get(0), books.get(0));
        borrowFromLib(members.get(1), books.get(2));
        borrowFromLib(members.get(2), books.get(2));
        borrowFromLib(members.get(3), books.get(3));

        while (!membersQueue.getMemberQueue().isEmpty()) {
            Member currentBorrower = membersQueue.removeMember();
            Book bookToBorrow =  getRequestedBook(currentBorrower);
            System.out.println(currentBorrower.getFullname()
                    + " borrowed the book: "+ bookToBorrow.getBookname() + ".");
            bookToBorrow.borrowBook();
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
