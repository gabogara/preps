import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "Gabriel");
        person.put("lastName", "Restrepo");
        person.put("age","29");
        // person.put("age","32"); //To modify the value of the key age...
        person.remove("lastName");

        System.out.println("The dictionary values are: ");
        person.entrySet().forEach(System.out::println);

        // also we can operate the key and value separately
        person.forEach((key, value) -> {
            System.out.println("key: "+ key + ", Value: " + value);
        });
    }
}
