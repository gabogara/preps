import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");
        System.out.println("Elements in the Set");
        conjunto.forEach(System.out::println);

        conjunto.remove("Karla");
        System.out.println("\nAfter remove:  ");
        conjunto.forEach(System.out::println);
    }
}
