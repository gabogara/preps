import java.util.Scanner;

public class emailGenerator {
    static String createEmail(String firstName,String lastName,String company,String domain){
        var fullName = String.join(".", firstName, lastName);
        var result = fullName + "@" + company + domain;
        return result;
    }
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Write your first name: ");
        String fName = input.nextLine();
        //String fName  = "Gabriel";
        System.out.println("Your first name is:" + fName);
        System.out.println("Enter your lastname");

        String lName = input.nextLine();
        System.out.println("Your last name is: "+ lName);
        String comp = "intuit";
        String dom = ".com";
        var result_function = createEmail(fName,lName,comp,dom);
        System.out.println("Your New email is: "+result_function);
    }
}
