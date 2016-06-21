import main.Member;
import members.Staff;
import members.Student;

import java.util.Date;

/**
 * Created by andela on 21/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        Date  date = new Date("Tue Jun 21 22:11:44 WAT 2016");
        Member olaide = new Staff();
        Member oscar = new Staff();
        Member tipsy = new Student();
        Member adebyi = new Student();

        System.out.println("date = " + date.toString());

    }
}
