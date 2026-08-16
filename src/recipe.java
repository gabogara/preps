import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        System.out.println("******* Recipe Store App ************");
        System.out.println("Enter recipe' name: ");
        Scanner input = new Scanner(System.in);
        String recipeName = input.nextLine();

        System.out.println("Enter ingredients: ");
        String recipeIng = input.nextLine();

    }
}
