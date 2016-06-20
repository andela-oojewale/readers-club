package main;
import java.util.Date;

public class Member {

    private String fullname;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;
    private char gender;
    private Date dateOfReg;

    public Member() {
    }

    public Member(String fullname, char gender, String dateOfBirth, String phoneNumber, String email) {
        this.fullname = fullname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfReg = new Date();
    }

    public void borrowBook(Book book) {

    }

    public Book returnBook(Book book) {
        return book;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }
}
