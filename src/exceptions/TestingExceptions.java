package exceptions;

public class TestingExceptions {
    public static void main(String[] args) {
        String firstName = "Jose", lastName = "Perez";
        int age = 25;
        Person josePerez = new Person(firstName,lastName,age);

        try {
            josePerez.setAge(-25);
        }catch (IllegalArgumentException iae){
            System.out.println("That age could not be assigned:"+ iae.getMessage());
        }
    }
}
