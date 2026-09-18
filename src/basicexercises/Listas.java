package basicexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String>  myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");

        for( String element: myList){
            System.out.println(element);
        }

        System.out.println("Implementing Foreach:");
//        myList.forEach( element -> {
//            System.out.println("Element:" + element);
//        });
        myList.forEach(System.out::println);


        //Other way to create list
        List<String> names = Arrays.asList("Joshua", "Ivon", "Luis");
    }
}
