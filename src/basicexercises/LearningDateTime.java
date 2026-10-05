package basicexercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearningDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   // Current date
        LocalTime time = LocalTime.now();   // Current time
        // dateTime with current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        // dateTime variable
        System.out.println("Current Date-Time: " + dateTime);

        // Formatted DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDateTime);

    }
}