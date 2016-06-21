package com.olaide.members;
import com.olaide.main.Member;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MembersQueue {

    private Queue<Member> memberQueue;

    private Comparator<Member> comparator  = new Comparator<Member>() {
        @Override
        public int compare(Member firstMember, Member secondMember) {
            if (firstMember.getClass() == secondMember.getClass()) {
                return firstMember.getDateOfReg().compareTo(secondMember.getDateOfReg());
            }
            else {
                if (secondMember instanceof Staff) {
                    return 1;
                }
                return -1;
            }
        }
    };


    public MembersQueue() {
        memberQueue = new PriorityQueue<Member>(10, comparator);
    }

    public void addMember(Member member){
        memberQueue.add(member);
    }

    public Member removeMember(){
        return memberQueue.poll();
    }

    public Queue<Member> getMemberQueue() {
        return memberQueue;
    }

    public void setMemberQueue(Queue<Member> memberQueue) {
        this.memberQueue = memberQueue;
    }
}
