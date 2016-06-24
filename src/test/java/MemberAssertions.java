import com.olaide.main.Member;
import org.junit.Test;
import static org.junit.Assert.*;


public class MemberAssertions {

    @Test
    public void memberAssertions() {
        Member firstMember = new Member();
        Member secondMember = new Member();

        assertNotNull(firstMember);
    }



}
