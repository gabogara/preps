import java.util.Scanner;

public class ticketSelling {
    public static void main(String[] args) {

        double totalBeforeTaxes= 0.0;
        double productPrice = 0.0;
        double taxes;
        double total=0;
        int taxesPercent = 16;

        int exit = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Introduce the article' price: ");
            productPrice = Double.parseDouble(input.nextLine());
            totalBeforeTaxes += productPrice;
            System.out.println("""
                    \nDo you want to add more products to your cart? 
                    \tIf yes type: 1 
                    \tIf No type 0""");
            exit = Integer.parseInt(input.nextLine());
        }while (exit != 0);
        taxes = (totalBeforeTaxes * taxesPercent)/100;
        total = totalBeforeTaxes + taxes;

        System.out.printf("""
                \nPurchase Details:
                \tSubtotal: $%.2f
                \tTaxes (%d%%): $%.2f
                \tTotal Due $%.2f
                """, totalBeforeTaxes, taxesPercent ,taxes, total);
    }
}
