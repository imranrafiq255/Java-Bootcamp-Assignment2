import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date in format of DD-MM-YYYY");

        String dateInput = scanner.next();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate parsedDate = LocalDate.parse(dateInput, inputFormatter);

            LocalDate newDate = parsedDate.plusDays(90);

            String formattedNewDate = newDate.format(inputFormatter);
            System.out.println("Date after adding 90 days: " + formattedNewDate);

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in DD-MM-YYYY format.");
        } finally {
            scanner.close();
        }
    }
}
