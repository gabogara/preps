import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        System.out.println("******* Recipe Store App ************");
        System.out.println("Enter recipe' name: ");
        Scanner input = new Scanner(System.in);
        String recipeName = input.nextLine();

        System.out.println("Enter ingredients: ");
        String recipeIng = input.nextLine();

        System.out.println("Enter prep time: ");
        int cookTime = Integer.parseInt(input.nextLine());

        System.out.println("Enter the difficulty: ");
        String difficulty = input.nextLine();


        System.out.println("The recipe is: " + recipeName);
        System.out.println("Ingredients are: " + recipeIng);
        System.out.println("Cook Time is: " + cookTime);
        System.out.println("Difficulty: " + difficulty);
    }
}
