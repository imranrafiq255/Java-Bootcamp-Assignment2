public class Prob7 {
    public static String stringPrefixer(String[] arr)
    {
        String firstWord = arr[0];
        char firstChar = firstWord.charAt(0);
        String newString = "";
        newString += firstChar;
        int length = arr.length;
        for (int i = 1; i < firstWord.length(); i++)
        {
            while(length > 0)
            {
                length--;
                if (!arr[length].contains(newString))
                {
                    return newString.substring(0,i-1);
                }
            }
            length = arr.length;
            newString += firstWord.charAt(i);
        }
        return newString;
    }
    public static void main(String[] args) {
        String []arr = {"dog","racecar","car"};
        System.out.println(stringPrefixer(arr).isEmpty() ? "There is no common prefix among the input strings." : stringPrefixer(arr));
    }
}
