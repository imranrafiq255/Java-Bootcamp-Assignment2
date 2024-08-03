import java.util.Scanner;

public class Prob6 {
    public static boolean stringChecker(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
            {
                if (!s.contains(")"))
                {
                    return false;
                }
            }
            if (s.charAt(i) == '{')
            {
                if(!s.contains("}"))
                {
                    return false;
                }
            }
            if (s.charAt(i) == '[')
            {
                if(!s.contains("]"))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String myString = "[]{}()";
        String s = scanner.next();
        System.out.println(stringChecker(s) ? "String is valid" : "String is invalid");
    }
}
