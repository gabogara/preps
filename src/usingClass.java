import java.util.Scanner;

public class usingClass {
    public static void main(String[] args) {
        System.out.println("******* Exploring Class behavior **********");
        Scanner input = new Scanner(System.in);
        PezDispenser dispenser = new PezDispenser(" PEZ Spiderman");

        System.out.println("The instance of dispenser is: " + dispenser.getCharacterName());
        System.out.println("The amount candies in the PEZ dispenser initial is: " + dispenser.getPezCount());
        if(dispenser.isEmpty()){
            System.out.println("Do you want to fill the PEZ dispenser?");
            String answerFill = input.nextLine();
            if(answerFill.equalsIgnoreCase("yes")){
                System.out.println("Filling the dispenser with delicious PEZ...");
                dispenser.fill();
                System.out.printf("Now the dispenser now has: %d delicious PEZ%n", dispenser.getPezCount());

                System.out.println("Do you want a eat all candies?: ");
                String guilty = input.nextLine();
                if(guilty.equalsIgnoreCase("yes")){
                    while(dispenser.dispense()){
                        System.out.println("OM NOM NOM!");
                    }
                    System.out.println("Do you want to fill more PEZ in the dispenser? Yes / No");
                    String refill = input.nextLine();
                    if(refill.equalsIgnoreCase("yes")){
                        System.out.println("How many PEZ do you want to refill?");
                        int amount = Integer.parseInt(input.nextLine());
                        try{
                            dispenser.fill(amount);
                            System.out.printf("Perfect! Now you have: %d PEZ available!!!%n", dispenser.getPezCount());
                        }catch(IllegalArgumentException iae){
                            System.out.println("Whoa There!");
                            System.out.printf("The error was: %s%n", iae.getMessage());
                        }
                        System.out.println("The program has finished!!!");
                    }
                }
            }else{
                System.out.println("Is ok, go back soon!...");
            }
        }
    }
}
