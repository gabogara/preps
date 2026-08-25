import java.util.Random;
import java.util.Scanner;

public class uniqueGenerator {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Random aleatory = new Random();
        int numAleatory = aleatory.nextInt(9999)+1;
        //System.out.println("Th aleatory number is: "+ numAleatory);
        String fixedNum = String.format("%04d", numAleatory);
        //System.out.println("fixedNum is = " + fixedNum);

        System.out.println("Welcome to the Unique ID Generator System");
        System.out.println("Please Introduce First Name: ");
        var firstName = input.nextLine();
        var firstTwoFirstName = firstName.trim().toUpperCase().substring(0,2);


        System.out.println("Please Introduce Last Name: ");
        var lastName = input.nextLine();
        var firstTwoLastName = lastName.trim().toUpperCase().substring(0,2);

        System.out.println("Please Introduce date of year (YYYY): ");
        int year = Integer.parseInt(input.nextLine());
        int twoLastNum = 0;
        twoLastNum = year % 100;


        String names = firstTwoFirstName + firstTwoLastName;
        String result = names + twoLastNum + fixedNum;

        System.out.printf("""
                \nHi %s,
                \tYour new ID generated is: %s
                \tCongrats!!
                """, firstName, result);

    }
}
