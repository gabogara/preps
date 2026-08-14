import java.util.Scanner;

public class inOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();


        System.out.println("Enter price");
        double price = input.nextDouble();


        input.nextLine();
        System.out.println("Enter your Name");
        String name = input.nextLine();


        //parsing data
        System.out.println("Introduce an integer: ");
        int valueFromStr = Integer.parseInt(input.nextLine());
        System.out.println("The value is: " + valueFromStr + "Type of data: " + ((Object) valueFromStr).getClass().getSimpleName());

        System.out.println("Introduce a Double (Float): ");
        double valueFromStr2 = Double.parseDouble(input.nextLine());
        System.out.println("The value is: "+ valueFromStr2 + ((Object) valueFromStr2).getClass().getSimpleName());

    }
}
