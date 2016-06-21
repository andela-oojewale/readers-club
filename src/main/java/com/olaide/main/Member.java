package com.olaide.main;
import org.joda.time.DateTime;

public class Member {

    private String fullname;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;
    private char gender;
    private DateTime dateOfReg;

    public Member() {
    }

    public Member(String fullname, char gender, String dateOfBirth, String phoneNumber, String email) {
        this.fullname = fullname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;

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

    public DateTime getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(DateTime dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (gender != member.gender) return false;
        if (fullname != null ? !fullname.equals(member.fullname) : member.fullname != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(member.dateOfBirth) : member.dateOfBirth != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(member.phoneNumber) : member.phoneNumber != null) return false;
        if (email != null ? !email.equals(member.email) : member.email != null) return false;
        return dateOfReg != null ? dateOfReg.equals(member.dateOfReg) : member.dateOfReg == null;

    }

}
