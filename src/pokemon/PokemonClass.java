package pokemon;

public class PokemonClass {
    private static final int MAX_HEALTH = 100;
    private static final int MAX_MOVES = 4;
    private final String name;
    private int health;

    public PokemonClass(String name, int health)
    {
        this.name = name;
        this.health = health;
//        if(health <= MAX_HEALTH)
//        {
//            this.health = health;
//        }
    }
    public String getName(){
        return name;
    }
}
