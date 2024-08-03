import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to verify it is palindrome or not");
        String st1 = scan.next();
        String reversedString = "";
        for (int i = st1.length()-1; i >= 0 ; i--)
        {
            reversedString += st1.charAt(i);
        }
        if (st1.equals(reversedString))
            System.out.println(st1 + " is palindrome");
        else
            System.out.println(st1 + " is not palindrome");
    }
}
