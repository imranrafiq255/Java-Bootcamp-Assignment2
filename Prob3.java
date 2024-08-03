import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prob3 {
    public static void main(String[] args)
    {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("20-5-2024")));
    }
}
