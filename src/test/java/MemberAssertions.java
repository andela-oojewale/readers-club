import com.olaide.main.Member;
import org.junit.Test;
import static org.junit.Assert.*;


public class MemberAssertions {

    Member firstMember = new Member();
    Member secondMember = new Member();

    @Test
    public void membersAssertions() {
        assertNotNull(firstMember);
        assertNotSame(firstMember, secondMember);

        firstMember.setGender('M');
        assertEquals('M', firstMember.getGender());
    }

}
