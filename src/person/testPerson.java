package person;

import java.util.Scanner;

public class testPerson {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the person First Name: ");
        String firstName = console.nextLine();
        System.out.println("Please enter the person Last Name: ");
        String lastName = console.nextLine();
        String email = firstName + "." + lastName + "@company.com";

        Person ing1 = new Person(firstName,lastName,email);
        System.out.printf("It has been created the person %s in the system %n, the work email address is %s", ing1.getPerson(), ing1.getEmail());

    }
}
