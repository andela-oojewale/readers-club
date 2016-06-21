package com.olaide.members;

import com.olaide.main.Member;

import java.util.Comparator;

/**
 * Created by andela on 21/06/2016.
 */
public class MemberComparator<T extends Member> implements Comparator<T> {
    @Override
    public int compare(T firstMember, T secondMember) {
        if (firstMember.getClass() == secondMember.getClass()) {
            return firstMember.getDateOfReg().compareTo(secondMember.getDateOfReg());
        }
        else {
            if (secondMember instanceof Staff) {
                return -1;
            }
            return 1;
        }
    }
}
