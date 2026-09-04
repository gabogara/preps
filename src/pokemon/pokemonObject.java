package pokemon;

import java.util.Scanner;

public class pokemonObject {
    public static void main(String[] args) {
        System.out.println("Creating a Pokemon object");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the pokemon: ");
        String pokeName = input.nextLine();
        System.out.println("Please enter the health' value");
        int healthValue = Integer.parseInt(input.nextLine());

                PokemonClass pokemon = new PokemonClass(pokeName,healthValue);
        System.out.println("You have created a pokemon: "+ pokemon.getName());


    }
}
