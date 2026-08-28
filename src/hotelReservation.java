import java.util.Scanner;

public class hotelReservation {
    public static void main(String[] args) {
        System.out.println("*** Hotel Reservation System ***");

        // hotel's variables
        final var DAILY_RATE_WITHOUT_OCEAN_VIEW = 150.50;
        final var DAILY_RATE_WITH_OCEAN_VIEW = 190.50;

        // ask client information
        Scanner input = new Scanner(System.in);

        System.out.print("Client Name: ");
        var nameClient = input.nextLine();

        System.out.print("Number of nights: ");
        var numberOfNights = Integer.parseInt(input.nextLine());

        System.out.print("Con vista al mar (true/false)? ");
        var conVistaAlMar = Boolean.parseBoolean(input.nextLine());

        // total cost
        var totalCost = 0.0;
        if(conVistaAlMar)
            totalCost = numberOfNights * DAILY_RATE_WITH_OCEAN_VIEW;
        else
            totalCost = numberOfNights * DAILY_RATE_WITHOUT_OCEAN_VIEW;

        // Show reservation details
        System.out.printf("""
                %n------------ Reservation Details  -----------
                Client: %s
                Numbers of nights: %d
                Total Cost: $%.2f
                Room with an ocean view: %s
                """, nameClient, numberOfNights, totalCost,
                conVistaAlMar ? "Yes :)" : "No :(");

    }
}
