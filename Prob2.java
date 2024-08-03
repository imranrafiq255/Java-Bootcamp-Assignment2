import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob2 {
    // Verify emails which are like f2020265096@umt.edu.pk or imran.malik@umt.edu.pk
    public static boolean emailVerifier(String email)
    {
        Pattern pattern = Pattern.compile("^[A-Za-z]+[0-9.]*[A-Za-z]*@(umt).(edu).(pk)");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your valid UMT Id");
        String email = scan.next();
        if (emailVerifier(email))
        {
            System.out.println("Valid email address");
        }
        else {
            System.out.println("Invalid email: " + email);
        }
    }
}
