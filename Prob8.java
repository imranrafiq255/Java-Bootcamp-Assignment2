public class Prob8 {
    public static String stringReplacer(String s)
    {
        String newString = "";
        for (int i = 0; i < s.length(); i++)
        {
            if(!newString.contains(String.valueOf(s.charAt(i))))
            {
                newString+=s.charAt(i);
            }
        }
        return newString;
    }
    public static void main(String[] args)
    {
        System.out.println(stringReplacer("aba"));
    }
}
