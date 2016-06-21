package members;
import main.Member;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMembers {

    private Queue<Member> memberQueue;

    private Comparator<Member> comparator  = new MemberComparator<>();


    public QueueMembers() {
        memberQueue = new PriorityQueue<>(0, comparator);
    }

    public void addMember(Member member){
        memberQueue.add(member);
    }

    public Member removeMember(){
        return memberQueue.poll();
    }

}
