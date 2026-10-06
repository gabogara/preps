package exceptions;

import exceptions.artihmetics.Person;

import java.util.Scanner;

public class TestingExceptions {
    private final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TestingExceptions testingExceptions = new TestingExceptions();
        testingExceptions.printMenu();
    }

    public void printMenu() {
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("Select an option: ");
            System.out.println("1) Create Person");
            System.out.println("2) Use the calculator");
            System.out.println("3) Quit");
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
                        handlePerson();
                        break;
                    case 2:
                        handleCalculator();
                        break;
                    case 3:
                        isQuit = true;
                        System.out.println("You selected: Quit. Good bye!");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (NumberFormatException e) {
                System.out.println("The option selected must be a number. Try again");
            }

        }
    }

    public void handleCalculator() {
        boolean finish = false;
        do {
            System.out.println("Enter the operation: ");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Go Back");
            try {
                int selection = Integer.parseInt(sc.nextLine());
                switch (selection) {
                    case 1:
                        System.out.println("You choose Addition");
                        break;
                    case 2:
                        System.out.println("You choose Subtraction");
                        break;
                    case 3:
                        System.out.println("You choose Multiplication");
                        break;
                    case 4:
                        System.out.println("You choose Division");
                        break;
                    case 5:
                        System.out.println("You choose Go Back");
                        finish = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (NumberFormatException e) {
                System.out.println("The option selected must be a number. Try again");
            }

        } while (!finish);
    }

    public void handlePerson() {
        String firstName;
        String lastName;
        int age;
        System.out.println("Enter first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter age: ");
        try {
            age = Integer.parseInt(sc.nextLine());
            Person person = new Person(firstName, lastName, age);
            System.out.println("You entered: " + person);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number. Try again");
        }
    }
}
