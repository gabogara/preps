import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class authExercise {
    public static void main(String[] args) {
        System.out.println(" **** Welcome to the authentication system **** ");
        final String USERNAME = "Gabriel";
        final String PASSWORD = "1234ABC";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String dateAndTime = now.format(formatter);
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce your username: ");
        String user = input.nextLine();

        System.out.println("Introduce your password: ");
        String passw = input.nextLine();

        if( user.equals(USERNAME)  && passw.equals(PASSWORD) ){
            System.out.printf("""
                    \nWelcome %s!,
                    You're logged in: %s
                    """, user, dateAndTime);
        }else{
            System.out.println(" Invalid combination of user and password");
        }


    }
}
