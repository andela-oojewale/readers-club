package com.olaide;

import com.olaide.main.Member;
import com.olaide.members.MembersQueue;
import com.olaide.members.Staff;
import com.olaide.members.Student;
import org.joda.time.DateTime;


public class Main {
    public static void main(String[] args) {
        DateTime date =  DateTime.now();
        Member olaide = new Staff();
        olaide.setFullname("Olaide");
        olaide.setDateOfReg(new DateTime("2016-06-21T22:23:23.605+01:00"));
        Member oscar = new Staff();
        oscar.setFullname("Oscar");
        oscar.setDateOfReg(new DateTime("2016-07-21T22:23:23.605+01:00"));
        Member tipsy = new Student();
        tipsy.setFullname("Tipsy");
        tipsy.setDateOfReg(new DateTime("2016-07-21T22:23:23.605+01:00"));
        Member adebyi = new Student();
        adebyi.setFullname("Adebiyi");
        adebyi.setDateOfReg(new DateTime("2016-06-21T22:23:23.605+01:00"));

        MembersQueue members = new MembersQueue();
        members.addMember(olaide);
        members.addMember(adebyi);
        members.addMember(tipsy);
        members.addMember(oscar);
        while (!members.getMemberQueue().isEmpty()){
            System.out.println("com.olaide.members = " + members.removeMember().getFullname());
        }

    }
}
